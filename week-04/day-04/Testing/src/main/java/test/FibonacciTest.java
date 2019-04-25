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

  public void getFibonacciNumberShouldReturnZeroOnZero() {
    Assert.assertEquals(0, fibonacci.getFibonacciNumber(0));
  }

  @Test

  public void getFibonacciNumberShouldReturnOneOnOne() {
    Assert.assertEquals(1, fibonacci.getFibonacciNumber(1));
  }

  @Test

  public void getFibonacciNumberShouldReturnTwoOnThre() {
    Assert.assertEquals(2, fibonacci.getFibonacciNumber(3));
  }

  @Test

  public void getFibonacciNumberShouldReturnEightOnSix() {
    Assert.assertEquals(8, fibonacci.getFibonacciNumber(6));
  }
}
