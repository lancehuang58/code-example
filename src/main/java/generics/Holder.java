package generics;

import java.util.Objects;

public class Holder <T>{
    private T a;

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Holder<?> && Objects.equals(a, ((Holder)obj).a);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a);
    }

    public static void main(String[] args) {
        Holder<Integer> holder = new Holder<>();
        holder.set(1);
        System.out.println("holder.get() = " + holder.get());
    }
}
