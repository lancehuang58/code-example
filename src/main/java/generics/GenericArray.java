package generics;

import static range.Range.range;

public class GenericArray<T> {
    private final T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int size) {
        this.array = (T[]) new Object[size];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public void print() {
        for (T t : array) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        GenericArray<Integer> genericArray = new GenericArray<>(10);
        for (int i : range(0, 10)) {
            genericArray.put(i, i);
        }
        genericArray.print();
    }
}
