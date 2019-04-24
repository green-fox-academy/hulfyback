package main.java.animals;

public class Mammal extends Animal {
  boolean hoofed;

  public boolean isHoofed() {
    return hoofed;
  }

  public Mammal(String name) {
    super(name);
  }

  public void suckle() {
    System.out.println("The " + getGender() + getName() +" is suckling her child.");
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }

  @Override
  public String move() {
    return "r unning";
  }

  @Override
  public String eat() {
    return "biting";
  }
}
