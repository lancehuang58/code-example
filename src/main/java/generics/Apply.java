package generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Apply {
    public static <T, S extends Iterable<T>> void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq) {
                f.invoke(t, args);
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
