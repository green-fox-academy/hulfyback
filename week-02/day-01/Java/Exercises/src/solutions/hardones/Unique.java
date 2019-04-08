package solutions.hardones;

import java.util.Arrays;

public class Unique {
  //  Create a function that takes a list of numbers as a parameter
  //  Returns a list of numbers where every number in the list occurs only once

  //  Example: [1, 11, 34, 11, 52, 61, 1, 3]
  //  should print: `[1, 11, 34, 52, 61]`
  public static boolean containsNumber(int[] array, int number) {
    int i = 0;
    do {
      if (array[i] == number) {
        return true;
      } else {
        i++;
      }
    } while (i < array.length);
    return false;
  }

  public static int countOfUniqueNumbers(int[] array) {
    int size = array.length;
    for (int i = 1; i < array.length ; i++) {
      if (containsNumber(Arrays.copyOf(array, i), array[i])) {
        size--;
      }
    }
    return size;
  }

  public static int[] createUniqueList(int[] array) {
    if (array.length >= 1) {
      int[] numbers = new int[countOfUniqueNumbers(array)];
      numbers[0] = array[0];
      int indexOfNumbers = 1;
      for (int i = 1; i < array.length ; i++) {
        if (!containsNumber(numbers, array[i])) {
          numbers[indexOfNumbers] = array[i];
          indexOfNumbers++;
        }
      }
      return numbers;
    } else {
      return new int[]{};
    }
  }
}
