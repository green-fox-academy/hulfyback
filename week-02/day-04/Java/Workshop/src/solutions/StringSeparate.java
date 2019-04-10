package solutions;

public class StringSeparate {
//  Given a string, compute recursively a new string where all the adjacent chars are now separated by a *
  public static String separateString(String str, char c) {
    if (str.length() == 1) {
      return str;
    } else {
      String newString = Character.toString(str.charAt(0)) + Character.toString(c);
      str = str.substring(1);
      return newString + separateString(str, c);
    }
  }

  public static void main(String[] args) {
    System.out.println(separateString("String string", '*'));
    System.out.println(separateString("**", '*'));
  }
}
