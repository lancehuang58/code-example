package onjava.range;

import static onjava.range.Range.range;

public class ForInt {

  public static void main(String[] args) {
	for (int i : range(10)) {
	  System.out.print(i + " ");
	}
	System.out.println();
	for (int i : range(5, 9)) {
	  System.out.print(i + " ");
	}
	System.out.println();
	for (int i : range(5, 20, 3)) {
	  System.out.print(i + " ");
	}
	System.out.println();
	for (int i : range(20, 5, -3)) {
	  System.out.print(i + " ");
	}
  }
}
