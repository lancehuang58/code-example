package generics;


abstract class GenericWithCreate<T> {
    final T elemnt;

    GenericWithCreate() {
        this.elemnt = create();
    }

    abstract T create();
}

class X {}

class XCreator extends GenericWithCreate<X> {

    @Override
    X create() {
        return new X();
    }

    void print() {
        System.out.println(elemnt.getClass().getSimpleName());
    }
}

public class CreatorGeneric {
    public static void main(String[] args) {
        var creator = new XCreator();
        creator.print();
    }
}
