package solutions;

public class GreatestCommonDivisor {
//  Find the greatest common divisor of two numbers using recursion.
  public static int greatestCommonDivisor(int a, int b) {
    int divisor = 2;
    int smaller = (a <= b) ? a: b;
    while (!(a % divisor == 0 && b % divisor == 0)) {
      divisor++;
      if (divisor > smaller) {
        return 1;
      }
    }
    a = a / divisor;
    b = b / divisor;

    return divisor * greatestCommonDivisor(a, b);
  }

  public static void main(String[] args) {
    System.out.println(greatestCommonDivisor(60, 90));
  }
}
