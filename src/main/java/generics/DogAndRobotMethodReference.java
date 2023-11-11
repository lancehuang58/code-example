package generics;


import java.util.function.Consumer;

class Dog {
    public void speak() {
        System.out.println("wof");
    }

    public void sit() {
        System.out.println("sit");
    }

    public void reproduct() {

    }
}

class Robot {
    public void speak() {
        class A {
            void aa() {
                System.out.println("Aa");
            }
        }
        A a = new A();
        a.aa();
        System.out.println("B1");
    }

    public void sit() {
        System.out.println("sit");
        class Bb{
            void sit() {
                System.out.println("robot sit");
            }
        }
        new Bb().sit();
    }
}

class CommunicateA {
    public static <P> void perform(P p, Consumer<P> c1, Consumer<P> c2) {
        c1.accept(p);
        c2.accept(p);
    }
}

public class DogAndRobotMethodReference {
    public static void main(String[] args) {
        CommunicateA.perform(new Dog(), Dog::speak, Dog::sit);
        CommunicateA.perform(new Robot(), Robot::speak, Robot::sit);
    }
}
