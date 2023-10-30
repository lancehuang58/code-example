package generics;

import org.junit.jupiter.api.Test;

class IterableFibonacciTest {
    @Test
    void test() {

        for (Integer i : new IterableFibonacci(10)) {
            System.out.print(i + " ");
        }
    }
}