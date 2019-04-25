import main.java.exercises.CountLetters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class CountLettersTest {
  private CountLetters countLetters;

  @Before

  public void setup() {
    countLetters = new CountLetters();
  }

  @Test

  public void countLettersShouldReturnA2OnAA() {
    Assert.assertEquals(new HashMap<Character, Integer>() {{put('A', 2);}}, countLetters.countLetters("AA"));
  }
}
