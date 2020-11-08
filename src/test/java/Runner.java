import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import hardTests.Regular;
import mediumTests.Smoke;
import mediumTests.MediumTestClass;
import simpleTests.Regression;
import simpleTests.SimpleTestClass;

@RunWith(Categories.class)
@Categories.IncludeCategory({Regression.class, Smoke.class})
@Categories.ExcludeCategory(Regular.class)
@Suite.SuiteClasses({SimpleTestClass.class, MediumTestClass.class})

public class Runner {
}
