import main.java.exercises.Fibonacci;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

  Fibonacci fibonacci;

  @Before

  public void setup() {
    fibonacci = new Fibonacci();
  }

  @Test

  public void getFibonacciNumberReturnZeroOnZero() {
    Assert.assertEquals(0, fibonacci.getFibonacciNumber(0));
  }

  @Test

  public void getFibonacciNumberReturnOneOnOne() {
    Assert.assertEquals(1, fibonacci.getFibonacciNumber(1));
  }
}
