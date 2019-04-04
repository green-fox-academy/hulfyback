package solutions.variables;

import solutions.Decoration;

public class Swap {
  public static void swap(int a, int b) {
    Decoration.decorate("08");
    // Swap the values of the variables
    // a = 123;
    // b = 526;
    System.out.println("a: " + a);
    System.out.println("b: " + b);

    int temp = a;
    a = b;
    b = temp;

    System.out.println("After swap: ");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }
}
