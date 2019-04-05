package solutions;

import java.util.Scanner;

public class DrawSquare{

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

  public static void drawSquare(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of lines of a square");
    int numberOfLines = scanner.nextInt();
    String characterToUse = "\u25A0";

    System.out.println();
    if( numberOfLines <= 2){
      for (int i = 0; i < numberOfLines; i++) {
        for(int j = 0; j < numberOfLines; j++){
          System.out.print(characterToUse);
        }
        System.out.println();
      }
    }
    else{
      for(int i = 0; i < numberOfLines; i++){
        System.out.print(characterToUse);
      }
      System.out.println();
      for(int i = 0; i < numberOfLines - 2; i++){
        System.out.print(characterToUse);
        for(int j = 0; j < numberOfLines - 2; j++){
          System.out.print(' ');
        }
        System.out.print(characterToUse);
        System.out.println();
      }
      for(int i = 0; i < numberOfLines; i++){
        System.out.print(characterToUse);
      }
    }
  }
}