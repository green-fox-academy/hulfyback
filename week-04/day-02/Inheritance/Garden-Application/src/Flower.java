public class Flower extends Plant {
  public Flower(double waterLevel, String color) {
    super(waterLevel, color);
  }

  @Override
  public boolean isThirsty() {
    if (getWaterLevel() < 5) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void absorbWater(double water) {
    this.setWaterLevel(this.getWaterLevel() + water * 0.75);
  }
}