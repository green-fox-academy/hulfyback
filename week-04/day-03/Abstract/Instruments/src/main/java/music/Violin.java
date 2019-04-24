package main.java.music;

public class Violin extends StringedInstrument{
  public Violin() {
    super("Violin", 4);
  }

  @Override
  String sound() {
    return "Screech";
  }
}
