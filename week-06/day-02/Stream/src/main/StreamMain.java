package main;

import java.util.Arrays;
import java.util.List;
import main.java.exercises.Fox;
import main.java.exercises.StreamExpressions;

public class StreamMain {

  private static List<Fox> foxList = Arrays
      .asList(new Fox("Jimmy", "red", 8),
          new Fox("Charlie", "green", 4),
          new Fox("Peter", "green", 8),
          new Fox("Foxie", "red", 3),
          new Fox("Pixy", "green", 7));

  public static void main(String[] args) {
    StreamExpressions.evenNumbers();
    StreamExpressions.positiveSquares();
    StreamExpressions.squaresOver20();
    StreamExpressions.averageOfOdds();
    StreamExpressions.sumOfOdds();
    StreamExpressions.getUppercaseChars("VanValami a levegőBeN");
    StreamExpressions.startsWidth('c');
    System.out
        .println(StreamExpressions.charListToString(Arrays.asList('v', 'a', 'l', 'a', 'm', 'i')));
    System.out.println(StreamExpressions.getFrequencyOfChars("pipipapa"));

    System.out.println("Green foxes: ");
    foxList.stream().filter(fox -> fox.getColor().equals("green")).forEach(fox -> System.out
        .println(fox.getName()));

    System.out.println("Green foxes under age 5: ");
    foxList.stream().filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5)
        .forEach(fox -> System.out.println(fox.toString()));

    System.out.println(("Frequencies of foxes by color: "));
    System.out.println(StreamExpressions.getFrequencyOfFoxesByColor(foxList));
  }
}
