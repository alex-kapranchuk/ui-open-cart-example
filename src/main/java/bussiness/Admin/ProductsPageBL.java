package bussiness.Admin;


import org.testng.Assert;
import pages.Admin.ProductsPage;

public class ProductsPageBL {

    private final ProductsPage productsPage;


    public ProductsPageBL() {
        this.productsPage = new ProductsPage();
    }

    private void clickOnPlus() {
        productsPage.getAddNewProduct().click();
    }

    private void selectDeleteProduct() {
        productsPage.getSelectDeleteProduct().click();
    }

    public ProductsPageBL createNewProduct() {
        clickOnPlus();
        return this;
    }

    private void clickOnDeleteSelectedProduct() {
        productsPage.getDeleteProduct().click();
    }


    public ProductsPageBL deleteCreatedProduct() {
        selectDeleteProduct();
        clickOnDeleteSelectedProduct();
        getWindowPopUp();
        return this;
    }

    private void getWindowPopUp() {
        productsPage.AcceptAlert();
    }

    public void verifySuccessfulAlert() {
        String expectedMessage = "Success: You have modified products!\n" + "×";
        Assert.assertEquals(productsPage.getAllerSuccessModified().getText(), expectedMessage, "Error - Incorrect title after add new product");
    }

}
