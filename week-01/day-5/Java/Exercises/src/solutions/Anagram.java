package solutions;

public class Anagram {
  public static String reverseString(String input){
    String reverse;
    if(input.length() == 1){
      reverse = input;
    }

    else {
      reverse = Character.toString(input.charAt(input.length() - 1));
      for (int i = input.length()-2; i >= 0; i--) {
        reverse += Character.toString((input.charAt(i)));
      }
    }
    return reverse;
  }

  public static boolean anagram(String input_a, String input_b){
    return( input_a.equals(reverseString(input_b)));
  }
}
