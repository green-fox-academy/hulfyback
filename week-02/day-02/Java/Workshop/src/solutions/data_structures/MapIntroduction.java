package solutions.data_structures;
import java.util.Map;

import java.util.HashMap;

public class MapIntroduction {
  public static void main(String[] args) {
//    We are going to play with maps. Feel free to use the built-in methods where possible.
//
//    Create an empty map where the keys are integers and the values are characters
    Map<Integer, Character> charTable = new HashMap<>();
//
//    Print out whether the map is empty or not
    System.out.println(charTable.isEmpty());
//
//    Add the following key-value pairs to the map
//
//    Key	Value
//    97	a
//    98	b
//    99	c
//    65	A
//    66	B
//    67	C

    charTable.put(97, 'a');
    charTable.put(98, 'b');
    charTable.put(99, 'c');
    charTable.put(65, 'A');
    charTable.put(66, 'B');
    charTable.put(67, 'C');

//    Print all the keys
    System.out.println(charTable.keySet());
//
//    Print all the values
    System.out.println(charTable.values());
//
//    Add value D with the key 68
    charTable.put(68, 'D');
//
//    Print how many key-value pairs are in the map
    System.out.println(charTable.keySet().size());
//
//    Print the value that is associated with key 99
    System.out.println(charTable.get(99));
//
//    Remove the key-value pair where with key 97
    System.out.println(charTable.remove(97));
//
//    Print whether there is an associated value with key 100 or not
    System.out.println(charTable.containsKey(100));
//
//    Remove all the key-value pairs
    charTable.clear();
    System.out.println(charTable);
  }
}