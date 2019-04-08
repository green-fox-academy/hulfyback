package solutions.hardones;

import java.util.Arrays;

public class Bubble {
  //  Create a function that takes a list of numbers as parameter
  //  Returns a list where the elements are sorted in ascending numerical order
  //  Make a second boolean parameter, if it's `true` sort that list descending

  //  Example:
//    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
  //  should print [5, 9, 12, 24, 34]
//    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
  //  should print [34, 24, 12, 9, 5]

  public static int[] bubbleSort(int[] array, boolean descending) {
    int[] sortedArray = Arrays.copyOf(array, array.length);
    int numberOfSwap = 0;
    while (true) {
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (descending) {
          if (sortedArray[i + 1] > sortedArray[i]) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[i + 1];
            sortedArray[i + 1] = temp;
            numberOfSwap++;
          }
        } else {
          if (sortedArray[i + 1] < sortedArray[i]) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[i + 1];
            sortedArray[i + 1] = temp;
            numberOfSwap++;
          }
        }
      }
      if (numberOfSwap == 0) {
        break;
      } else {
        numberOfSwap = 0;
      }
    }
    return sortedArray;
  }
}