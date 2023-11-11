package generics;

import java.util.StringJoiner;

public class Shape {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
            .add("id=" + id)
            .toString();
    }

    public void rotate() {
        System.out.println(this + " rotate");
    }

    public void resize(int size) {
        System.out.println(this + " resize " + size);
    }
}
