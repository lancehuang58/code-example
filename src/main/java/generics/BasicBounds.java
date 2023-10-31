package generics;


import java.awt.*;

interface HasColor {
    Color getColor();
}

class WithColor<T extends HasColor> {
    T item;

    WithColor(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color getColor() {
        return item.getColor();
    }
}

class Coord {
    public int x, y, z;
}

class WithColorCoord<T extends Coord & HasColor> {
    T item;

    public WithColorCoord(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

interface Weight {
    int weight();
}

class Solid<T extends Coord & HasColor & Weight> {
    T item;

    public Solid(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color getColor() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

    int weight() {
        return item.weight();
    }
}

class Bounded extends Coord implements HasColor, Weight {

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        Color color = solid.getColor();
        System.out.println("color = " + color);
        int y = solid.getY();
        System.out.println("y = " + y);
        int weight = solid.weight();
        System.out.println("weight = " + weight);
    }
}
