package solutions;

import java.util.Scanner;

public class GuessMyNumber {
  public static void guessMyNumber(){

    int number = (int) (Math.random() * 100);
    int guess;
    int lives = 5;

    Scanner scanner = new Scanner(System.in);

    System.out.println("I've the number between 1-100. You have 5 lives.");
    do {
      System.out.println("Enter your guess: ");
      guess = scanner.nextInt();
      if(number > guess){
        lives--;
        if(lives == 0){
          System.out.println("You lost!");
          break;
        }
        System.out.println("Too low. You have " + lives + " lives.");
      }
      else if(number < guess){
        lives--;
        if(lives == 0){
          System.out.println("You lost!");
          break;
        }
        System.out.println("Too high. You have " + lives + " lives.");
      }

      else {
        System.out.println("Congratulations. You won!");
        break;
      }
    }
    while(true);
    if(lives == 0){
      System.out.println("The number was: " + number);
    }
  }
}
