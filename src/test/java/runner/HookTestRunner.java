package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features/hook-test.feature",
    glue = {"hooks", "stepDefinition"},
    plugin = {"pretty"}
)
public class HookTestRunner extends AbstractTestNGCucumberTests {
}
