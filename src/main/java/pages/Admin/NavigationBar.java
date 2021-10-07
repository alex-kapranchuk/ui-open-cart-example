package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class NavigationBar extends BasePage {

    @FindBy(xpath = "//*[@id='menu-catalog']/a")
    private WebElement catalogTab;
    @FindBy(xpath = "//*[@id='collapse1']/li[2]/a")
    private WebElement catalogProductsTab;
    @FindBy(xpath = "//*[@id='menu-system']/a")
    private WebElement systemTab;
    @FindBy(xpath = "//*[@id='collapse7']/li[3]/a")
    private WebElement systemLocalisationTab;
    @FindBy(xpath = "//*[@id='collapse7-2']/li[3]")
    private WebElement systemLocalisationCurrenciesTab;
    @FindBy(xpath = "//*[@id='collapse7-2']/li[10]/a")
    private WebElement systemLocalizationTaxesTab;
    @FindBy(xpath = "//*[@id='collapse-7-2-9']/li[2]/a")
    private WebElement systemLocalizationTaxesTexRatesTab;
    @FindBy(xpath = "//*[@id='collapse-7-2-9']/li[1]/a")
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
