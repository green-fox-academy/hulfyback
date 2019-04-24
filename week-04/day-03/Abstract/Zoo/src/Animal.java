public abstract class Animal {
  protected String name;
  protected int age;
  protected String gender;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  abstract public void breed();

  abstract public void move();

  abstract public void sound();
}
