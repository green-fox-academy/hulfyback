package solutions.arrays;

public class DiagonalMatrix {
  // - Create (dynamically) a two dimensional array
  //   with the following matrix. Use a loop!
  //
  //   1 0 0 0
  //   0 1 0 0
  //   0 0 1 0
  //   0 0 0 1
  //
  // - Print this two dimensional array to the output
  public static int[][] createDiagonalMatrix(int size) {
    int[][] diagonalMatrix = new int[size][size];
    for (int i = 0; i < size ; i++) {
      for (int j = 0; j < size ; j++) {
        if (i == j) {
          diagonalMatrix[i][j] = 1;
        } else {
          diagonalMatrix[i][j] = 0;
        }
      }
    }

    return diagonalMatrix;
  }

  public static void printDiagonalMatrix(int size) {
    int[][] diagMatrix = createDiagonalMatrix(size);
    for (int[] row : diagMatrix) {
      for (int column : row) {
        System.out.print(column + " ");
      }
      System.out.println();
    }
  }
}
