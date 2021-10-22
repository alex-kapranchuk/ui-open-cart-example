package bussiness;
import driver.DriverRepository;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProductsPage;


import java.time.Duration;


public class ProductPageBL {

    private final ProductsPage productsPage;

    public ProductPageBL() {
        this.productsPage = new ProductsPage();

    }
    public void deleteFromCart(){
        clickOnCart();
        clickRemove();
    }

    public void clickOnAddToCartButton() {
        productsPage.getAddToCartButton().click();
    }

    private void clickOnCart(){
        productsPage.getCartButton().click();
    }
    private void clickRemove(){
        productsPage.getRemoveFromCardButton().click();
    }
    /*public void verifyAlertMessage() {
        Assert.assertTrue(productsPage.getAlertMessage().getText().contains("Success: You have added MacBook to your shopping cart!"));
    }*/
}
