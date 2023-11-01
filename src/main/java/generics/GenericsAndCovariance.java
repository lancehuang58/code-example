package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsAndCovariance
{

    public static void main(String[] args) {
    List<? extends Fruit> flist = new ArrayList<>();
//        flist.add(new Fruit());
//        flist.add(new Apple());
        flist = Arrays.asList(new Fruit());

        Fruit fruit = flist.get(0);
        System.out.println(fruit.getId());
    }
}
