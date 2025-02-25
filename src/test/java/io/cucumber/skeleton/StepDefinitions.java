package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class IsItFriday{
    static String isItFriday(String today){
        return null;
    }
}

public class StepDefinitions {
    @Given("today is Sunday")
    public void todayIsSunday() {
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
    }
}
