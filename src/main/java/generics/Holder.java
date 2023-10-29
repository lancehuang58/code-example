package generics;

public class Holder <T>{
    private T a;

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder<Integer> holder = new Holder<>();
        holder.set(1);
        System.out.println("holder.get() = " + holder.get());
    }
}
