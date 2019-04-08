package solutions.arrays;

public class Colors {
  // - Create a two dimensional array
  //   which can contain the different shades of specified colors
  // - In `colors[0]` store the shades of green:
  //   `"lime", "forest green", "olive", "pale green", "spring green"`
  // - In `colors[1]` store the shades of red:
  //   `"orange red", "red", "tomato"`
  // - In `colors[2]` store the shades of pink:
  //   `"orchid", "violet", "pink", "hot pink"`
  public static String[][] colors = new String[][] {
      {"lime", "forest green", "olive", "pale green", "spring green"},
      {"orange red", "red", "tomato"},
      {"orchid", "violet", "pink", "hot pink"}
  };

  public static void printTwoDimensionalArray(String[][] array) {
    for (String[] row : array) {
      for (String element : row) {
        System.out.print("\"" + element + "\" ");
      }
      System.out.println();
    }
  }
}
