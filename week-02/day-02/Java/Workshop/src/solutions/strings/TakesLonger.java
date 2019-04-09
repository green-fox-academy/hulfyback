package solutions.strings;

public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    String missingPart = " always takes longer than ";
    String[] quoteArray = quote.split(" ");
    quote = "";

    for (String word : quoteArray) {
      if (word.equals("It")) {
        quote = quote.concat(word.concat(missingPart));
      } else {
        quote = quote.concat(word.concat(" "));
      }
    }

    quote = quote.strip();

    System.out.println(quote);
  }
}
