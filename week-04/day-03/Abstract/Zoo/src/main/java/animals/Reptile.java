package main.java.animals;

public class Reptile extends Animal implements ILayingEggs{
  protected int temperature;

  public int getTemperature() {
    return temperature;
  }

  public Reptile(String name) {
    super(name);
  }

  public void sunbath() {
    System.out.println(getName() + "is taking a sunbath");
  }

  @Override
  public String breed() {
    return breeding();
  }

  @Override
  public String move() {
    return "walking";
  }

  @Override
  public String eat() {
    return "swallowing the whole corp";
  }
}
