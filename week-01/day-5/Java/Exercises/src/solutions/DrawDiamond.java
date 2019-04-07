package solutions;

import java.util.Scanner;

public class DrawDiamond {

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

  public static void printBodyOfDiamond(int n, int i){
    for(int j = 0; j < n - i; j++){
      System.out.print(' ');
    }
    for (int j = 0; j < i * 2 + -1; j++){
      System.out.print('*');
    }
    System.out.println();
  }

  public static void drawDiamond() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of lines of the diamond: ");
    int numberOfLines = scanner.nextInt();

    for (int i = 1; i <= (int) Math.ceil((double)numberOfLines / 2) ; i++) {
      printBodyOfDiamond(numberOfLines, i);
    }
    for (int i = (int) Math.ceil(numberOfLines / 2); i >= 1; i--) {
      printBodyOfDiamond(numberOfLines, i);
    }
  }
}