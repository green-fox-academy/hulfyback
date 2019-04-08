package solutions.arrays;

public class SumAll {
  // - Create an array variable named `ai`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Print the sum of the elements in `ai`
  public static int sumAllElements(int[] array) {
    int sum = 0;
    for (int element : array) {
      sum += element;
    }

    return sum;
  }
}
