package solutions;

import java.util.Scanner;

public class DrawATriangle {

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
  public static void drawATriangle(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to the triangle: ");
    int number = scanner.nextInt();
    for (int i = 1; i <= number ; i++) {
      for (int j = 0; j < i ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("\n");
  }
}