import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
      decode("assets/encoded-lines.txt", -1);
  }

  public static void decode(String path, int key) {
    System.out.println();
    System.out.println(String.format("Key: %d", key));
    System.out.println();
    Path src = Paths.get(path);

    try {
      List<String> lines = Files.readAllLines(src);

      for (String line : lines) {
        CharSequence cs = line.subSequence(0, line.length());
        for (int j = 0; j < cs.length() ; j++) {
          if (cs.charAt(j) != ' ' && cs.charAt(j) != '/') {
            System.out.print((char) (cs.charAt(j) + key));
          }
          else System.out.print(cs.charAt(j));
        }
        System.out.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
