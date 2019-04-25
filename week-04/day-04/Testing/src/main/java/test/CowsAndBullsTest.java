import main.java.exercises.CowsAndBulls;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CowsAndBullsTest {
  CowsAndBulls cowsAndBulls;

  @Before
  public void setup() {
    cowsAndBulls = new CowsAndBulls();
  }

  @Test
  public void getCowsAndBullsShouldReturnEmptyString() {
    assertEquals("", cowsAndBulls.getCowsAndBulls(6789, 1234));
  }

}
