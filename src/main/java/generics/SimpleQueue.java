package generics;

import java.util.*;

public class SimpleQueue<T> implements Iterable<T> {
    private final LinkedList<T> storage = new LinkedList<>();
    public void add(T t) { storage.offer(t); }
    public T get() { return storage.poll(); }
    @Override public Iterator<T> iterator() {
        return storage.iterator();
    }
}

