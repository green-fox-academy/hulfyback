package solutions;

public class StringAgain {
//  Given a string, compute recursively a new string where all the 'x' chars have been removed.
  public static String removeChar(String str, char c) {
    if (str.length() == 1) {
      return (str.equals(Character.toString(c)) ? "" : str);
    } else {
      String newString = str.charAt(0) == c ? "" : Character.toString(str.charAt(0));
      str = str.substring(1);
      return newString + removeChar(str, c);
    }
  }

  public static void main(String[] args) {
    System.out.println(removeChar("Xoxoxo sexy ex", 'x'));
    System.out.println(removeChar("Xoxoxo sexy ex.", 'x'));
    System.out.println(removeChar("x", 'x'));
  }
}
