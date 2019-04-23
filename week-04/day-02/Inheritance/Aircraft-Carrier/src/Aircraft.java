public class Aircraft extends Vehicle{
  private int maxAmmo;
  private int baseDamage;
  private String Type;

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
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
    int numberOfAmmo = maxAmmo;
    setMaxAmmo(0);
    return numberOfAmmo * baseDamage;
  }

  
}
