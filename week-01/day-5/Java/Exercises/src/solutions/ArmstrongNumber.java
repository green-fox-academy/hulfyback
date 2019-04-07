package solutions;

import java.util.ArrayList;

public class ArmstrongNumber {
  public static ArrayList<Integer> getDigits(int number){
    ArrayList<Integer> numbers = new ArrayList();

    do{
      numbers.add(number % 10);
      number /= 10;
      if(number == 0){
        break;
      }
    }
    while(true);

    return numbers;
  }

  public static boolean isArmstrongNumber(int number) {
    ArrayList<Integer> digits = getDigits(number);
    int sum = 0;
    int pow = digits.size();

    for (int i = 0; i < pow ; i++) {
      sum += Math.pow(digits.get(i), pow);
    }

    return number == sum;
  }

  public static void printIfArmstrongNumber(int number) {
    if ( isArmstrongNumber(number)) {
      System.out.println("The " + number + " is an Armstrong number.");
    } else {
      System.out.println("The " + number + " is not an Armstrong number.");
    }
  }
}
