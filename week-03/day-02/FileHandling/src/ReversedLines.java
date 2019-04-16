import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    decryptReversedLines("assets/reversed-lines.txt");

  }

  public static void decryptReversedLines(String path) {
    Path src = Paths.get(path);

    try {
      List<String> lines = Files.readAllLines(src);

      for (String line : lines) {
        System.out.println(reverseString(line));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String reverseString(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
}
