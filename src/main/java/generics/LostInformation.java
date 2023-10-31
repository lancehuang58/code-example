package generics;

import java.util.*;

class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<P, M> {}


public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));

        Map<Frob, Fnorkle> map = new HashMap<>();
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));

        Quark<Fnorkle> quark = new Quark<>();
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));


    }
}
