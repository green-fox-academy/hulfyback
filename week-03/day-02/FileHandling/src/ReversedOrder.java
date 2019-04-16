import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    decryptReversedOrder("assets/reversed-order.txt");

  }

  public static void decryptReversedOrder(String path) {
    Path src = Paths.get(path);

    try {
      List<String> lines = Files.readAllLines(src);

      for (int i = lines.size() - 1; i >= 0 ; i--) {
        System.out.println(lines.get(i));

      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
