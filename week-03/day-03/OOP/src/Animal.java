public class Animal {
  private int hungry;
  private int thirst;

  public Animal() {
    this.hungry = 50;
    this.thirst = 50;
  }

  public int getHungry() {
    return hungry;
  }

  public void setHungry(int hungry) {
    this.hungry = hungry;
  }

  public int getThirst() {
    return thirst;
  }

  public void setThirst(int thirst) {
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
}
