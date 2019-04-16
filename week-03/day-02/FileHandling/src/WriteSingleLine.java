// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    writeLineIntoFile("assets/my-file", "by Zsolt Molnár");
    writeLineIntoFile("assets/my-file.txt", "by Zsolt Molnár");
    appendLineToFile("assets/my-file.txt", "by Zsolt Molnár");
  }

  public static void writeLineIntoFile(String path, String line) {
    Path dest = Paths.get(path);

    try {
      Files.writeString(dest, line);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }

  public static void appendLineToFile(String path, String line) {
    Path dest = Paths.get(path);

    try {
      List<String> lines = Files.readAllLines(dest);

      lines.add(line);
      Files.write(dest, lines);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
