package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.concurrent.ThreadLocalRandom.current;
import static range.Range.range;

/**
 * generics random list
 *
 * @param <T>
 */
public class RandomList<T> {
    private final List<T> storage = new ArrayList<>();

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(current().nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        for (String s : "to be or not to be".split(" ")) {
            randomList.add(s);
        }
        Arrays.stream(range(5)).forEach(
            i -> System.out.println(randomList.select()));
    }
}
