import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int storeOfAmmo;
  private double healthPoint;

  public List<Aircraft> getAircrafts() {
    return aircrafts;
  }

  public int getStoreOfAmmo() {
    return storeOfAmmo;
  }

  public void setStoreOfAmmo(int storeOfAmmo) {
    this.storeOfAmmo = storeOfAmmo;
  }

  public double getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(double healthPoint) {
    this.healthPoint = healthPoint;
  }

  public Carrier(int storeOfAmmo, double healthPoint) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
    this.aircrafts = new ArrayList<>();
  }

  public void addAircraft (Aircraft aircraft) {
    aircrafts.add(aircraft);
  }


}
