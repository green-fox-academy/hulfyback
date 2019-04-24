package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    super("Bass Guitar", 4);
  }

  public BassGuitar(int numberOfStrings) {
    super("Bass Guitar", numberOfStrings);
  }

  @Override
  String sound() {
    return "Duum-duum-duum";
  }
}
