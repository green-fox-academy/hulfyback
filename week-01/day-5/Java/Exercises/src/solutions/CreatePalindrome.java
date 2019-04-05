import solutions.Anagram;

public class CreatePalindrom {
  public static String createPalindrom(String input){
    String palindrome = input;
    palindrome += Anagram.reverseString(input);

    return palindrome;
  }
}
