package solutions.arrays;

public class CompareLength {
  // - Create an array variable named `p1`
  //   with the following content: `[1, 2, 3]`
  // - Create an array variable named `p2`
  //   with the following content: `[4, 5]`
  // - Print if `p2` has more elements than `p1`

  public static boolean compareLengthOFArrays(int[] array, int[] anotherArray) {
    return anotherArray.length > array.length;
  }

  public static void secondArrayIsBigger(int[] array, int[] anotherArray) {
    if (compareLengthOFArrays(array, anotherArray)) {
      System.out.println("The 2nd array has more elements.");
    } else {
      System.out.println("The 1st array has more elements.");
    }
  }

}
