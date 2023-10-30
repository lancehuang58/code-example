package generics;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

    private int n;

    public IterableFibonacci(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.get();
            }
        };
    }
}
