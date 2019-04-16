import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    System.out.println(ticTacResult("assets/win-o.txt"));
    // Should print "O"

//    System.out.println(ticTacResult("assets/win-x.txt"));
    // Should print "X"

//    System.out.println(ticTacResult("assets/draw.txt"));
    // Should print "Draw"
  }

  public static String ticTacResult(String path) {
    Path src = Paths.get(path);
    char[][] tictactoe = new char[3][3];

    try {
      List<String> lines = Files.readAllLines(src);
      for (int i = 0; i < 3 ; i++) {
        String line = lines.get(i);
        for (int j = 0; j < 3; j++) {
          tictactoe[i][j] = line.charAt(j);
        }
      }

      return getWinner(tictactoe);
    } catch (IOException e) {
      e.printStackTrace();
      return "";
    }
  }

  public static String getWinner(char[][] standing) {

    if (checkDiagonal(standing, 'X')
        || checkRowsAndColumns(standing, 'X')) {
      return "x";
    } else if (checkDiagonal(standing, 'O') || checkRowsAndColumns(standing, 'O')) {
      return "o";
    } else {
      return "draw";
    }
  }

  public static boolean checkDiagonal(char[][] standing, char sign) {
    int countDiag = 0;

    for (int i = 0; i <3 ; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          if (standing[i][j] == sign) {
            countDiag++;
          }
        }
      }
    }
    if (countDiag == 3) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean checkRowsAndColumns(char[][] standing, char sign) {

    for (int i = 0; i < 3; i++) {
      int countSignInARow = 0;
      int countSignInAColumn = 0;

      for (int j = 0; j <  3; j++) {
        if (standing[i][j] == sign) {
          countSignInARow++;
        }
        if (standing[j][i] == sign) {
          countSignInAColumn++;
        }
      }
      if (countSignInARow == 3 || countSignInAColumn == 3) {
        return true;
      }
    }
    return false;
  }
}
