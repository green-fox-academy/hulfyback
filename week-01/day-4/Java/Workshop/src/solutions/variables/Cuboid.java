package solutions.variables;

import solutions.Decoration;
import java.lang.Math;

public class Cuboid{
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// 
// Surface Area: 600
// Volume: 1000

  public static void cuboid(double a, double b, double c){
    Decoration.decorate("12");
    double area = 2 * ((a * b) + (a * c) + (b * c));
    double volume = a * b * c;

    System.out.println("Surface Area: " + Math.round(area));
    System.out.println("Volume: " + Math.round(volume));
  }
}
