import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int storeOfAmmo;
  private double healthPoint;
  private int totalDamage;

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

  public int getTotalDamage() {
    return totalDamage;
  }

  public void setTotalDamage(int totalDamage) {
    for (Aircraft aircraft: aircrafts) {
      this.totalDamage += aircraft.getAllDamage();
    }
  }

  public Carrier(int storeOfAmmo, double healthPoint) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
    this.aircrafts = new ArrayList<>();
    this.totalDamage = 0;
  }

  public void addAircraft (Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void fight(Carrier carrier) {
    for (Aircraft aircraft: aircrafts) {
      carrier.setHealthPoint(carrier.getHealthPoint() -  aircraft.fight());
    }
  }

  public String getStatus() {
    String status =  "HP: " + getHealthPoint()
        + ", Aircraft count: " + aircrafts.size()
        + ", Ammo Storage: " + getStoreOfAmmo()
        + ", Total Damage: " + getTotalDamage() + "\nAircrafts:\n";

    for (Aircraft aircraft: aircrafts) {
      status += aircraft.getStatus() + "\n";
    }
    return status;
  }
}
