package solutions.variables;

import solutions.Decoration;
import java.lang.Math;

public class VariableMutation {
  public static void variableMutation() {
    Decoration.decorate("11");
    int a = 3;
    // make the "a" variable's value bigger by 10
    a += 10;
    System.out.println("a + 10:  " + a);

    int b = 100;
    // make b smaller by 7
     b -= 7;

    System.out.println("b - 7: " + b);

    int c = 44;
    // please double c's value

    c *= 2;

    System.out.println("c * 2: " + c);

    int d = 125;
    // please divide by 5 d's value

    d /= 5;

    System.out.println("d divided by 5: " + d);

    int e = 8;
    // please cube of e's value

    e = (int) Math.pow(e, 3);

    System.out.println("e^3: " +e);

    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    System.out.println("fa > f2: " + (f1 > f2));

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)

    System.out.println("2 * g2 > g1: " + (g1 < (2 * g2)));

    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)

    System.out.println("11 is a divisor: " + (h % 11 == 0));

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

    int i2_squared = (int) Math.pow(i2, 2);
    int i2_cubed = (int) Math.pow(i2, 3);
    System.out.println("i2^2 < i1 < i2^3: " + ((i1 > i2_squared) && (i1 < i2_cubed)));

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)

    System.out.println("j is divible by 3 or 5: " + (j % 3 == 0 || j % 5 == 0));
  }
}
