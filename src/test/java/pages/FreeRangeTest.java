package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class FreeRangeTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //Starts the WebDriver for chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void navigateToFreeRangeTesters() {
        //Navigate to the target web
        driver.get("https://www.freerangetesters.com");
    }

    @AfterMethod
    public void tearDown() {
        //Close the web browser
        if (driver != null) {
            driver.quit();
        }
    }
}
