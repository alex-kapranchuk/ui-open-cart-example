package bussiness;

import models.CreateProductModel;
import models.UserRegisterModel;
import pages.Admin.AddProductPage;
import pages.Admin.ProductsPage;
import pages.SuccessRegisterPage;
import repository.CreateProductAdminRepository;
import repository.UserRegisterRepository;

public class AddProductPageBL {
    private final AddProductPage addProductPage;

    public AddProductPageBL() {
        this.addProductPage = new AddProductPage();
    }

    public AddProductPageBL addNewProduct() {
        CreateProductModel model = CreateProductAdminRepository.getNokiaModel();
        inputProductName(model.getProductName());
        inputMetaTagTitle(model.getMetaTagTitle());
        clickOnDataNavigationTab();
        inputProductModel(model.getProductModel());
        clickOnSaveProduct();

//      successRegisterPage = new SuccessRegisterPage();
        return this;
    }

    private void inputProductName(String productName) {
        addProductPage.getInputProductName().clear();
        addProductPage.getInputProductName().sendKeys(productName);
    }
    private void inputMetaTagTitle(String metaTagTitle) {
        addProductPage.getInputMetaTag().clear();
        addProductPage.getInputMetaTag().sendKeys(metaTagTitle);
    }
    private void inputProductModel(String productModel) {
        addProductPage.getInputProductModel().clear();
        addProductPage.getInputProductModel().sendKeys(productModel);}

    private void clickOnDataNavigationTab() {
        addProductPage.getDataNavigationTab().click();
    }
    private void clickOnSaveProduct() {
        addProductPage.getSaveProduct().click();
    }
}
