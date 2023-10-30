package generics;

public class GenericMethods {
    public <T> void f(T t) {
        System.out.println(t.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods g = new GenericMethods();
        g.f("");
        g.f(1);
        g.f(1.0);
        g.f(1.0f);
        g.f('c');
        g.f(g);
    }
}
