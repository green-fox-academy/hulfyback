public class Flower extends Plant {
  public Flower(double waterLevel, String color) {
    super(waterLevel, color);
  }

  @Override
  public boolean needWater() {
    if (getWaterLevel() < 5) {
      return true;
    } else {
      return false;
    }
  }
}
