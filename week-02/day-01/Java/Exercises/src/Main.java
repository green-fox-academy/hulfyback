import jdk.jshell.Diag;
import solutions.arrays.*;
import solutions.functions.*;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

//    functions
//    Greet.greet("Greenfox");
//    System.out.println(Doubling.doubling(123));
//    System.out.println(AppendAFunc.appendAFunc("Chinchill"));
//    System.out.println(Sum.sumFromZero(10));
//    System.out.println(Factorio.factorial(6));

//    arrays
//    System.out.println(Third.getThirdElement(new int[] {4, 5, 6, 7}));
//    CompareLength.secondArrayIsBigger(new int[] {1, 2, 3}, new int[] {4, 5});
//    SumElements.sumSecondAndThirdElement(new int[] {54, 23, 66, 12});
//    int[] array = new int[] {1, 2, 3, 8, 5, 6};
//    ChangeElement.changeElementAtIndex(array, 3, 4);
//    System.out.println(Arrays.toString(array));
//    IncrementElement.incrementElement(new int[] {1, 2, 3, 4, 5}, 2);
//    PrintAll.printAll(new int[] {4, 5, 6, 7});
//    DiagonalMatrix.printDiagonalMatrix(4);
//    int[] array = new int[] {3, 4, 5, 6, 7};
//    DoubleItems.doubleItems(array);
//    System.out.println(Arrays.toString(array));

//    Colors.printTwoDimensionalArray(Colors.colors);
//    String[] animals = new String[] {"koal", "pand", "zebr"};
//    AppendA.appendA(animals);
//    System.out.println(Arrays.toString(animals));

//    String[] abc = new String[] {"first", "second", "third"};
//    SwapElements.swapElements(abc, 0, 2);
//    System.out.println(Arrays.toString(abc));

//    System.out.println(SumAll.sumAllElements(new int[] {3, 4, 5, 6, 7}));
    int[] numbers = new int[] {3, 4, 5, 6, 7};
    Reverse.reverseArray(numbers);
    System.out.println(Arrays.toString(numbers));
  }
}
