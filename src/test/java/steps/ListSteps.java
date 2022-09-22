package steps;

import io.cucumber.java.en.*;
import pages.ListPage;

import java.util.List;

public class ListSteps {

    ListPage listPage = new ListPage();

    @Given("^navigate to web page$")
    public void navigateToTheList() {
        listPage.navigate();
    }

    @When("^search inside the list$")
    public void searchInsideTheList() throws InterruptedException {
        listPage.enterTheSearchCriteria();
    }

    @Then("^show the text selected$")
    public void showTheTextSelected() throws InterruptedException {
        List<String> list = listPage.getAllSearchResults();
        boolean textIsThere = list.contains("tv 55");

        if (textIsThere) {
            System.out.println("The product that you are looking for is available");
        } else {
            throw new InterruptedException("The product that you are looking for is not available");
        }

    }


}
