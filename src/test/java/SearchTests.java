import bussiness.*;
import bussiness.Admin.*;
import enums.URLs;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.SearchProductRepository;

public class SearchTests extends BaseTest {

    @Test
    public void searchInvalidProductTest() {
        new Navigation().navigateToUrl(URLs.BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.
                searchMissingProduct();
        SearchPageBL searchPageBL = new SearchPageBL();
        searchPageBL.verifyProductDoNotFound();
    }

    @Test
    public void searchValidProductTest() {
      new Navigation().navigateToUrl(URLs.BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.
                searchFoundProduct();
        SearchPageBL searchPageBL = new SearchPageBL();
        searchPageBL.verifyProductFound(SearchProductRepository.getFoundProductModel());
    }

    @Test
    public void addNewProductTest() {
        new Navigation().navigateToUrl(URLs.ADMIN_LOGIN_URL.getValue());
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.
                loginAsAdmin();
        DashboardPageBL dashboardPageBL = new DashboardPageBL();
        dashboardPageBL.
                verifySuccessfulLogin();
        NavigationBarBL navigationBarBL = new NavigationBarBL();
        navigationBarBL.
                goToTheProductsPage();
        ProductsPageBL productsPageBL = new ProductsPageBL();
        productsPageBL.
                createNewProduct();
        AddProductPageBL addProductPageBL = new AddProductPageBL();
        addProductPageBL.
                addNewProduct();
        productsPageBL.
               verifySuccessfulAlert();
        new Navigation().
                navigateToUrl(URLs.BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.
                verifySiteIsOpened();
        homePageBL.
                searchCreatedProduct();
        SearchPageBL searchPageBL = new SearchPageBL();
        searchPageBL.
                verifyCreatedProduct(SearchProductRepository.getCreatedProductModel());
    }

    @Test
    public void deleteCreatedProductTest() throws InterruptedException {
        new Navigation().navigateToUrl(URLs.ADMIN_LOGIN_URL.getValue());
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.
                loginAsAdmin();
        DashboardPageBL dashboardPageBL = new DashboardPageBL();
        dashboardPageBL.
                verifySuccessfulLogin();
        NavigationBarBL navigationBarBL = new NavigationBarBL();
        navigationBarBL.
                goToTheProductsPage();
        ProductsPageBL productsPageBL = new ProductsPageBL();
        productsPageBL.
                deleteCreatedProduct();
        //Assert for delete
    }
}
