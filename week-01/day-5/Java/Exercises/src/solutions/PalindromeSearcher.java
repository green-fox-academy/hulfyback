package solutions;

import java.util.ArrayList;

public class PalindromeSearcher {

  public static boolean isPalindrome(String input) {
    int i = 0;
    int j = input.length() - 1;

    do {
      if (input.charAt(i) != input.charAt(j)) {
        break;
      } else {
        i++;
        j--;
      }

      if (i >= j) {
        return true;
      }
    } while (true);

    return false;
  }

  public static ArrayList<String> getPalindromes(String input) {
    int lengthOfInput = input.length();
    ArrayList<String> palindromes = new ArrayList<String>();

    if (lengthOfInput <= 2) {
      return palindromes;
    } else {
      for (int i = 0; i < lengthOfInput - 2 ; i++) {
        for (int j = i + 2; j < lengthOfInput ; j++) {
          String subString = input.substring(i, j) + Character.toString(input.charAt(j));
          if (isPalindrome(subString)) {
            palindromes.add(subString);
          }
        }
      }
      return palindromes;
    }
  }

  public static void printPalindromesFromAString (String input) {
    ArrayList palindromes = getPalindromes(input);
//    palindromes.forEach(palindrome -> System.out.print("\"" + palindrome + "\"" + " "));

    System.out.println(palindromes.toString());

  }
}

