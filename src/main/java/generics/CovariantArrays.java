package generics;

import java.util.StringJoiner;

class Fruit {
    protected static int count = 0;
    protected int id = count++;
    protected int getId() {
        return id;
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", getClass().getSimpleName() + "[", "]")
            .add("id=" + id)
            .toString();
    }
}

class Apple extends Fruit {

}

class Jonathan extends Apple {}

class Orange extends Fruit {}


public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
        try {

            fruits[2] = new Fruit();
            fruits[3] = new Orange();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
