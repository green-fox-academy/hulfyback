package solutions.functions;

public class Sum {
  // Create the usual class wrapper and main method on your own.
  // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

  public static int sumFromZero(int input) {
    int sum = 0;

    for (int i = 0; i <= input; i++) {
     sum += i;
    }
    return sum;
  }
}