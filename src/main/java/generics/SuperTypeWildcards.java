package generics;

import java.util.ArrayList;
import java.util.List;

public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        print(apples);
    }

    private static void print(List<? super Apple> apples) {
        for (Object apple : apples) {
            Apple o = (Apple) apple;
            System.out.println(o.getId());
        }
    }

    public static void main(String[] args) {
        writeTo(new ArrayList<>());
    }
}
