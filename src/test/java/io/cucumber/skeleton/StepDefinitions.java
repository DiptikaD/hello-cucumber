package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

class IsItFriday{
    static String isItFriday(String today){
        return today.equals("Friday") ? "Of course!":"Nope";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;

//    @Given("today is Friday")
//    public void todayIsFriday() {
//        today = "Friday";
//    }
//
//    @Given("today is Sunday")
//    public void todayIsSunday() {
//        today="Sunday";
//    }
    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertThat(actualAnswer).isEqualTo(expectedAnswer);
    }
}
