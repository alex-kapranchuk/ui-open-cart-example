package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TaxRatesPage extends BasePage {
    @FindBy(xpath = "//*[@class='fa fa-plus']")
    private WebElement plusTaxRate;

    @FindBy(xpath = "//tr[td[contains(@class, 'text-left')] = 'TestTax']//input[@name='selected[]']")
    private WebElement selectTestTax;

    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    private WebElement trashTax;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    private WebElement allerSuccessModified;

    public WebElement getAllerSuccessModified() {
        return allerSuccessModified;}

    public WebElement getTrashTax(){return trashTax;}

    public WebElement getPlusTaxRate() {
        return plusTaxRate;
    }

    public WebElement getSelectTestTax() {
        return selectTestTax;
    }
}
