package solutions;

import java.util.Scanner;

public class DrawPyramid {

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

  public static void drawPyramid(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of rows to the pyramid: ");
    int rows = scanner.nextInt();

    for (int i = 1; i <= rows; i++) {
      for(int j = 0; j < rows - i; j++){
        System.out.print(' ');
      }
      for (int j = 0; j < i * 2 + -1; j++){
        System.out.print('*');
      }
      System.out.println();
    }
  }
}