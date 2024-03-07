package cc.secondbrain.trade.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SkeletonSteps {

    private String today;
    private String actual;

    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actual = DayChecker.isFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expected) {
        assertThat(actual).isEqualTo(expected);
    }

    private static class DayChecker {
        public static String isFriday(String day) {
            return "Friday".equals(day) ? "TGIF" : "Nope";
        }
    }
}
