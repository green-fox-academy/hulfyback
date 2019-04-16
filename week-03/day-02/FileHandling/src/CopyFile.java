// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    System.out.println(copyFile("assets/my-file.txt", "assets/my-file-copy.txt"));
    System.out.println(copyFile("assets/my-file.tx", "assets/my-file-copy.txt"));
  }

  public static boolean copyFile(String pathSrc, String pathDest) {
    Path src = Paths.get(pathSrc);
    Path dest = Paths.get(pathDest);

    try {
      List<String> text = Files.readAllLines(src);

      Files.write(dest, text);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
