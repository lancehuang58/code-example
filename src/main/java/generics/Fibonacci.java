package generics;

import java.util.function.Supplier;

public class Fibonacci implements Supplier<Integer> {

    private int count = 0;

    private int fib(int n) {
        if (n < 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    @Override
    public Integer get() {
        return fib(count++);
    }
}
