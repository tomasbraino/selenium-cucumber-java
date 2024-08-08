package pages;

public class PaginaPrincipal extends BasePage {

    //public String sectionLink = "//a[normalize-space()='%s' and @href]";
    public String sectionLink = "//a[normalize-space()='Cursos' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com/");
    }


    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

}
