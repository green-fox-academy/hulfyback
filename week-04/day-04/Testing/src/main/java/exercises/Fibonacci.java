package main.java.exercises;

public class Fibonacci {

  public int getFibonacciNumber(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
  }
}
