// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    System.out.println(countLines("assets/my-file.txt"));
    System.out.println(countLines("assets/my-file"));
  }

  public static int countLines(String path) {
    Path src = Paths.get(path);

    try {
      List<String> lines = Files.readAllLines(src);

      return lines.size();
    } catch (IOException e) {
      return 0;
    }
  }
}
