package pages;

import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {
    //locators
    private final String searchButton = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";
    private final String searchTextField = "//textarea[@id='APjFqb']";
    private String firstResult = "";

    //constuctor
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

    public String firstResult(){
        return textFromElement(firstResult);
    }
}
