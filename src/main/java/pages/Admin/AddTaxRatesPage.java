package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AddTaxRatesPage extends BasePage {

    @FindBy(name = "name")
    private WebElement taxNameInput;

    @FindBy(name = "rate")
    private WebElement taxRateInput;

    @FindBy(xpath = "//*[@class='fa fa-save']")
    private WebElement saveTaxRates;

    public WebElement getTaxNameInput() {
        return taxNameInput;
    }

    public WebElement getTaxRateInput() {
        return taxRateInput;
    }

    public WebElement getSaveTaxRates() {
        return saveTaxRates;
    }
}
