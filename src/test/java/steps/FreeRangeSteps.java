package steps;

import io.cucumber.java.en.*;
import pages.*;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    FundamentosDelTesting fundamentosDelTesting = new FundamentosDelTesting();
    Cursos cursos = new Cursos();

   /* @Given("I navigate to www.freerangetesters.com")
    public void navigateToFRT() {
        landingPage.navigateToFreeRangeTesters();

    }

    @When("I go to {word} using the navigation bar")
    public void goToSection(String section) {
        landingPage.clickOnSectionNavigationBar(section);

    }*/

    @Given("I navigate to www.freerangetesters.com")
    public void navigateToFreeRangeTesters() {
        landingPage.navigateToFreeRangeTesters();
        landingPage.maximizar();
    }

    @When("I go to Cursos using the navigation bar")
    public void clickCursos() {
        landingPage.clickElement(landingPage.sectionLink);
    }

    @And("I click in fundamentos del testing")
    public void clickFundamentos() {
        cursos.clickInFundamentosDelTesting();
    }

   /* @Then("I click on introduccion al testing de software")
    public void clickEnIntroduccion() {

    }*/


}
