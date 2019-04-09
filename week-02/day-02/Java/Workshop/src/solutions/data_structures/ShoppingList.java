package solutions.data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
//    We are going to represent a shopping list in a list containing strings.
//
//    Create a list with the following items.
//    Eggs, milk, fish, apples, bread and chicken

  static List<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

//    Create an application which solves the following problems.
//    Do we have milk on the list?
//    Do we have bananas on the list?
  public static String containsItem(List<String> list, String item) {
    if (list.contains(item)) {
      return "Yes";
    } else {
      return "No";
    }
}
  public static void main(String[] args) {
    System.out.println("Do we have milk on the list?\n" + containsItem(shoppingList, "milk"));
    System.out.println("Do we have milk on the list?\n" + containsItem(shoppingList, "bananas"));
  }
}