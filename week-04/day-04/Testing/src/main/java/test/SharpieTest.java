import main.java.exercises.Sharpie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SharpieTest {
  Sharpie sharpie;

  @Test

  public void getColorShouldReturnBlueOnBlueSharpie() {
    sharpie = new Sharpie("blue", 22);
    assertEquals("blue", sharpie.getColor());
  }

  @Test

  public void setColorShouldSetColorGreenByParameterGreen() {
    sharpie = new Sharpie("yellow", 22);
    sharpie.setColor("green");

    assertEquals("green", sharpie.getColor());
  }
}
