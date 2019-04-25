package main.java.exercises;

import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> numberList) {
    if (numberList == null) {
      System.out.println("is null");
      return 0;
    } else {
      int sum = 0;
      for (Integer number : numberList) {
        sum += number;
      }
      return sum;
    }
  }
}
