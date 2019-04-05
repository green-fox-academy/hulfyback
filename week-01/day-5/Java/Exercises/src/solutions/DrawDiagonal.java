package solutions;

import java.util.Scanner;

public class DrawDiagonal{

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

  public static void drawDiagonal(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of the lines of a square: ");
    int numberOfLines = scanner.nextInt();
    String charToUseForFrame = "\u25A0";
    String charToUseForDiagonal = "\\";

    if( numberOfLines <= 2){
      for (int i = 0; i < numberOfLines; i++) {
        for(int j = 0; j < numberOfLines; j++){
          System.out.print(charToUseForFrame);
        }
        System.out.println();
      }
    }
    else {
//      Bottom
      for(int i = 0; i < numberOfLines; i++){
        System.out.print(charToUseForFrame);
      }
      System.out.println();

//      Diagonal
      for(int i = 0; i < numberOfLines - 2; i++){
        System.out.print(charToUseForFrame);
        for(int j = 0; j < i; j ++){
          System.out.print(' ');
        }
        System.out.print(charToUseForDiagonal);
        for(int k = i; k < numberOfLines - 3; k++){
          System.out.print(' ');
        }
        System.out.print(charToUseForFrame);
        System.out.println();
      }

//      Bottom
      for(int i = 0; i < numberOfLines; i++){
        System.out.print(charToUseForFrame);
      }
    }
  }
}