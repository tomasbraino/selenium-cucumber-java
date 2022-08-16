package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^I am on the google search page$")
    public void navigateToGoogle() {
        navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void lookingForSomething() {

    }

    @And("^I press on the search button$")
    public void searchInGoogle() {

    }

    @Then("^The results match the criteria$")
    public void validateResults() {

    }

}
