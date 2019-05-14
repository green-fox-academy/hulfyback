package main;
import java.util.Arrays;
import main.java.exercises.StreamExpressions;

public class StreamMain {

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
  }
}
