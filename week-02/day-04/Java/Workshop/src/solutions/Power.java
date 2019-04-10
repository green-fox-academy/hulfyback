package solutions;

public class Power {
//  Given base and n that are both 1 or more, compute recursively (no loops)
//  the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  public static int power(int base, int power) {
    if (power == 1) {
      return base;
    } else {
      return base * power(base, power - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(power(2, 8));
  }
}
