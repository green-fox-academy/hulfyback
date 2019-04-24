public class Mammal extends Animal {
  boolean hoofed;

  public boolean isHoofed() {
    return hoofed;
  }

  public Mammal(String name) {
    this.name = name;
  }

  public void suckle() {
    System.out.println("The " + getGender() + getName() +" is suckling her child.");
  }

  @Override
  public String breed() {
    return "live birth";
  }

  @Override
  public String move() {
    return "Running";
  }

  @Override
  public String eat() {
    return "biting";
  }
}
