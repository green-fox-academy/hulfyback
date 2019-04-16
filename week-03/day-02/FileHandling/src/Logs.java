// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
//    System.out.println(Arrays.toString(getIPs("assets/logs.txt")));
    System.out.println(getPostRatio("assets/logs.txt"));
  }

  public static String[] getIPs(String pathSrc) {
    Path src = Paths.get(pathSrc);

    try {
      List<String> lines = Files.readAllLines(src);
      List<String> listIP = new ArrayList<>();

      for (String line : lines) {
        listIP.add(line.split("   ")[1]);
      }

      listIP = getUniqueElements(listIP);
      String[] ipArray = listToArray(listIP);

      return ipArray;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public static List<String> getUniqueElements(List<String> list) {
    List<String> uniqueList = new ArrayList<>();

    for (String element : list) {
      if (!uniqueList.contains(element)) {
        uniqueList.add(element);
      }
    }

    return uniqueList;
  }

  public static String[] listToArray(List<String> list) {
    String[] array = list.toArray(new String[list.size()]);

    for (int i = 0; i < list.size(); i++) {
      array[i] = list.get(i);
    }
    return array;
  }

  public static double getPostRatio(String pathSrc) {
    Path src = Paths.get(pathSrc);

    try {
      List<String> lines = Files.readAllLines(src);
      int countGet = 0;
      int countPost = 0;

      for (String line : lines) {
        if (line.substring(0, line.length() - 2).split("   ")[2].equals("GET")) {
          countGet++;
        } else {
          countPost++;
        }
      }
      System.out.println(String.format("%d : %d", countGet, countPost));
      return (double) countGet / (double) countPost;
    } catch (IOException e) {
      e.printStackTrace();
      return 0;
    }
  }
}
