package solutions.variables;

import solutions.Decoration;

public class SecondsInADay {
  // Hours = 14;
  // Minutes = 34;
  // Seconds = 42;

  // Write a program that prints the remaining seconds (as an integer) from a
  // day if the current time is represented by the variables

  public static void secondsInADay(int currentHours, int currentMinutes, int currentSeconds) {
    Decoration.decorate("13");

    int secondsPerDay = 24 * 60 * 60;
    int secondsTilNow = currentHours * 60 + currentMinutes * 60 + currentSeconds;
    int remainingSeconds = secondsPerDay - secondsTilNow;

    System.out.println("Remaining seconds from the day: " + remainingSeconds);
  }
}
