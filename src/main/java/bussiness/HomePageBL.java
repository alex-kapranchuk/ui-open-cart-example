package bussiness;

import models.SearchModel;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import pages.SearchPage;
import repository.SearchProductRepository;

import java.util.List;
import java.util.Random;

public class HomePageBL {

    private final HomePage homePage;
    private final SearchPage searchPage;

    private SearchPageBL searchPageBL;

    public HomePageBL() {
        this.homePage = new HomePage();
        this.searchPage = new SearchPage();
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public HomePageBL searchMissingProduct() {
        SearchModel model = SearchProductRepository.getMissingProductModel();
        inputMissingProduct(model.getInValidProduct());
        clickButton();
        searchPageBL = new SearchPageBL();
        return this;
    }

    public HomePageBL searchFoundProduct() {
        SearchModel model = SearchProductRepository.getFoundProductModel();
        inputFoundProduct(model.getValidProduct());
        clickButton();
        searchPageBL = new SearchPageBL();
        return this;
    }

    public HomePageBL searchCreatedProduct() {
        SearchModel model = SearchProductRepository.getCreatedProductModel();
        inputCreatedProduct((model.getCreatedProduct()));
        clickButton();
        searchPageBL = new SearchPageBL();
        return this;
    }

    private void inputFoundProduct(String FoundProduct) {
        homePage.getInputSearch().click();
        homePage.getInputSearch().sendKeys(FoundProduct);

    }

    private void inputMissingProduct(String MissingProduct) {
        homePage.getInputSearch().clear();
        homePage.getInputSearch().sendKeys(MissingProduct);
    }

    private void inputCreatedProduct(String CreatedProduct) {
        homePage.getInputSearch().clear();
        homePage.getInputSearch().sendKeys(CreatedProduct);
    }

    private void clickButton() {
        homePage.getClickSearch().click();
    }

    public void verifySiteIsOpened() {
        Assert.assertTrue(homePage.getLogo().isDisplayed());
    }

    public void selectRandomProductForBuy() {
        List<WebElement> products = searchPage.getProductFromList();
        int maxProducts = products.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        products.get(randomProduct).click();
    }

    public HomePageBL verifyTaxIsAdded(){
        clickOnCartButton();
        String expectedMessage = "TestTax";
        Assert.assertEquals(homePage.getTaxCounter().getText(), expectedMessage, "Error - Incorrect title of Tax");
        return this;
    }

    public void clickOnCartButton(){
        homePage.getCartButton().click();
    }

}