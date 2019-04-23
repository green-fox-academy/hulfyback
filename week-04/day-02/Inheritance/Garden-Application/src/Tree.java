public class Tree extends Plant {
  public Tree(double waterLevel, String color) {
    super(waterLevel, color);
  }

  @Override
  boolean isThirsty() {
    if (getWaterLevel() < 10) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void absorbWater(double water) {
    this.setWaterLevel(this.getWaterLevel() + water * 0.4);
  }
}