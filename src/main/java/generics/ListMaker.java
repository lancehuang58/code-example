package generics;

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {
    List<T> create() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ListMaker<String> listMaker = new ListMaker<>();
        List<String> strings = listMaker.create();
        System.out.println(strings);
    }
}
