package generics.coffee;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CoffeeSupplierTest {

    @Test
    void test() {
        var coffeeList =
            Stream.generate(new CoffeeSupplier()).limit(5).toList();
        assertThat(coffeeList)
            .hasSize(5)
            .allSatisfy(coffee -> assertThat(coffee).isInstanceOf(Coffee.class))
        ;
    }

    @Test
    void test2() {
        for (var coffee : new CoffeeSupplier(5)) {
            assertThat(coffee).isInstanceOf(Coffee.class);
        }
    }
}