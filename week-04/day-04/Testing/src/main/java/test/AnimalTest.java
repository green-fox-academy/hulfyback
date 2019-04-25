import main.java.exercises.Animal;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {
  Animal animal;

  @Before

  public void setup() {
    animal = new Animal();
  }

  @Test

  public void getHungryShouldReturn50() {
    assertEquals(50, animal.getHungry());
  }
}
