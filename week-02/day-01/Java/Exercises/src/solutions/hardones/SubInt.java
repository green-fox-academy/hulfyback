package solutions.hardones;

public class SubInt {
  //  Create a function that takes a number and an array of integers as a parameter
  //  Returns the indices of the integers in the array of which the first number is a part of
  //  Or returns an empty array if the number is not part of any of the integers in the array

  //  Example:
//    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
  //  should print: `[0, 1, 4]`
//    System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));

  public static boolean containsNumber(int number, int otherNumber){
    String numberString = Integer.toString(number);
    String otherNumberString = Integer.toString(otherNumber);

    return numberString.contains( otherNumberString);
  }

  public static int countOfOthernNumber(int number, int[] array) {
    int sizeOfOutputArray = 0;
    for (int element : array) {
      if (containsNumber(element, number)) {
        sizeOfOutputArray++;
      }
    }
    return sizeOfOutputArray;
  }

  public static int[] subInt(int number, int[] array) {
    int[] output = new int[countOfOthernNumber(number, array)];
    int i = 0;
    for (int j = 0; j < array.length; j++) {
      if (containsNumber(array[j], number)) {
        output[i] = j;
        i++;
      }
    }
    return output;
  }
}