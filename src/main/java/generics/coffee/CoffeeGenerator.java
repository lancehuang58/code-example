package generics.coffee;

import util.Generator;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;

import static java.util.concurrent.ThreadLocalRandom.current;
import static range.Range.range;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private int size = 0;

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }


    public Coffee next() {
        try {
            int selectedClassIndex = current().nextInt(Coffee.COFFEE_TYPES.length);
            return (Coffee) Coffee.COFFEE_TYPES[selectedClassIndex].getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException |
                 InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        Arrays.stream(range(5))
              .forEach(i -> System.out.println(gen.next()));

        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }

    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }
}
