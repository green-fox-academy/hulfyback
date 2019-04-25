import main.java.exercises.CountLetters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class CountLettersTest {
  private CountLetters countLetters;
  private HashMap<Character, Integer> lettersHashMap;

  @Before

  public void setup() {
    countLetters = new CountLetters();
  }

  @Test

  public void countLettersShouldReturnA2OnAA() {
    Assert.assertEquals(new HashMap<Character, Integer>() {{
      put('A', 2);
    }}, countLetters.countLetters("AA"));
  }

  @Test

  public void countLettersShouldReturnA2B1OnABA() {
    lettersHashMap = new HashMap<>() {
      {
        put('A', 2);
        put('B', 1);
      }
    };

    Assert.assertEquals(lettersHashMap, countLetters.countLetters("ABA"));
  }

  @Test

  public void countLettersShouldReturnEmptyDictionaryOnEmptyString() {
    lettersHashMap = new HashMap<>();

    Assert.assertEquals(lettersHashMap, countLetters.countLetters(""));
  }

  @Test

  public void countLettersShouldReturnEmptyDictionaryOnNull() {
    lettersHashMap = new HashMap<>();

    Assert.assertEquals(lettersHashMap, countLetters.countLetters(new String()));
  }
}
