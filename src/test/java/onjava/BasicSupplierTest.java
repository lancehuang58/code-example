package onjava;

import generics.CountedObject;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

class BasicSupplierTest {
    @Test
    void test() {
        Stream.generate(BasicSupplier.create(CountedObject.class))
              .limit(5).forEach(System.out::println);
    }
}