package main.java.music;

abstract public class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  abstract String sound();

  void play() {
    System.out.println(toString() + "that goues to " + sound());
  }

  public String toString() {
    return this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument ";
  }
}
