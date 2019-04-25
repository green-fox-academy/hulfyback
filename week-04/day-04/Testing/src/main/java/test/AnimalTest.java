import static org.junit.Assert.assertEquals;

import main.java.exercises.Animal;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

  private Animal animal;

  @Before
  public void setup() {
    animal = new Animal();
  }

  @Test
  public void getHungryShouldReturn50() {
    assertEquals(50, animal.getHungry());
  }

  @Test
  public void setHungryShouldSetHungry60() {
    animal.setHungry(60);

    assertEquals(60, animal.getHungry());
  }

  @Test
  public void getThirstyShouldReturn50OnDefaultContructor() {
    assertEquals(50, animal.getThirsty());
  }

  @Test
  public void setThirstyShouldSetThirsty60() {
    animal.setThirsty(60);

    assertEquals(60, animal.getThirsty());
  }

  @Test
  public void eatShouldSetHungry49() {
    animal.eat();

    assertEquals(49, animal.getHungry());
  }
}
