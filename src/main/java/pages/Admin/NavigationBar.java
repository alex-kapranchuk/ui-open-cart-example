package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class NavigationBar extends BasePage {

    @FindBy(xpath = "//*[@id=\"menu-catalog\"]/a")
    private WebElement CatalogTab;
    @FindBy(xpath = "//*[@id='collapse1']/li[2]/a")
    private WebElement CatalogProductsTab;

    public WebElement getCatalogProductsTab() {
        wait.until(ExpectedConditions.visibilityOf(CatalogProductsTab));
        return CatalogProductsTab;
    }

    public WebElement getCatalogTab() {
        wait.until(ExpectedConditions.visibilityOf(CatalogTab));
        return CatalogTab;

    }
}
