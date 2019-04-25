import main.java.exercises.Sum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTest {
  private Sum sum;
  private int sumOfNumbers;
  private ArrayList<Integer> numberList;

  @Before
  public void setup() {
    sum = new Sum();
  }

  @Test
  public void sumShouldReturnSumOfNumbersCorrectly() {
    numberList = new ArrayList<>(Arrays.asList(1, 2, 3));
    sumOfNumbers = sum.sum(numberList);

    Assert.assertEquals(6, sumOfNumbers);
  }

  @Test

  public void sumShouldNotReturnSumOfNumbersCorrectly() {
    numberList = new ArrayList<>(Arrays.asList(1, 2, 3));
    sumOfNumbers = sum.sum(numberList);

    Assert.assertNotEquals(4, sumOfNumbers);
  }

  @Test

  public void sumShouldReturnZeroOnEmptyList() {
    numberList = new ArrayList<>();
    sumOfNumbers = sum.sum(numberList);

    Assert.assertEquals(0, sumOfNumbers);
  }

  @Test

  public void sumShouldReturnCorrectlyOnOneElementList() {
    numberList = new ArrayList<>(Arrays.asList(5));
    sumOfNumbers = sum.sum(numberList);

    Assert.assertEquals((int) numberList.get(0), sumOfNumbers);
  }
}