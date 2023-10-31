package onjava;

import generics.Sets;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectionMethodDifferences {

    static Set<String> methodSet(Class<?> type) {
        return Arrays.stream(type.getMethods())
                     .map(Method::getName)
                     .collect(toCollection(TreeSet::new));
    }

    static void interfaces(Class<?> type) {
        System.out.println("Interfaces in " + type.getSimpleName() + ": ");
        System.out.println(Arrays.stream(type.getInterfaces()).map(Class::getSimpleName).collect(toList()));
    }

    static Set<String> object = methodSet(Object.class);
    static {
        object.add("clone");
    }

    static void difference(Class<?> superset, Class<?> subset) {
        System.out.println("######");
        System.out.print(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
        var difference = Sets.difference(methodSet(superset), methodSet(subset));
        difference.removeAll(object);
        System.out.println(difference);
        interfaces(superset);
        System.out.println("######");
    }

    public static void main(String[] args) {
//        System.out.println("Collection: " + methodSet(Collection.class));
//        interfaces(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
    }
}
