package solutions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParametricAverage{

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

  public static void parametricAerage(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();
    int sum = 0;

    for (int i = 0; i < number ; i++) {
      System.out.println("Enter a new nuber: ");
      sum += scanner.nextInt();
    }

    DecimalFormat df = new DecimalFormat(".###");
    double average = (double)sum / number;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + df.format(average));
  }
}