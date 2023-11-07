package generics;


public class SelfBounding<T extends SelfBounding<T>> {
    T element;

    SelfBounding<T> set(T arg) {
        element = arg;
        return this;
    }

    T get() {
        return element;
    }
}

class A extends SelfBounding<A> {}

class B extends SelfBounding<B> {}

class C extends SelfBounding<C> {
    C setAndGet(C arg) {set(arg); return get();}
}

class D{}

class E extends SelfBounding {}