package generics;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        var t = new HashSet<>(a);
        t.addAll(b);
        return t;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        var t = new HashSet<>(a);
        t.retainAll(b);
        return t;
    }
}
