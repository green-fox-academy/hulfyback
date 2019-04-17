public class PostIt {
  private String backGroundColor;
  private String text;
  private String textColor;

  public PostIt(String backGroundColor, String text, String textColor) {
    this.backGroundColor = backGroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public String getBackGroundColor() {
    return backGroundColor;
  }

  public void setBackGroundColor(String backGroundColor) {
    this.backGroundColor = backGroundColor;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }
}
