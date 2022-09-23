package steps;

import io.cucumber.java.en.*;
import pages.AmazonExercise;

public class AmazonSteps {

    AmazonExercise amazon = new AmazonExercise();
    @Given("^navigate to amazon web site$")
    public void navigateToAmazon(){
        amazon.navigateTo();
    }
    @When("^search for the (.+)$")
    public void search(String criteria){
        amazon.searchProduct(criteria);
        amazon.clickSearch();
    }
    @And("^go to the page number (.+)$")
    public void clickTheNextPage(String pageNumber){
        amazon.navigateInAmazon(pageNumber);
    }
    @And("^pick the third element$")
    public void clickTheThirdElement(){
        amazon.thirdProduct();
    }


    @Then("^added to the cart$")
    public void getTheResults(){

    }
}
