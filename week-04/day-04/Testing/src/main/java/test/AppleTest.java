import main.java.exercises.Apple;
import org.junit.*;
public class AppleTest {
  Apple apple;

  @Before
  public void setup() {
    apple = new Apple();
  }

  @Test
  public void getNameShouldReturnCorrectly() {
    Assert.assertEquals("apple", apple.getName());
  }

  @Test
  public void getNameShouldNotReturnCorrectly() {
    Assert.assertNotEquals("peach", apple.getName());
  }
}