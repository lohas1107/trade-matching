package cc.secondbrain.trade.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SkeletonSteps {

    private String today;
    private String actual;

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        DayChecker dayChecker = new DayChecker();
        actual = dayChecker.isFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String reply) {
        assertThat(actual).isEqualTo(reply);
    }

    private static class DayChecker {
        public String isFriday(String day) {
            return "Nope";
        }
    }
}
