package generics;

import java.awt.*;

class HoldItem<T> {
    T item;

    public HoldItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class WithColor2<T extends HasColor> extends HoldItem<T> {

    public WithColor2(T item) {
        super(item);
    }

    Color color() {
        return item.getColor();
    }
}

class WithColorCoord2<T extends Coord & HasColor> extends WithColor2<T> {

    public WithColorCoord2(T item) {
        super(item);
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

class Solid2<T extends Coord & HasColor & Weight> extends WithColorCoord2<T> {
    public Solid2(T item) {
        super(item);
    }

    int weight() {
        return item.weight();
    }
}


public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> solid2 = new Solid2<>(new Bounded());
        System.out.println("solid2.weight() = " + solid2.weight());
        System.out.println("solid2.getY() = " + solid2.getY());
        System.out.println("solid2.color() = " + solid2.color());
    }
}
