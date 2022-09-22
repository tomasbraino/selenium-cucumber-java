package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.GooglePage;


public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^navigate to google$")
    public void navigateToGoogle() {
        google.navigateToGoogle();
    }

    @When("^looking for something$")
    public void lookingForSomething() {
        google.enterSearchCriteria("Google");
    }

    @And("^click on the search button$")
    public void searchInGoogle() {
        google.clickGoogleSearch();
    }

    @Then("^obtain the output$")
    public void validateResults() {
        Assert.assertEquals("Text expected", google.firstResult());
    }

}

