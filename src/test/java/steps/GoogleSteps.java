package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^navigate to google$")
    public void navigateToGoogle() {
        google.navigateToGoogle();
        google.clickGoogleSearch();
    }

    @When("^looking for something$")
    public void lookingForSomething() {

    }

    @And("^click on the search button$")
    public void searchInGoogle() {

    }

    @Then("^obtain the output$")
    public void validateResults() {

    }

}
