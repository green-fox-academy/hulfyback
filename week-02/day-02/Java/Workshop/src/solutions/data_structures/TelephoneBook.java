package solutions.data_structures;

import java.util.*;

public class TelephoneBook {
//  We are going to represent our contacts in a map where the keys are
//  going to be strings and the values are going to be strings as well.
//
//  Create a map with the following key-value pairs.
//  Name (key)	Phone number (value)
//  William A. Lathan	405-709-1865
//  John K. Miller	402-247-8568
//  Hortensia E. Foster	606-481-6467
//  Amanda D. Newland	319-243-5613
//  Brooke P. Askew	307-687-2982

  static Map<String, String> phoneBook = new HashMap<>() {
    {
      put("William A. Lathan", "405-709-1865");
      put("John K. Miller", "402-247-8568");
      put("Hortensia E. Foster", "606-481-6467");
      put("Amanda D. Newland", "319-243-5613");
      put("Brooke P. Askew", "307-687-2982");
    }
  };
//  Create an application which solves the following problems.
//  What is John K. Miller's phone number?
  public static String getPhoneNumber(Map<String, String> phoneBook, String name) {
    return phoneBook.get(name);
  }

//  Whose phone number is 307-687-2982?
  public static String getName(Map<String, String> phoneBook, String number) {
    Set<String> names = phoneBook.keySet();
    Collection<String> numbers = phoneBook.values();
    if (numbers.contains(number)) {
      String name = "";
      for (Map.Entry<String, String> contact : phoneBook.entrySet()) {
        if (contact.getValue().equals(number)) {
          name = contact.getKey();
          break;
        }
      }
      return name;
    } else {
      return "I don't know";
    }
  }

//  Do we know Chris E. Myers' phone number?
  public static String hasPhoneNumber(Map<String, String> phoneBook, String name) {
    if (phoneBook.containsKey(name)) {
      return "Yes";
    } else {
      return "No";
    }
  }

  public static void main(String[] args) {
    System.out.println("What is John K. Miller's phone number?\n" + getPhoneNumber(phoneBook, "John K. Miller"));
    System.out.println("Whose phone number is 307-687-2982?\n" + getName(phoneBook, "307-687-2982"));
    System.out.println("Do we know Chris E. Myers' phone number?\n" + hasPhoneNumber(phoneBook, "Chris E. Myers"));
  }
}