package main.java.music;

abstract public class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  abstract String sound();

  public void play() {
    System.out.println(toString() + "that goues to " + sound());
  }

  public String toString() {
    return super.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument ";
  }
}
