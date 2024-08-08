package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; //se deja de utilizar debido a que se implementa la libreria de webdrivermanager en build.gradle
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        //ChromeOptions chromeOptions = new ChromeOptions();
        //System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Desktop/chromedriver-win64");
        //driver = new ChromeDriver(chromeOptions);
        WebDriverManager.chromedriver().setup();/*Configura el WebDriver para Chrome usando WebDriverManager.
          WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador
         */
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void maximizar() {
        driver.manage().window().maximize();
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }

    public void write(String locator, String keysToSend) {
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    public void selectFromDropDown(String locator, String valueToSelect) {//select by value
        Select dropDown = new Select(Find(locator));
        dropDown.selectByValue(valueToSelect);
    }

    public void selectFromDropDown(String locator, Integer index) {//select by index
        Select dropDown = new Select(Find(locator));
        dropDown.selectByIndex(index);
    }

    public int dropdownSize(String locator) {
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();

        return dropdownOptions.size();
    }

    public List<String> getDropdownValues(String locator) {

        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();

        List<String> values = new ArrayList<>();

        for (WebElement option : dropdownOptions) {
            values.add(option.getText());
        }

        return values;

    }

    public String getTheData(String locator, int row, int col) {
        String cellINeed = locator + "/tbody/tr[" + row + "]/td[" + col + "]";
        return Find(cellINeed).getText();
    }

    public void switchToiFrame(int iFrameIndex) {
        driver.switchTo().frame(iFrameIndex);

    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String textFromElement(String locator) {
        return Find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator) {
        return Find(locator).isDisplayed();
    }

    public List<WebElement> bringMeAllElements(String locator) {
        return driver.findElements(By.name(locator));
    }

}
