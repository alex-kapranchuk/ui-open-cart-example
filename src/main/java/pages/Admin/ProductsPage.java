package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//*[@class='fa fa-plus']")
    private WebElement addNewProduct;
    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    private WebElement deleteProduct;
    @FindBy(xpath = "//tr[td[contains(@class, 'text-left')] = 'Nokia']//input[@name='selected[]']")
    private WebElement selectProduct;
    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    private WebElement allerSuccessModified; // refactor - DriverUtils (standard alert)

    public WebElement getAddNewProduct() {
        wait.until(ExpectedConditions.visibilityOf(addNewProduct));
        return addNewProduct;
    }

    public WebElement getAllerSuccessModified() {
        return allerSuccessModified;
    }

    public WebElement getDeleteProduct() {
        return deleteProduct;
    }

    public WebElement getSelectDeleteProduct() {
        wait.until(ExpectedConditions.visibilityOf(selectProduct));
        return selectProduct;
    }
    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
}
