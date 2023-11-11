package generics;

import onjava.Suppliers;

import java.util.ArrayList;
import java.util.List;

public class ApplyTest {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = Suppliers.create(ArrayList::new, Shape::new, 3);
        Apply.apply(shapes, Shape.class.getDeclaredMethod("rotate"));
        Apply.apply(shapes, Shape.class.getDeclaredMethod("resize", int.class), 7);
        System.out.println();
        List<Square> squares = Suppliers.create(ArrayList::new, Square::new, 3);
        Apply.apply(squares, Shape.class.getDeclaredMethod("rotate"));
        Apply.apply(squares, Shape.class.getDeclaredMethod("resize", int.class), 7);
        System.out.println();

        Apply.apply(new FilledList<>(Shape::new, 3), Shape.class.getDeclaredMethod("rotate"));
        Apply.apply(new FilledList<>(Square::new, 3), Shape.class.getDeclaredMethod("rotate"));

        SimpleQueue<Shape> shape1 = Suppliers.fill(new SimpleQueue<>(), SimpleQueue::add, Shape::new, 3);
        SimpleQueue<Shape> shape2 = Suppliers.fill(new SimpleQueue<>(), SimpleQueue::add, Square::new, 3);
        Apply.apply(shape1, Shape.class.getMethod("rotate"));
    }
}
