package solutions.data_structures;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
//  We are going to represent our expenses in a list containing integers.
//
//  Create a list with the following items.
//  500, 1000, 1250, 175, 800 and 120

  static List<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
//  Create an application which solves the following problems.
//  How much did we spend?
  public static int sumExpenses(List<Integer> list) {
    int totalAmountOfExpenses = 0;
    for (int expense : list) {
      totalAmountOfExpenses += expense;
    }
    return totalAmountOfExpenses;
  }
//  Which was our greatest expense?
  public static int greatestElement(List<Integer> list) {
    Collections.sort(list, Collections.reverseOrder());
    return list.get(0);
  }
//  Which was our cheapest spending?
  public static int smallestElement(List<Integer> list) {
    Collections.sort(list);
    return list.get(0);
}
//  What was the average amount of our spendings?
  public static double getAvg(List<Integer> list) {

    return (double) sumExpenses(list) / list.size();
  }

  public static void main(String[] args) {
    System.out.println("How much did we spend?\n" + sumExpenses(expenses));
    System.out.println("Which was our greatest expense?\n" + greatestElement(expenses));
    System.out.println("Which was our cheapest spending?\n" + smallestElement(expenses));

    DecimalFormat df = new DecimalFormat(".##");
    System.out.println("What was the average amount of our spendings?\n" + df.format(getAvg(expenses)));
  }
}