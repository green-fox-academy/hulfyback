package main.java.exercises;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExpressions {

  private static List<Integer> numbers = Arrays
      .asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
  private static List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
  private static List<Integer> numbers3 = Arrays
      .asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
  private static List<String> cities = Arrays
      .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
          "ABU DHABI", "PARIS");

  public static void evenNumbers() {
    System.out.println("Even numbers:");
    numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
  }

  public static void positiveSquares() {
    System.out.println("Squares of positive numbers:");
    numbers.stream().filter(i -> i > 0).map(i -> i * i).sorted().forEach(System.out::println);
  }

  public static void squaresOver20() {
    System.out.println("Squares over 20:");
    numbers2.stream().filter(i -> i * i > 20).forEach(System.out::println);
  }

  public static void averageOfOdds() {
    System.out.print("Average value of odd numbers: ");
    IntSummaryStatistics odds = numbers.stream().filter(i -> Math.abs(i % 2) == 1).collect(
        Collectors.summarizingInt(i -> i));
    System.out.println(odds.getAverage());
  }

  public static void sumOfOdds() {
    System.out.print("Sum of odds: ");
    IntSummaryStatistics odds = numbers3.stream().filter(i -> Math.abs(i % 2) == 1)
        .collect(Collectors.summarizingInt(i -> i));

    System.out.println(odds.getSum());
  }

  public static void getUppercaseChars(String string) {
    System.out
        .println("Capital letters: " + string.codePoints().filter(c -> Character.isUpperCase(c))
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append));
  }

  public static void startsWidth(char c) {
    System.out.format("Cities which starts with letter %c: ", Character.toUpperCase(c));
    cities.stream()
        .filter(string -> string.startsWith(Character.toString(Character.toUpperCase(c))))
        .forEach(System.out::println);
  }

  public static String charListToString(List<Character> chars) {
    System.out.println("Chars concatenate into string: ");
    return chars.stream().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
  }

  public static Map<Character, Integer> getFrequencyOfChars(String string) {
    string.codePoints().
  }
}
