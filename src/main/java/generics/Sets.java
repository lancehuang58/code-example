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

    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> t = new HashSet<>(superset);
        t.removeAll(subset);
        return t;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
