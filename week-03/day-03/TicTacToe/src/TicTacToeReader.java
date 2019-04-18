import exceptions.EmptyFieldException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToeReader {



  private char[][] standing = new char[3][3];

  public void readStanding(String path){
    Path src = Paths.get(path);

    try {
      List<String> lines = Files.readAllLines(src);
      for (int i = 0; i < 3 ; i++) {
        String line = lines.get(i);
        for (int j = 0; j < 3; j++) {
          if (line.charAt(j) == ' ') {
            throw new EmptyFieldException("There is an empty field.");
          }
          this.standing[i][j] = line.charAt(j);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (EmptyFieldException e) {
      e.printStackTrace();
      System.exit(0);
    }
  }

  public String getWinner(char[][] standing) {
    if (checkDiagonal(standing, 'X')
        || checkRowsAndColumns(standing, 'X')) {
      return "x";
    } else if (checkDiagonal(standing, 'O') || checkRowsAndColumns(standing, 'O')) {
      return "o";
    } else {
      return "draw";
    }
  }

  private static boolean checkDiagonal(char[][] standing, char sign) {
    int countLeftDiag = 0;
    int countRightDiag = 0;
    int left = 0;
    int right = 2;

    for (int i = 0; i <3 ; i++) {
      if (standing[i][left] == sign) {
        countLeftDiag++;
      }
      if (standing[i][right] == sign) {
        countRightDiag++;
      }
      left++;
      right--;
    }
    return (countLeftDiag == 3 || countRightDiag == 3);
  }

  private static boolean checkRowsAndColumns(char[][] standing, char sign) {
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

  public char[][] getStanding() {
    return this.standing;
  }
}
