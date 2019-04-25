import main.java.exercises.Sharpie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SharpieTest {
  Sharpie sharpie;

  @Test

  public void getColorShouldReturnBlueONBlueSharpie() {
    sharpie = new Sharpie("blue", 22);
    assertEquals("blue", sharpie.getColor());
  }
}
