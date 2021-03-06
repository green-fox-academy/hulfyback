package main.java.exercises;

public class Animal {
  private int hungry;
  private int thirst;

  public Animal() {
    this.hungry = 50;
    this.thirst = 50;
  }

  public Animal(int hungry) {
    this.hungry = hungry;
  }

  public int getHungry() {
    return hungry;
  }

  public void setHungry(int hungry) {
    this.hungry = hungry;
  }

  public int getThirsty() {
    return thirst;
  }

  public void setThirsty(int thirst) {
    this.thirst = thirst;
  }

  public void eat() {
    this.hungry--;
  }

  public void drink() {
    this.thirst--;
  }

  public void play() {
    this.hungry++;
    this.thirst++;
  }

  @Override
  public String toString() {
    return Integer.toString(this.getHungry());
  }
}
