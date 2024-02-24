package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage {
    private String searchField = "//*[@id='twotabsearchtextbox']";
    private String searchResults = "name";

    public ListPage() {
        super(driver);
    }

    public void navigate() {
        navigateTo("https://www.amazon.com/");
    }

    public void enterTheSearchCriteria() throws InterruptedException {
        Thread.sleep(900); //a thread.sleep is a bad practice
        write(searchField, "alexa");
    }

   /* public void clickTheDropdown(){
        clickElement(searchField);
    }*/

    public List<String> getAllSearchResults() {
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> products = new ArrayList<>();

        for (WebElement e : list) {
            //add the results to the station list
            products.add(e.getText());
        }
        return products;
    }

}
