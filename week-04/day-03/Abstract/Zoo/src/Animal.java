public abstract class Animal {
  protected String name;
  protected int age;
  protected String gender;

  public String getName() {
    return name;
  }

  abstract public void breed();

  abstract public void move();

  abstract public void sound();
}
