package solutions;

public class AddNumber {
//  Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
  public static int addNumbers(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + addNumbers(n - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(addNumbers(4));
  }
}
