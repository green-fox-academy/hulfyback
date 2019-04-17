public class Sharpie {
  private String color;
  private double width;
  private float inkAmount;

  public Sharpie(String color, double widtht) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public Sharpie(int inkAmount) {
    this.color = "bule";
    this.width = 11;
    this.inkAmount = inkAmount;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getInkAmount() {
    return this.inkAmount;
  }

  public void setInkAmount(float inkAmount) {
    this.inkAmount = inkAmount;
  }

  public void use() {
    this.inkAmount -= 1 + (Math.random() * 8);
  }
}
