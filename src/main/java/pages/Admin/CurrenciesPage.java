package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CurrenciesPage extends BasePage {

    @FindBy(xpath = "//*[@class='fa fa-plus']")
    private WebElement plusCurrencies;

    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    private WebElement trashCurrencies;

    @FindBy(xpath = "//tr[td[contains(@class, 'text-left')] = 'Гривня ']//input[@name='selected[]']")
    private WebElement selectCurrencies;

    @FindBy(xpath = "//*[@class =\"alert alert-success alert-dismissible\"]")
    private WebElement alertMessage;

    public WebElement getAlertMessage() {
        return alertMessage;
    }

    public WebElement getTrashCurrencies() {
        return trashCurrencies;
    }

    public WebElement getPlusCurrencies(){
        return plusCurrencies;
    }

    public WebElement getSelectCurrencies() {
        return selectCurrencies;
    }
    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
}
