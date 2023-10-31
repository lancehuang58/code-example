package generics;

class GenericBase<T> {
    private T element;

    public T get() {
        return element;
    }

    public void set(T element) {
        this.element = element;
    }
}

class Derived1<T> extends GenericBase<T> {}
class Derived2 extends GenericBase {}

public class ErasureAndInheritance {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object o = d2.get();
        d2.set(o);
    }
}
