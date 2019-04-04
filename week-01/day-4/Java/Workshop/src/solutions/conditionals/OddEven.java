package solutions.conditionals;

import solutions.Decoration;

import java.util.Scanner;

public class OddEven {
// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

  public static void oddEven(){
    Decoration.decorate("18");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();

    if(number % 2 == 1){
      System.out.println("Odd");
    }
    else System.out.println("Even");
  }
}