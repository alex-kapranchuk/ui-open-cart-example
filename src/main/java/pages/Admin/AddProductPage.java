package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AddProductPage extends BasePage {
    @FindBy(id = "input-name1")
    private WebElement inputProductName;
    @FindBy(id = "input-meta-title1")
    private WebElement inputMetaTag;
    @FindBy(xpath = "//a[contains(@href,'#tab-data')]")
    private WebElement dataNavigationTab;
    @FindBy(name = "model")
    private WebElement inputProductModel;
    @FindBy(xpath = "//*[@class='fa fa-save']")
    private WebElement saveProduct;

    public WebElement getSaveProduct() {
        return saveProduct;
    }

    public WebElement getInputProductModel() {
        return inputProductModel;
    }

    public WebElement getInputProductName() {
        return inputProductName;
    }

    public WebElement getInputMetaTag() {
        return inputMetaTag;
    }

    public WebElement getDataNavigationTab() {
        return dataNavigationTab;
    }
}
