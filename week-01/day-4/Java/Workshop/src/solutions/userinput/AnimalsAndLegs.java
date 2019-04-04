package solutions.userinput;

import solutions.Decoration;

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void animalsAndLegs() {
    Decoration.decorate("16");
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    Scanner scanner = new Scanner(System.in);
    System.out.println("Type the number of chicken(s): ");
    int numberOfChickens = scanner.nextInt();

    System.out.println("Type the number of pig(s): ");
    int numberOfPigs = scanner.nextInt();

    int numberOfAllLegs = numberOfChickens * 2 + numberOfPigs * 4;

    System.out.println("Number of all legs: " + numberOfAllLegs);
  }
}
