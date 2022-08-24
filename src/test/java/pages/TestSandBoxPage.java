package pages;

import org.openqa.selenium.WebDriver;

public class TestSandBoxPage extends BasePage {

    public TestSandBoxPage() {
        super(driver);
    }

    //locators
    public String dropDown = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]";

    //methods
    public void navigateToDemoQa() {
        navigateTo("https://demoqa.com/webtables");
    }

    public void selectCategory(String category){
        selectFromDropDown(dropDown , category);
    }




}
