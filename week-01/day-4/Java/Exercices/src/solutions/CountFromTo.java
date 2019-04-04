package solutions;

import java.util.Scanner;

public class CountFromTo {

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
// 
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

  public static void countFromTo(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 1st number: ");
    int a = scanner.nextInt();
    System.out.println("Enter 2nd number: ");
    int b = scanner.nextInt();

    if (b <= a){
      System.out.println("The second number should be bigger");
    }
    else {
      for (int i = a; i < b; i++) {
        System.out.println(i);
      }
    }
    System.out.println("\n");
  }
}