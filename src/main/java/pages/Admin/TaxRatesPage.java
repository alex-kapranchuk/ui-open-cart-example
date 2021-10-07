package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TaxRatesPage extends BasePage {
    @FindBy(xpath = "//*[@class='fa fa-plus']")
    private WebElement plusTaxRate;

    public WebElement getPlusTaxRate() {
        return plusTaxRate;
    }
}
