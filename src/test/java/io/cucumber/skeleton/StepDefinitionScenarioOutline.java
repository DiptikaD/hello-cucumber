package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class IsItFridayOutline{
    static String isItFriday(String today){
        return today.equals("Friday")?"Of course!":"Nope";
    }
}

public class StepDefinitionScenarioOutline {
    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void todayIs(String today) {

    }

    @When("Whether I ask it's Friday yet")
    public void iAskWhetherItsFridayYet(){

    }

    @Then("I should be told \\{<answer>}")
    public void iShouldBeToldAnswer() {
    }
}
