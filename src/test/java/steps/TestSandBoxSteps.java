package steps;

import io.cucumber.java.en.*;
import pages.TestSandBoxPage;

public class TestSandBoxSteps {
    TestSandBoxPage demoQaPage = new TestSandBoxPage();

    @Given("^navigate to demoqa$")
    public void navigateToDemoQa() {
        demoQaPage.navigateToDemoQa();
    }

    @And("^obtain the option selected$")
    public void selectOption() {
        demoQaPage.clickElement(demoQaPage.dropDown);
        demoQaPage.selectCategory("50");
    }


}
