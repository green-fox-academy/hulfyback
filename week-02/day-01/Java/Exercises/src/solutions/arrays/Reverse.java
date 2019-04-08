package solutions.arrays;

public class Reverse {
  // - Create an array variable named `aj`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Reverse the order of the elements in `aj`
  // - Print the elements of the reversed `aj`

  public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 -i] = temp;
    }
  }
}
