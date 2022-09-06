package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import pages.GridPage;

public class GridSteps {

    GridPage gridPage = new GridPage();

    @Given("^navigate to a sample grid$")
    public void navigateTo() {
        gridPage.navigateToGrid();
    }

    @Then("^extract the data$")
    public void returnTheData() {
        String value = gridPage.getTheCell(1, 1);
        System.out.println(value);
    }
}
