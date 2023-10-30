package generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        return Arrays.stream(args).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var ls = makeList("A");
        System.out.println("ls = " + ls);
        var ls2 = makeList("A", "C");
        System.out.println("ls2 = " + ls2);
        var ls3 = makeList("ABC".split(""));
        System.out.println("ls3 = " + ls3);
    }
}
