package solutions.data_structures;

import java.text.DecimalFormat;
import java.util.*;

public class ProductDatabase {
//  We are going to represent our products in a map where the keys are
//  strings representing the product's name and the values are numbers
//  representing the product's price.
//
//  Create a map with the following key-value pairs.
//  Product name (key)	Price (value)
//  Eggs	200
//  Milk	200
//  Fish	400
//  Apples	150
//  Bread	50
//  Chicken	550

  static Map<String, Integer> products = new HashMap<>() {
    {
      put("Eggs",	200);
      put("Milk", 200);
      put("Fish", 400);
      put("Apples", 150);
      put("Bread", 50);
      put("Chicken", 550);
    }
  };
//  Create an application which solves the following problems.
//  How much is the fish?
  public static int getPrice(Map<String, Integer> products, String product) {
    return products.get(product);
  }

//  What is the most expensive product?
  public static int getHighestValue(Map<String, Integer> map) {
    List<Integer> values = new ArrayList<>(map.values());
    Collections.sort(values, Collections.reverseOrder());
    return values.get(0);
  }

  public static int getLowestValue(Map<String, Integer> map) {
    List<Integer> values = new ArrayList<>(map.values());
    Collections.sort(values);
    return values.get(0);
  }

  public static String getKeyWithLargestValue(Map<String, Integer> map) {
    int largestValue = getHighestValue(map);
    String key = "";

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == largestValue) {
        key = entry.getKey();
        break;
      }
    }
    return key;
  }

  public static String getKeyWithSmallestValue(Map<String, Integer> map) {
    int lowestValue = getLowestValue(map);
    String key = "";

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue().equals(lowestValue)) {
        key = entry.getKey();
        break;
      }
    }
    return key;
  }

//  What is the average price?
  public static double getAvgValue(Map<String, Integer> map) {
    double sum = 0;
    List<Integer> values = new ArrayList<>(map.values());
    for (int value : values) {
      sum += value;
    }
    return (double) sum / values.size();
  }

//  How many products' price is below 300?
  public static int countOfElementsBelowValue(Map<String, Integer> map, int limit) {
    int elementsBelowLimit = 0;
    for (int element : map.values()) {
      if (element < limit) {
        elementsBelowLimit++;
      }
    }
    return elementsBelowLimit;
  }

//  Is there anything we can buy for exactly 125?
  public static String getKey(Map<String, Integer> map, int value) {
    Set<String> keys = map.keySet();
    Collection<Integer> values = map.values();
    if (values.contains(values)) {
      String key = "";
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue().equals(value)) {
          key = entry.getKey();
          break;
        }
      }
      return key;
    } else {
      return "There is no product at this price";
    }
  }
//  What is the cheapest product?
  public static void main(String[] args) {
    System.out.println("What is the most expensive product?\n" + getKeyWithLargestValue(products) + "\n");

    DecimalFormat df = new DecimalFormat(".##");
    System.out.println("What is the average price?\n" + df.format(getAvgValue(products)) + "\n");
    System.out.println("How many products' price is below 300?\n" + countOfElementsBelowValue(products, 300) + "\n");
    System.out.println("Is there anything we can buy for exactly 125?\n" + getKey(products, 125) + "\n");
    System.out.println("What is the cheapest product?\n" + getKeyWithSmallestValue(products) + "\n");
  }
}