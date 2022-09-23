package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage {
    private String searchField = "//*[@id='twotabsearchtextbox']";
    private String searchResults = "s-suggestion-container";

    public ListPage() {
        super(driver);
    }

    public void navigate() {
        navigateTo("https://www.amazon.com/");
    }

    public void enterTheSearchCriteria() throws InterruptedException {
        Thread.sleep(600);//a thread.sleep is a bad practice
        write(searchField, "tv 55");
    }

    public List<String> getAllSearchResults() {
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> products = new ArrayList<String>();

        for (WebElement e : list) {
            //add the results to the station list
            products.add(e.getText());
        }
        return products;
    }

}
