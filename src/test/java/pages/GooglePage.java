package pages;

import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {
    //locators
    private String searchButton = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]";
    private String searchTextField = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]";

    public GooglePage() {
        super(driver);

    }
    //methods
    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch() {
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria) {
        write(searchTextField, criteria);
    }
}
