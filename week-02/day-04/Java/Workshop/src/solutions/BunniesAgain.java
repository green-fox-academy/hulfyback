package solutions;

public class BunniesAgain {
//  We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
//  have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because
//  they each have a raised foot. Recursively return the number of "ears" in the bunny
//  line 1, 2, ... n (without loops or multiplication).
  public static int countOfEars(int n) {
    if (n == 1) {
      return 3;
    } else if (n % 2 == 1) {
      return 3 + countOfEars(n -1);
    } else {
      return 2 + countOfEars(n - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(countOfEars(16));
  }
}
