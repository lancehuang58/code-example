package generics;

public class BasicHolder<T> {
    T element;

    void set(T t) {
        element = t;
    }

    T get() {
        return element;
    }

    void print() {
        System.out.println(element.getClass().getSimpleName());
    }
}
