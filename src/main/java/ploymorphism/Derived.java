package ploymorphism;

public class Derived extends Base {

    void process() {
        //do nothing
        System.out.println("processing from Derived");
    }

    public static void main(String[] args) {
        Base d = new Derived();
        d.process();

    }
}
