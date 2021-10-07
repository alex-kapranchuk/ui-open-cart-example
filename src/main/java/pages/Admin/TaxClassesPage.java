package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.util.List;

public class TaxClassesPage extends BasePage {

    @FindBy(xpath = "//*[contains( text(),'Taxable Goods')]/..//i[@class='fa fa-pencil']")
    private WebElement editTaxableGoods;

    @FindBy(xpath = "//*[@class='fa fa-plus-circle']")
    private WebElement plusTaxRatesToClasses;

    @FindBy(name = "tax_rule[2][tax_rate_id]")
    private WebElement listTaxRate;

    @FindBy(xpath = "//*[@class='fa fa-save']")
    private WebElement saveTaxClasses;

    public WebElement getPlusTaxRatesToClasses() {
       wait.until(ExpectedConditions.visibilityOf(plusTaxRatesToClasses));
        return plusTaxRatesToClasses;
    }

    public WebElement getEditTaxableGoods() {
        return editTaxableGoods;
    }

    public WebElement getListTaxRate() {
        return listTaxRate;
    }
    public WebElement getSaveTaxClasses() {
        return saveTaxClasses;
    }


}
