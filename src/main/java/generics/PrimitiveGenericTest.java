package generics;

import onjava.Suppliers;

import java.util.Arrays;
import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

interface FillArray {

    static <T> T[] fill(T[] a, Supplier<T> gen) {
        Arrays.setAll(a, n -> gen.get());
        return a;
    }

    static int[] fill(int[] a, IntSupplier gen) {
        Arrays.setAll(a, n -> gen.getAsInt());
        return a;
    }

    static long[] fill(long[] a, LongSupplier gen) {
        Arrays.setAll(a, n -> gen.getAsLong());
        return a;
    }

    static double[] fill(double[] a, DoubleSupplier gen) {
        Arrays.setAll(a, n -> gen.getAsDouble());
        return a;
    }
}

public class PrimitiveGenericTest {
    public static void main(String[] args) {
        String[] fill = FillArray.fill(new String[5], () -> "123");
        System.out.println("Arrays.toString(fill) = " + Arrays.toString(fill));
        int[] fill1 = FillArray.fill(new int[9], () -> new Random().nextInt(100));
        System.out.println("Arrays.toString(fill1) = " + Arrays.toString(fill1));
    }
}
