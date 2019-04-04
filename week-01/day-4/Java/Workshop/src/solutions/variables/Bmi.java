package solutions.variables;

import solutions.Decoration;

public class Bmi {
  public static void bmi() {
    Decoration.decorate("09");
    // Print the Body mass index (BMI) based on these values
    double massInKg = 81.2;
    double heightInM = 1.78;
    System.out.println( "BMI is: " + massInKg / Math.sqrt(heightInM * 100));


  }
}
