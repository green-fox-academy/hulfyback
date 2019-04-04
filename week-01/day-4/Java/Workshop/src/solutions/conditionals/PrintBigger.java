package solutions.conditionals;

import solutions.Decoration;
import java.util.Scanner;

public class PrintBigger {

// Write a program that asks for two numbers and prints the bigger one
  public static void printBigger(){
    Decoration.decorate("20");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = scanner.nextInt();
    System.out.println("Enter an other number: ");
    int b = scanner.nextInt();

    if(a > b){
      System.out.println(a + "is the bigger one");
    }
    else System.out.println(b + "is the bigger one");

  }
}
