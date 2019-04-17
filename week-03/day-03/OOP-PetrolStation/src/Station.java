public class Station {
  private int gasAmount;

  public Station() {
    this.gasAmount = 100000;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void refill(Car car) {
    this.gasAmount -= car.getCapacity();
    car.setGasAmount(car.getCapacity());
  }
}
