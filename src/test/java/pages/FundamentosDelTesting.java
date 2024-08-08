package pages;

public class FundamentosDelTesting extends BasePage{

    public FundamentosDelTesting(){
        super(driver);
    }

    public String sectionLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    public void clickInIntroduccion(){
        clickElement(sectionLink);
    }
}
