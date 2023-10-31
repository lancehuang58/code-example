package generics;

import java.util.function.Supplier;

import static java.util.concurrent.ThreadLocalRandom.current;

public class Product {
    private final int id;
    private final String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(" %d\t:%s,price:$%f", id, description, price);
    }

    public void priceChange(double change) {
        this.price += change;
    }

    public static Supplier<Product> generator = Product::randomProduct;

    private static Product randomProduct() {
        return new Product(current().nextInt(100), "Test",
            Math.round(current().nextDouble() * 1000.0) + 0.99);
    }

}
