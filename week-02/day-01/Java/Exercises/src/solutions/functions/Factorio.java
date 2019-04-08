package solutions.functions;

public class Factorio {
  //  Create the usual class wrapper
  //  and main method on your own.

  // - Create a function called `factorio`
//   that returns it's input's factorial

  public static int factorial(int number) {

    if (number == 0) {
      return 0;
    } else {
      int factorial = 1;
      for (int i = 1; i <= number ; i++) {
        factorial *= i;
      }
      return factorial;
    }
  }
}