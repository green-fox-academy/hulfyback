package solutions.userinput;

import solutions.Decoration;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MileToKmConverter {
  public static void mileToKmConverter() {
    Decoration.decorate("15");
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter how much km(s) would you like to convert into miles: ");
    int km = scanner.nextInt();
    double miles = km * 0.621371d;

    DecimalFormat decimalFormat = new DecimalFormat(".###");

    System.out.println(km + "km(s) are about " + decimalFormat.format(miles) + "mile(s)");
  }
}
