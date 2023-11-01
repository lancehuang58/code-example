package generics;

import java.util.Arrays;
import java.util.List;

public class GenericReading {
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruits = Arrays.asList(new Fruit());

    static <T> T readExact(List<T> list) {
        return list.get(0);
    }

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }

    static class CovariantReader<T>
    {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }

    static void f1() {
        Apple apple = readExact(apples);
        System.out.println("apple = " + apple);
        Fruit fruit = readExact(fruits);
        System.out.println("fruit = " + fruit);
        fruit = readExact(apples);
        System.out.println("fruit = " + fruit);
    }

    static void f2() {
        Reader<Fruit> reader = new Reader<>();
        Fruit fruit = reader.readExact(fruits);
        System.out.println("fruit = " + fruit);
//        reader.readExact(apples);
    }

    static void f3() {
        CovariantReader<Fruit> fruitCovariantReader = new CovariantReader<>();
        Fruit fruit = fruitCovariantReader.readCovariant(apples);
        System.out.println("fruit = " + fruit);
        Fruit fruit1 = fruitCovariantReader.readCovariant(fruits);
        System.out.println("fruit1 = " + fruit1);

        CovariantReader<Apple> appleCovariantReader = new CovariantReader<>();
        Apple apple = appleCovariantReader.readCovariant(apples);

//        appleCovariantReader.readCovariant(fruits); won't work
    }


    public static void main(String[] args) {
//        f1();
//        f2();
        f3();

    }

}
