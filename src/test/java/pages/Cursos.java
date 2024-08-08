package pages;

public class Cursos extends BasePage{

    public Cursos(){
        super(driver);
    }

    public String sectionLink = "//h3[normalize-space()='Fundamentos del Testing']";

    public void clickInFundamentosDelTesting(){
        clickElement(sectionLink);
    }
}
