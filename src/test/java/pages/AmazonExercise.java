package pages;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;

public class AmazonExercise extends BasePage {

    public AmazonExercise() {
        super(driver);
    }

    private String searchField = "//*[@id='twotabsearchtextbox']";
    private String pageNumber = "//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[27]/div/div/span/a[1]";
    private String searchButton = "//*[@id='nav-search-submit-button']";
    private String product = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span";
    private String addToCart = "//*[@id='exportsUndeliverable-cart-announce']";

    public void navigateTo() {
        BasePage.navigateTo("https://www.amazon.com/");
    }

    public void searchProduct(String criteria) {
        write(searchField, criteria);
    }

    public void clickSearch() {
        clickElement(searchButton);
    }

    public void navigateInAmazon(String pageNumber) {
        clickElement(pageNumber);
    }

    public void thirdProduct() {

        clickElement(product);
    }

    public void addToCart(){
        clickElement(addToCart);
    }

    // public

}
