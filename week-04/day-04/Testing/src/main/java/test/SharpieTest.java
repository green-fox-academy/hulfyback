import main.java.exercises.Sharpie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SharpieTest {
  private Sharpie sharpie;

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

  @Test
  public void getWidthShouldReturnElevenOnOneParameterSharpie() {
    sharpie = new Sharpie(8);

    assertEquals(11, sharpie.getWidth(), 0);
  }
}