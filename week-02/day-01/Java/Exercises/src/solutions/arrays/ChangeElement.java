package solutions.arrays;

public class ChangeElement{
  // - Create an array variable named `s`
  //   with the following content: `[1, 2, 3, 8, 5, 6]`
  // - Change the 8 to 4
  // - Print the fourth element

  public static void changeElementAtIndex(int[] array, int index, int value) {
    if (index < array.length) {
      array[index] = value;
    } else {
      System.out.println("Input array has less elements.");
    }
  }
}
