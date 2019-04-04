package solutions.types;

import solutions.Decoration;

public class TwoNumbers {
  public static void twoNumbers(int a, int b) {
    Decoration.decorate("05");
    // Create a program that prints a few operations on two numbers: 22 and 13

    // Print the result of 13 added to 22
    System.out.println("a + b: " + (a + b));

    // Print the result of 13 substracted from 22
    System.out.println("a - b: " + (a - b));

    // Print the result of 22 multiplied by 13
    System.out.println("a * b: " + (b * a));

    // Print the result of 22 divided by 13 (as a decimal fraction)
    System.out.println("a divided by b: " + (b / a));

    // Print the integer part of 22 divided by 13

    // Print the remainder of 22 divided by 13
    System.out.println("a % b: " + (b % a));
  }
}
