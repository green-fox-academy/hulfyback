package main.java.animals;

public class Bird extends Animal implements ILayingEggs, IFlyable{
  boolean fly;

  public boolean isFly() {
    return fly;
  }

  public Bird(String name) {
    super(name);
  }

  public void sing() {
    System.out.println(getName() + "is singing");
  }

  @Override
  public String breed() {
    return breeding();
  }

  @Override
  public String move() {
    return "flying";
  }

  @Override
  public String eat() {
    return "beak";
  }

  @Override
  public void fly() {
    System.out.println(super.getName() + " is flying very slow.");
  }

  @Override
  public void land() {
    System.out.println(super.getName() + " is landing very fast.");
  }

  @Override
  public void takeOff() {
    System.out.println(super.getName() + " is taking off very fast.");
  }
}