package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  private String name = "Electric Guitar";

  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  String sound() {
    return "Twang";
  }
}
