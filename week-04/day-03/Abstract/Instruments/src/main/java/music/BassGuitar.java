package main.java.music;

public class BassGuitar extends StringedInstrument {
  private String name = "Bass Guitar";

  public BassGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  String sound() {
    return "Duum-duum-duum";
  }
}
