package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = "//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='cart-total']")
    private WebElement itemsCounter;

    @FindBy(xpath = "//*[@id='form-currency']")
    private WebElement formCurrency;


    @FindBy(name = "EUR")
    private WebElement euroButton;

    @FindBy(name = "UAH")
    private WebElement hryvnia;

    public WebElement getHryvnia(){
        return hryvnia;
    }

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }
    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getItemsCounter() {
        return itemsCounter;
    }
    public WebElement getFormCurrency(){
        return formCurrency;
    }
    public WebElement getEuroButton(){
        return euroButton;
    }
}
