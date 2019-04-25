package main.java.exercises;

import java.util.Arrays;

public class Anagram {

  public boolean isAnagram(String s1, String s2) {
    char[] charArray1 = s1.toCharArray();
    char[] charArray2 = s2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return Arrays.equals(charArray1, charArray2);
  }
}
