import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

    printFile("assets/my-file.txt");
    printFile("assets/my-file");
  }

  public static void printFile(String path) {
    Path src = Paths.get(path);

    try {
      List<String> lines = Files.readAllLines(src);

      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("File doesn't exist.");
    }
  }
}
