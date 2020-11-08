package hardTests;

import application.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.assertEquals;

public class HardTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - divide by zero case
  @Category(Regular.class)
  @Test
  public void testZeroDivisionPositiveValue() {
    double actualResult = calc.zeroDivision( 18, 6);
    assertEquals("calc.zeroDivision( 18, 6) should be 3", 3, actualResult, 0.001);
  }
  //TODO (**)
  //add tests for new method - addition with multiple parameters
  @Category(Regular.class)
  @Test
  public void testMultiAdditionPositiveValue() {
    int actualResult = calc.multiAddition(8, 7, 6);
    assertEquals("multiAddition 8+7+6+ = 21", 21, actualResult);
  }
}
