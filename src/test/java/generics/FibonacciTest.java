package generics;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

class FibonacciTest {
    @Test
    void test() {
        Stream.generate(new Fibonacci()).limit(5).map(n -> n + " ").forEach(System.out::print);

    }

}