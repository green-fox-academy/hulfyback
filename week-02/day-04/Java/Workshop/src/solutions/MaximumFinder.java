package solutions;

import java.util.Arrays;

public class MaximumFinder {
//  Write a function that finds the largest element of an array using recursion.
  public static int getMaximumValue(int[] array) {
    if (array.length == 1) {
      return array[0];
    } else {
      int lessNumber = array[array.length - 1] > array[array.length - 2] ? array[array.length - 1] : array[array.length - 2];
      array = Arrays.copyOf(array, array.length - 1);
      return lessNumber > getMaximumValue(array) ? lessNumber : getMaximumValue(array);
    }
  }

  public static void main(String[] args) {
    System.out.println(getMaximumValue(new int[] {101, 4, 6, 4, 5, 11, 34, 25, 0, 0, 16, 3, 100}));
  }
}
