package generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArrayWithTypeToken<T> {

    private final T[] array;

    @SuppressWarnings("unchecked")
    GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int i) {
        return array[i];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<>(Integer.class,10);
        Integer[] rep = gai.rep();
        System.out.println(Arrays.toString(rep));
    }
}
