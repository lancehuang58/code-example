package generics;

import generics.watercolors.Watercolors;

import java.util.EnumSet;

import static generics.Sets.*;

public class WatercolorSets {
    public static void main(String[] args) {
        var set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        var set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println();
        System.out.println("union(set1, set2) = " + union(set1, set2));
        System.out.println();
        System.out.println("intersection(set1, set2) = " + intersection(set1, set2));
        System.out.println();
        System.out.println("difference(set1, set2) = " + difference(set1, set2));
        System.out.println();
        System.out.println("complement(set1, set2) = " + complement(set1, set2));
    }
}
