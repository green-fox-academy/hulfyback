package solutions.arrays;

public class DoubleItems {
  // - Create an array variable named `numList`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Double all the values in the array
  public static void doubleItems(int[] array) {
    int i = 0;
    for (int element : array) {
      element *= 2;
      array[i] = element;
      i++;
    }
  }
}
