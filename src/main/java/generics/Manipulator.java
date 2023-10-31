package generics;

class HasF {
    public void f() {
        System.out.println("method f()");
    }
}

public class Manipulator<T extends HasF> {

    private final T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    public void manipulate() {
        obj.f();
    }
}
