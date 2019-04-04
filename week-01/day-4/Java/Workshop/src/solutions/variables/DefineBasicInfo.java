package solutions.variables;

import solutions.Decoration;

public class DefineBasicInfo {
  // Define several things as a variable then print their values
  // Your name as a string
  // Your age as an integer
  // Your height in meters as a double
  // Whether you are married or not as a boolean

  public static void defineBasicInfo(String name, int age, double height, boolean married) {
    Decoration.decorate("10");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    if(married == true){
      System.out.println("Married: Yes");
    }
    else System.out.println("Married: No");
  }
}
