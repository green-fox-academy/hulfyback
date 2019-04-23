public class Plant {
  private double waterLevel;
  private String color;

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public String getColor() {
    return color;
  }

  public Plant(double waterLevel, String color) {
    this.waterLevel = waterLevel;
    this.color = color;
  }

  boolean isThirsty() {
    return true;
  }

  public void absorbWater(double water) {
    waterLevel += water;
  }

  public String toString() {
    return getColor() + " " + getClass().toString().split(" ")[1];
  }
}
