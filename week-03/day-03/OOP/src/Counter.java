public class Counter {
  private int counter;

  public Counter() {
    this.counter =  0;
  }

  public Counter(int counter) {
    this.counter = counter;
  }

  public int get() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  public void add() {
    this.counter++;
  }

  public void add(int n) {
    this.counter += n;
  }

  public void reset() {
    this.counter = 0;
  }
}
