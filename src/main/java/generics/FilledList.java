package generics;

import onjava.Suppliers;

import java.util.ArrayList;
import java.util.function.Supplier;

public class FilledList<T> extends ArrayList<T> {
    FilledList(Supplier<T> gen, int size) {
        Suppliers.fill(this, gen, size);
    }

    FilledList(T t, int size) {
        for (int i = 0; i < size; i++) {
            this.add(t);
        }
    }

    public static void main(String[] args) {
        var hello = new FilledList<>("Hello", 5);
        System.out.println(hello);
        var list47 = new FilledList<>(() -> 47, 5);
        System.out.println(list47);
    }
}
