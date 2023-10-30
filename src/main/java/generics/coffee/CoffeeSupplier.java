package generics.coffee;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.function.Supplier;

import static java.util.concurrent.ThreadLocalRandom.current;

public class CoffeeSupplier implements Supplier<Coffee>, Iterable<Coffee> {
    private int size = 0;

    public CoffeeSupplier(int size) {
        this.size = size;
    }

    public CoffeeSupplier() {
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
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
            return CoffeeSupplier.this.get();
        }
    }

    @Override
    public Coffee get() {
        try {
            int index = current().nextInt(Coffee.COFFEE_TYPES.length);
            return (Coffee) Coffee.COFFEE_TYPES[index]
                    .getDeclaredConstructor().newInstance();
        } catch (IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

}
