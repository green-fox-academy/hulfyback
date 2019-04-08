package solutions.arrays;

public class IncrementElement {
  // Create an array variable named `t`
  // with the following content: `[1, 2, 3, 4, 5]`
  // Increment the third element
  // Print the third element

  public static void incrementElement(int[] array, int index){
    if (index < array.length) {
      System.out.println("Before: " + array[index]);
      array[index]++;
      System.out.println("After: " + array[index]);
    } else {
      System.out.println("The input array hasn't enough elements.");
    }
  }
}

