package solutions.userinput;

import solutions.Decoration;

import java.util.Scanner;

public class HelloUser {
  public static void helloUser() {
    Decoration.decorate("14");
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scanner.next();
    System.out.println("Hello, " + name);
  }
}
