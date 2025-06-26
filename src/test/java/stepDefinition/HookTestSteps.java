package stepDefinition;

import io.cucumber.java.en.Given;

public class HookTestSteps {
    @Given("I run the hook test")
    public void i_run_the_hook_test() {
        System.out.println("Running dummy step for hook test");
    }
}
