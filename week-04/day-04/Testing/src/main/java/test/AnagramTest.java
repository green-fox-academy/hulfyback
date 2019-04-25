import main.java.exercises.Anagram;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

  Anagram anagram;

  @Before

  public void setup() {
    anagram = new Anagram();
  }

  @Test

  public void isAnagramShouldReturnTrue() {
    Assert.assertEquals(true, anagram.isAnagram("sonka", "kanos"));
  }

  @Test

  public void isAnagramShouldReturnFalse() {
    Assert.assertNotEquals(true, anagram.isAnagram("palacsinta", "iskola"));
  }
}
