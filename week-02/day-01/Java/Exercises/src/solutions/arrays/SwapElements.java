package solutions.arrays;

public class SwapElements {
  // - Create an array variable named `abc`
  //   with the following content: `["first", "second", "third"]`
  // - Swap the first and the third element of `abc`
  public static void swapElements(String[] array, int indexOfWhat, int indexOfForWhat) {
    if (indexOfWhat < array.length && indexOfForWhat < array.length) {
      String temp = array[indexOfForWhat];
      array[indexOfForWhat] = array[indexOfWhat];
      array[indexOfWhat] = temp;
    } else {
      System.out.println("Error.");
    }
  }
}
