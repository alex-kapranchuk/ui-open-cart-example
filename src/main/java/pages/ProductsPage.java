package pages;

import bussiness.HomePageBL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//*[@id='button-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(@class, 'alert alert-success alert-dismissible')]/text()[1]")
    private WebElement alertMessage;

    @FindBy(xpath = "//*[@id='cart']/button")
    private WebElement cartButton;

    @FindBy(xpath = "//*[contains(@class, 'fa fa-times')]")
    private WebElement removeFromCardButton;

    public WebElement getRemoveFromCardButton() {
        return removeFromCardButton;
    }

    public WebElement getAlertMessage() {
        return alertMessage;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }
}
