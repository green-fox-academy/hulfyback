public class Tree extends Plant {
  public Tree(double waterLevel, String color) {
    super(waterLevel, color);
  }

  @Override
  boolean needWater() {
    if (getWaterLevel() < 10) {
      return true;
    } else {
      return false;
    }
  }
}
