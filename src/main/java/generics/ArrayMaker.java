package generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {

    private final Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    public T[] create(final int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> maker = new ArrayMaker<>(String.class);
        String[] strings = maker.create(10);
        System.out.println(Arrays.toString(strings));
    }
}
