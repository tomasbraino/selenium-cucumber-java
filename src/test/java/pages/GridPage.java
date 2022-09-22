package pages;

import org.openqa.selenium.WebElement;

public class GridPage extends BasePage {

    private String cell = "//*[@id='root']/div/";
    private String mainTable = "//*[@id='root']/div/table";
    ///html/body/div/main/div/article/section/section/table[3]
    public GridPage(){
        super(driver);
    }

    public void navigateToGrid(){
        navigateTo("https://1v2njkypo4.csb.app/");
    }

    public String getTheCell(int row, int column){
        return getTheData(cell, row, column);
    }

    public boolean cellStatus(){
        return elementIsDisplayed(mainTable);
    }


}
