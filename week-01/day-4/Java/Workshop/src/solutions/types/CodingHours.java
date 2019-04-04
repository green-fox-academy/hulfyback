package solutions.types;

import solutions.Decoration;
import java.text.DecimalFormat;

public class CodingHours {
  public static void codingHours(double hours, int weeks) {
    Decoration.decorate("06");
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    System.out.println("coding hours in a semester: " + (hours * weeks * 5));
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    DecimalFormat decimalformat = new DecimalFormat(".##");

    System.out.println(": percentage of the coding hours: " + decimalformat.format((hours * 5 / 52) * 100) + " %");
  }
}
