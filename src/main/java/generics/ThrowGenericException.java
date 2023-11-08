package generics;


import java.util.ArrayList;
import java.util.List;

interface Processor<T, E extends Exception> {
    void process(List<T> collector) throws E;
}

class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {
    List<T> processAll() throws E {
        List<T> collector = new ArrayList<>();
        for (Processor<T, E> processor : this) {
            processor.process(collector);
        }
        return collector;
    }
}

class Failure1 extends Exception {

}

class Processor1 implements Processor<String, Failure1> {

    static int count = 3;

    @Override
    public void process(List<String> collector) throws Failure1 {
        if (count-- > 1) {
            collector.add("help");
        } else {
            collector.add("ho");
        }
        if (count < 0) {
            throw new Failure1();
        }
    }
}

class Failure2 extends Exception {

}

class Processor2 implements Processor<Integer, Failure2> {

    static int count = 2;

    @Override
    public void process(List<Integer> collector) throws Failure2 {
        if (count-- > 1) {
            collector.add(47);
        } else {
            collector.add(11);
        }
        if (count < 0) {
            throw new Failure2();
        }
    }
}


public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String, Failure1> runner = new ProcessRunner<>();
        for (int i = 0; i < 3; i++) {
            runner.add(new Processor1());
        }
        try {
            runner.processAll();
        } catch (Failure1 failure1) {
            System.err.println(failure1.getMessage());
        }
    }

}
