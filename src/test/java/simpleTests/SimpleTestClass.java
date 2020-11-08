package simpleTests;

import application.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

public class SimpleTestClass {

  Calculator calc = new Calculator();
  @Category(Regression.class)
  @Test
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    assertEquals("10 + 5 must be 15", 15, actualResult);
  }

  // TODO (*)
  //add tests for new methods (multiply, division, subtraction, square root, x^2)

  @Category(Regression.class)
  @Test
  public void testSubTwoPositiveValues() {
    int actualResult = calc.sub(10, 5);
    assertEquals("10 - 5 must be 5", 5, actualResult);
  }
  @Category(Regression.class)
  @Test
  public void testMulTwoPositiveValues() {
    int actualResult = calc.mul(6, 5);
    assertEquals("6 * 5 must be 30", 30, actualResult);
  }
  @Category(Regression.class)
  @Test
  public void testDivTwoPositiveValues() {
    int actualResult = calc.div(10, 5);
    assertEquals("10 / 5 must be 2", 2, actualResult);
  }
  @Category(Regression.class)
  @Test
  public void testSquareTwoPositiveValues() {
    double actualResult = calc.squ(49);
    assertEquals("sqrt(49) should be 7", 7, actualResult, 0.001);
  }
  @Category(Regression.class)
  @Test
  public void testPowTwoPositiveValues() {
    double actualResult = calc.pow(7);
    assertEquals("pow(7) should be 49", 49, actualResult, 0.001);
  }
}

