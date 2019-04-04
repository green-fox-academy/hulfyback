package solutions;

public class PrintEven {
// Create a program that prints all the even numbers between 0 and 500

  public static void printEven(int from, int to){
    for (int i = from; i < to + 1; i++) {
      if(i % 2 == 0){
        System.out.print(i + " ");
      }
    }
    System.out.println("\n");
  }
}