package generics;

class Subtype extends BasicHolder<Subtype> {

}

public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype s1 = new Subtype(), s2 = new Subtype();
        s1.set(s2);
        Subtype s3 = s1.get();
        s3.print();
    }
}
