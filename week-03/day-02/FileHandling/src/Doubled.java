import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    decrypt("assets/duplicated-chrs.txt");
  }

  public static void decrypt(String path) {
    Path src = Paths.get(path);

    try {
      List<String> lines = Files.readAllLines(src);
      for (String line : lines) {
        String[] words = line.split(" ");
        String newLine = "";
        for (String word : words) {
          newLine = newLine + removeDuplicatedCharsFromString(word) + " ";
        }
        System.out.println(newLine.trim());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String removeDuplicatedCharsFromString(String word) {
    String str = "";

    for (int i = 0; i < word.length(); i++) {
      if (i % 2 == 0) {
        str = str.concat(Character.toString(word.charAt(i)));
      }
    }
    return str;
  }
}