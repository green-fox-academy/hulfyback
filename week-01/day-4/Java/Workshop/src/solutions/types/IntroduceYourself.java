package solutions.types;

import solutions.Decoration;

public class IntroduceYourself {
  public static void introduce(String name, int age, float height) {
    Decoration.decorate("04");
    // Write a program that prints a few details to the terminal window about you
    // It should print each detail to a new line.
    //  - Your name
    //  - Your age
    //  - Your height in meters (as a decimal fraction)
    //
    //  Example output:
    //  John Doe
    //  31
    //  1.87

    System.out.println("Name: " + name + "\nAge: " + age + "\nHeight: " + height);
  }
}
