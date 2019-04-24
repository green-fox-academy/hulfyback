public class Shifter implements CharSequence {
  private String word;
  private int numberToShift;

  public String getWord() {
    return word;
  }

  public int getNumberToShift() {
    return numberToShift;
  }

  public Shifter(String word, int numberToShift) {
    this.word = word;
    this.numberToShift = numberToShift;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return  getWord().charAt((index + getNumberToShift()) % getWord().length());
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
