package generics;

import onjava.Suppliers;

import java.util.ArrayList;

//class CheckoutStand {}
//
//class Office {}

class Shelf extends ArrayList<Product> {
    Shelf(int nProducts) {
        Suppliers.fill(this, Product.generator, nProducts);
    }
}

class Aisle extends ArrayList<Shelf> {
    Aisle(int nShelfs, int nProducts) {
        for (int i = 0; i < nShelfs; i++) {
            add(new Shelf(nProducts));
        }
    }
}


public class Store extends ArrayList<Aisle> {
//    private ArrayList<CheckoutStand> checkoutStands = new ArrayList<CheckoutStand>();
//    private Office office = new Office();

    Store(int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Aisle shelves : this) {
            for (Shelf shelf : shelves) {
                for (Product product : shelf) {
                    sb.append(product);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();

//       return  this.stream()
//                                 .flatMap(Collection::stream)
//                                 .flatMap(Collection::stream)
//                                    .map(Product::toString)
//                                 .collect(joining("\n"));
    }

    public static void main(String[] args) {
        System.out.println(new Store(5, 4, 3));
    }
}
