import main.java.exercises.Sum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTest {
  private Sum sum;
  private int result;
  private ArrayList<Integer> numberList;

  @Before
  public void setup() {
    sum = new Sum();
    numberList = new ArrayList<>(Arrays.asList(1, 2, 3));
    result = sum.sum(numberList);
  }

  @Test
  public void sumShouldReturnSumOfNumbersCorrectly() {
    Assert.assertEquals(6, result);
  }

  @Test
  public void sumShouldNotReturnSumOfNumbersCorrectly(){
    Assert.assertNotEquals(4, result);
  }
}