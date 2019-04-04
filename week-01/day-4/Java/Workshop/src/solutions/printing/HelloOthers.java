package solutions.printing;

import solutions.Decoration;

public class HelloOthers {
  public static void greetingOthers(String[] names) {
    // Greet 3 of your classmates with this program, in three separate lines
    // like:
    //
    // Hello, Esther!
    // Hello, Mary!
    // Hello, Joe!
    Decoration.decorate("02");
    for (int i = 0; i < names.length; i++) {
      System.out.println("Hello, " + names[i]);
    }
  }
}
