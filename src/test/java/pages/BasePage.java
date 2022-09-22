package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "/Users/tomasbrainovich/Documents/Drivers/chromedriver");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }

    public void write(String locator, String textToWrite) {
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropDown(String locator, String valueToSelect) {
        Select dropDown = new Select(Find(locator));
        dropDown.selectByValue(valueToSelect);
    }

    public void selectFromDropDown(String locator, Integer valueToSelect) {
        Select dropDown = new Select(Find(locator));
        dropDown.selectByIndex(valueToSelect);
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

    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }

    public List<WebElement> bringMeAllElements(String locator){
        return driver.findElements(By.className(locator));
    }

}
