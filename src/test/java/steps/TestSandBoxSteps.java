package steps;

import io.cucumber.java.en.*;
import pages.TestSandBoxPage;

public class TestSandBoxSteps {
    TestSandBoxPage demoQaPage = new TestSandBoxPage();

    @Given("^navigate to demoqa$")
    public void navigateToDemoQa() {
        demoQaPage.navigateToDemoQa();
    }
    @When("^i click on the dropdown$")
    public void clickTheDropDown() {
        demoQaPage.clickOnTheDropDown();
    }
    @And("^the dropdown show me the options$")
    public void selectOption() {
       // demoQaPage.selectFromDropDown();
    }
    @Then("^obtain the option selected$")
    public void getTheOptionSelected() {
        //demoQaPage.navigateToDemoQa();
    }




}
