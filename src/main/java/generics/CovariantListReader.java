package generics;

import java.util.Arrays;
import java.util.List;

public class CovariantListReader {

    public static <T> void read(List<? extends T> list){
        for (T t : list) {
            System.out.print(t+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        read(Arrays.asList(1, 2, 3, 4, 5));
        read(Arrays.asList(new Apple(), new Apple()));
    }

}
