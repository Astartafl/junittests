package mediumTests;

import application.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

public class MediumTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - average value
  @Category(Smoke.class)
  @Test
  public void testAverageBetweenThreePositiveValues() {
    double actualResult = calc.average(6, 3, 12);
    assertEquals("calc.average should be 7", 7, actualResult, 0.001);
  }
  //TODO (**)
  //add tests for new method - even or odd
  @Category(Smoke.class)
  @Test
  public void testOddPositiveValue() {
    boolean actualResult = calc.evenOrOdd(7);
    assertFalse("calc.evenOrOdd(7) should be false", actualResult);
  }
  @Category(Smoke.class)
  @Test
  public void testEvenPositiveValue() {
    boolean actualResult = calc.evenOrOdd(12);
    assertTrue("calc.evenOrOdd(12) should be true", actualResult);
  }

  //TODO (**)
  //add tests for new method - biggest value
  @Category(Smoke.class)
  @Test
  public void testBiggestValuePositiveValue() {
    int actualResult = calc.biggestValue(8, 7);
    assertEquals("8 > 7", 8, actualResult);
  }
  @Category(Smoke.class)
  @Test
  public void testEqualsValuePositiveValue() {
    int actualResult = calc.biggestValue(7, 7);
    assertEquals("Result should be 0", 0, actualResult);
  }
}
