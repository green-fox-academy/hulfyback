public class Bird extends Animal {
  boolean fly;

  public boolean isFly() {
    return fly;
  }

  public Bird(String name) {
    this.name = name;
  }

  public void sing() {
    System.out.println(getName() + "is singing");
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public String move() {
    return "flying";
  }

  @Override
  public String eat() {
    return "by beak";
  }
}