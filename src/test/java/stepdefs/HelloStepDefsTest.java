package stepdefs;

import io.cucumber.java.en.Given;

public class HelloStepDefsTest {

    @Given("I print {string}")
    public void i_print(String message) {
        System.out.println(message);
    }
}
