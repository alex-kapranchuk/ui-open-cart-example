package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {


    @FindBy(name = "search")
    private WebElement inputSearch;
    @FindBy(id = "logo")
    private WebElement logo;
    @FindBy(xpath = "//*[@id='search']/span")
    private WebElement clickSearch;


    public WebElement getInputSearch() {
        return inputSearch;
    }

    public WebElement getLogo() {
        wait.until(ExpectedConditions.visibilityOf(logo));
        return logo;
    }

    public WebElement getClickSearch() {
        return clickSearch;
    }



}
