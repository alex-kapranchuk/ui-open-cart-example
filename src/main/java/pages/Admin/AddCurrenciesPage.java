package pages.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AddCurrenciesPage extends BasePage {

    @FindBy(xpath = "//*[@id='input-title']")
    private WebElement currencyTitle;

    @FindBy(xpath = "//*[@id='input-code']")
    private WebElement inputCode;

    @FindBy(xpath = "//*[@id='input-status']/option[1]")
    private WebElement inputStatus;

    @FindBy(xpath = "//*[@class='fa fa-save']")
    private WebElement saveCurrency;

    @FindBy(name = "symbol_left")
    private WebElement symbolLeft;

    @FindBy(name = "value")
    private WebElement value;

    public WebElement getValue(){
        return value;
    }

    public WebElement getSaveCurrency(){
        return  saveCurrency;
    }

      public WebElement getCurrencyTitle(){
          wait.until(ExpectedConditions.visibilityOf(currencyTitle));
        return currencyTitle;
    }
    public WebElement getInputCode(){
        return inputCode;
    }

    public WebElement getInputStatus(){
        return inputStatus;
    }

    public WebElement getSymbolLeft(){
          return symbolLeft;
    }
}
