package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
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
        String value = gridPage.getTheCell(1, 2);
        Assert.assertEquals("1 a", value);
    }
    @Then("^show the table$")
    public void theTableIsThere() {
        Assert.assertTrue("No, it is not", gridPage.cellStatus());
    }
}
