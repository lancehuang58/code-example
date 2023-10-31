package generics;


import onjava.Suppliers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class IntegerFactory implements Supplier<Integer> {
    private int i = 0;

    @Override
    public Integer get() {
        return i++;
    }
}

class Widget {

    private final int id;

    Widget(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + id;
    }

    public static class Factory implements Supplier<Widget> {
        private int i = 0;

        @Override
        public Widget get() {
            return new Widget(++i);
        }
    }
}

class Fudge {
    private static int count = 1;
    private final int n = count++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + n;
    }
}

class Foo2<T> {

    private final List<T> x = new ArrayList<>();

    Foo2(Supplier<T> factory) {
        Suppliers.fill(x, factory, 3);
    }

    @Override
    public String toString() {
        return x.toString();
    }
}

public class FactoryConstraint {

    public static void main(String[] args) {
        System.out.println(new Foo2<>(new IntegerFactory()));
        System.out.println(new Foo2<>(new Widget.Factory()));
        System.out.println(new Foo2<>(Fudge::new));
    }
}
