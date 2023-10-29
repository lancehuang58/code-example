package ploymorphism;

public class FieldAccess {
    public static void main(String[] args) {
        
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field);
        System.out.println("sup.getField() = " + sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field);
        System.out.println("sub.getField() = " + sub.getField());

    }
}
