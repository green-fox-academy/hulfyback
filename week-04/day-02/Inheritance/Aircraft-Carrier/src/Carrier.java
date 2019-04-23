import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int storeOfAmmo;
  private double healthPoint;

  public Carrier(int storeOfAmmo, double healthPoint) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
    this.aircrafts = new ArrayList<>();
  }
}
