import main.java.exercises.Sharpie;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SharpieTest {
  private Sharpie sharpie;

  @Before
  public void setup() {
    sharpie = new Sharpie("blue", 22);
  }

  @Test
  public void getColorShouldReturnBlueOnBlueSharpie() {
    assertEquals("blue", sharpie.getColor());
  }

  @Test
  public void setColorShouldSetColorGreenByParameterGreen() {
    sharpie.setColor("green");

    assertEquals("green", sharpie.getColor());
  }

  @Test
  public void getWidthShouldReturnElevenOnOneParameterSharpie() {
    sharpie = new Sharpie(8);

    assertEquals(11, sharpie.getWidth(), 0);
  }

  @Test
  public void setWidthShouldSetWidthTo20() {
    sharpie.setWidth(20);

    assertEquals(20, sharpie.getWidth(), 0);
  }

  @Test
  public void getInkAmountShouldReturn100() {
    assertEquals(100, sharpie.getInkAmount(), 0);
  }

  @Test
  public void setInkAmountShouldSetInkAmount50() {
    sharpie.setInkAmount(50);
    
    assertEquals(50, sharpie.getInkAmount(), 0);
  }
}