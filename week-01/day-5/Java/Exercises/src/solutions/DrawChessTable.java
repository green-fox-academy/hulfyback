package solutions;

public class DrawChessTable{
// Crate a program that draws a chess table like this
//
// % % % % 
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % % 
//  % % % %
//

  public static void drawChessTable(){

    String blackField = "\u25A0";
    String whiteField = "\u25A1";

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(whiteField);
        System.out.print(blackField);
      }

      System.out.println();

      for (int j = 0; j < 4; j++) {
        System.out.print(blackField);
        System.out.print(whiteField);
      }
      System.out.println();
    }
  }
}