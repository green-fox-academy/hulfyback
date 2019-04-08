package solutions.arrays;

import java.util.Arrays;

public class PrintAll{
  // - Create an array variable named `numbers`
  //   with the following content: `[4, 5, 6, 7]`
  // - Print all the elements of `numbers`

  public static void printAll(int[] array) {
    System.out.println("[");
    for (int element : array) {
      System.out.print(" " + element + " ");
    }
  }
}
