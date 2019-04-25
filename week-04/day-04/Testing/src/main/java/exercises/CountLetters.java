package main.java.exercises;

import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer> countLetters(String s) {
    HashMap<Character, Integer> lettersHashMap = new HashMap<>();
    for (int i = 0; i < s.length() ; i++) {
      if (!lettersHashMap.containsKey(s.charAt(i))) {
        lettersHashMap.put(s.charAt(i), 1);
      } else {
        lettersHashMap.put(s.charAt(i), lettersHashMap.get(s.charAt(i)) + 1);
      }
    }
    return lettersHashMap;
  }
}
