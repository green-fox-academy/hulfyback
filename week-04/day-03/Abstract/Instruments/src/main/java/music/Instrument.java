package main.java.music;

public abstract class Instrument {
  protected String name;

  public String getName() {
    return name;
  }

  abstract void play();

}
