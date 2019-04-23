public class Aircraft{
  private int maxAmmo;
  private int currentAmmo;
  private int storage;
  private int baseDamage;
  private int allDamage;
  private String type;

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getAllDamage() {
    return allDamage;
  }

  public void setAllDamage(int allDamage) {
    this.allDamage = allDamage;
  }

  public String getType() {
    return type;
  }

  public Aircraft(int maxAmmo, int baseDamage, String type) {
    this.maxAmmo = maxAmmo;
    this.currentAmmo = maxAmmo;
    this.storage = 0;
    this.baseDamage = baseDamage;
    this.allDamage = 0;
    this.type = type;
  }

  public int fight() {
    int usedAmmo = getCurrentAmmo();
    setCurrentAmmo(0);
    setAllDamage(getAllDamage() + usedAmmo* baseDamage);
    return usedAmmo * baseDamage;
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

  public String getStatus() {
    return "Type: " + getType()
        + ", Ammo: " + getCurrentAmmo()
        + ", Base Damage: " + getBaseDamage()
        + ", All Damage: " + getAllDamage();
  }
}
