public class Counter {
  private int counter;
  private int defaultCounter;

  public Counter() {
    this.defaultCounter = 0;
    this.counter =  0;
  }

  public Counter(int counter) {
    this.defaultCounter = counter;
    this.counter = counter;
  }

  public int get() {
    return this.counter;
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
    this.counter = this.defaultCounter;
  }
}
