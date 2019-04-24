package main.java.animals;

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

  public Animal(String name) {
    this.name = name;
  }

  abstract public String breed();

  abstract public String move();

  abstract public String eat();
}
