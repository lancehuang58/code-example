package generics.coffee;

public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
    public static Class<?>[] COFFEE_TYPES = {Latte.class, Mocha.class, Cappuccino.class
    , Americano.class, Breve.class};
    static class Latte extends  Coffee{}
    static class Mocha extends  Coffee{}
    static class Cappuccino extends  Coffee{}
    static class Americano extends  Coffee{}
    static class Breve extends  Coffee{}
}
