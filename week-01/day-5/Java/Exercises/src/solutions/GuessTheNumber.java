package solutions;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

  public static void guessTheNumber(){
    int number = (int) (Math.random() * 100);
    int guess;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Enter your guess: ");
      guess = scanner.nextInt();
      if(number > guess){
        System.out.println("The stored number is higher");
      }
      else System.out.println("The stored number is lower");
    }
    while( guess != number);
    System.out.println("You found the number: " + number);
  }
}