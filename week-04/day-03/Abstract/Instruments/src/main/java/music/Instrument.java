package main.java.music;

public abstract class Instrument {
  protected String name;

  public String getName() {
    return name;
  }

  public Instrument() {
    this.name = "Instrument";
  }

  public Instrument(String name) {
    this.name = name;
  }

  abstract void play();

}
