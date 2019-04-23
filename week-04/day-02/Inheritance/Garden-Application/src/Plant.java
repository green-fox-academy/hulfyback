public class Plant {
  private double waterLevel;
  private String color;

  public double getWaterLevel() {
    return waterLevel;
  }

  public String getColor() {
    return color;
  }

  public Plant(double waterLevel, String color) {
    this.waterLevel = waterLevel;
    this.color = color;
  }

  boolean needWater() {
    return true;
  }

  public String toString() {
    return getColor() + " " + getClass().toString().split(" ")[1];
  }
}
