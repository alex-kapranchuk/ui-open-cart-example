package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class NavigationBar extends BasePage {

    @FindBy(xpath = "//*[@id='menu-catalog']")
    private WebElement catalogTab;
    @FindBy(xpath = "//*[contains( text(),'Products')]")
    private WebElement catalogProductsTab;
    @FindBy(xpath = "//*[contains( text(),' System')]")
    private WebElement systemTab;
    @FindBy(xpath = "//*[contains( text(),'Localisation')]")
    private WebElement systemLocalisationTab;
    @FindBy(xpath = "//*[contains( text(),'Currencies')]")
    private WebElement systemLocalisationCurrenciesTab;
    @FindBy(xpath = "//*[contains( text(),'Taxes')]")
    private WebElement systemLocalizationTaxesTab;
    @FindBy(xpath = "//*[contains( text(),'Tax Rates')]")
    private WebElement systemLocalizationTaxesTexRatesTab;
    @FindBy(xpath = "//*[contains( text(),'Tax Classes')]")
    private WebElement systemLocalizationTaxesTexClassesTab;

    public WebElement getSystemLocalizationTaxesTab() {
        wait.until(ExpectedConditions.visibilityOf(systemLocalizationTaxesTab));
        return systemLocalizationTaxesTab;
    }

    public WebElement getSystemLocalizationTaxesTexRatesTab() {
        wait.until(ExpectedConditions.visibilityOf(systemLocalizationTaxesTexRatesTab));
        return systemLocalizationTaxesTexRatesTab;
    }

    public WebElement getSystemLocalizationTaxesTexClassesTab() {
        wait.until(ExpectedConditions.visibilityOf(systemLocalizationTaxesTexClassesTab));
        return systemLocalizationTaxesTexClassesTab;
    }

    public WebElement getSystemLocalisationCurrenciesTab() {
        wait.until(ExpectedConditions.visibilityOf(systemLocalisationCurrenciesTab));
        return systemLocalisationCurrenciesTab;
    }

    public WebElement getSystemLocalisationTab() {
        wait.until(ExpectedConditions.visibilityOf(systemLocalisationTab));
        return systemLocalisationTab;
    }

    public WebElement getSystemTab() {
        wait.until(ExpectedConditions.visibilityOf(systemTab));
        return systemTab;
    }

    public WebElement getCatalogProductsTab() {
        wait.until(ExpectedConditions.visibilityOf(catalogProductsTab));
        return catalogProductsTab;
    }

    public WebElement getCatalogTab() {
        wait.until(ExpectedConditions.visibilityOf(catalogTab));
        return catalogTab;
    }
}
