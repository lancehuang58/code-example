package generics;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics<T> {

    private List<T> array = new ArrayList<>();

    public void add(T t) {
        array.add(t);
    }

    public T get(int index) {
        return array.get(index);
    }
}
