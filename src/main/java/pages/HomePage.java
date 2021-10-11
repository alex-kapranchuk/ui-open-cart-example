package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id='cart']/button")
    private WebElement cartButton;
    @FindBy(name = "search")
    private WebElement inputSearch;
    @FindBy(id = "logo")
    private WebElement logo;
    @FindBy(xpath = "//*[@id='search']/span")
    private WebElement clickSearch;

    @FindBy(xpath = "//*[contains(text(),'TestTax')]")
    private WebElement taxCounter;

    public WebElement getTaxCounter() {
        wait.until(ExpectedConditions.visibilityOf(taxCounter));
        return taxCounter;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

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
