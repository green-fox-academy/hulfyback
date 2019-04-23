public class Aircraft extends Vehicle{
  private int maxAmmo;
  private int currentAmmo;
  private int storage;
  private int baseDamage;
  private String Type;

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public String getType() {
    return Type;
  }

  public Aircraft(int maxAmmo, int baseDamage, String type) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    Type = type;
  }

  @Override
  public int fight() {
    setCurrentAmmo(0);
    return getMaxAmmo() * baseDamage;
  }

  public int refill(int ammo) {
    if (ammo > maxAmmo) {
      setCurrentAmmo(maxAmmo);
      return ammo - maxAmmo;
    } else {
      setCurrentAmmo(ammo);
      return 0;
    }
  }
}
