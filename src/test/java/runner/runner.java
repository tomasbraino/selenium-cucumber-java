package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.Plugin;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "steps",
        plugin = { "pretty", "html:target/cucumber-reports"},
        monochrome = true,
        tags = "@Test"

)

public class runner {
    @AfterClass
    public static void cleanDriver(){
            BasePage.closeBrowser();
    }
}
