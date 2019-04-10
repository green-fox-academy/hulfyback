package solutions;

public class Strings {
//  Given a string, compute recursively (no loops) a new string where all the
//  lowercase 'x' chars have been changed to 'y' chars.
  public static String replaceChars(String str, char x, char y) {
    if (str.length() == 1) {
      return str.replace(x, y);
    } else {
      String newString = Character.toString(str.charAt(0)).replace(x, y);
      str = str.substring(1);
      return  newString + replaceChars(str, x, y);
    }
  }

  public static void main(String[] args) {
    System.out.println(replaceChars("vaxalx slxx YXXC yyyxx", 'x', 'y'));
  }
}
