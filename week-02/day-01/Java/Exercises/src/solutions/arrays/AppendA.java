package solutions.arrays;

import java.util.Arrays;

public class AppendA {
  // - Create an array variable named `animals`
  //   with the following content: `["koal", "pand", "zebr"]`
  // - Add all elements an `"a"` at the end

  public static void appendA(String[] array) {
    int i = 0;
    for (String element : array) {
      element += "a";
      array[i] = element;
      i++;
    }
  }
}
