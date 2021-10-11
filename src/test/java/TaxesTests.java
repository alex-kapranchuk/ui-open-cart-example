import bussiness.Admin.*;
import bussiness.HeaderPageBL;
import bussiness.HomePageBL;
import bussiness.ProductPageBL;
import enums.URLs;
import navigation.Navigation;
import org.testng.annotations.Test;
import pages.Admin.TaxRatesPage;

public class TaxesTests extends BaseTest{

    @Test
    public void AddNewTaxesTest() {
        new Navigation().navigateToUrl(URLs.ADMIN_LOGIN_URL.getValue());
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.
                loginAsAdmin();
        DashboardPageBL dashboardPageBL = new DashboardPageBL();
        dashboardPageBL.
                verifySuccessfulLogin();
        NavigationBarBL navigationBarBL = new NavigationBarBL();
        navigationBarBL.
                goToTheTaxRatesFromDashboard();
        TaxRatesPageBL taxRatesPageBL = new TaxRatesPageBL();
        taxRatesPageBL.
                clickCreateTax();
        AddTaxRatesPageBL addTaxRatesPageBL = new AddTaxRatesPageBL();
        addTaxRatesPageBL.
                createTaxRate();
        navigationBarBL.
                goToTheTaxClasses();
        TaxClassesPageBL taxClassesPageBL = new TaxClassesPageBL();
        taxClassesPageBL.
                addTaxToTheClasses(); // rule [2-3] selector -  A thin place
        new Navigation().navigateToUrl(URLs.BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.
                searchFoundProduct()
                .selectRandomProductForBuy();
        ProductPageBL productPageBL = new ProductPageBL();
        productPageBL.
                clickOnAddToCartButton();
        homePageBL.
                verifyTaxIsAdded();
    }
    @Test
    public void deleteTaxes(){
        new Navigation().navigateToUrl(URLs.ADMIN_LOGIN_URL.getValue());
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.
                loginAsAdmin();
        DashboardPageBL dashboardPageBL = new DashboardPageBL();
        dashboardPageBL.
                verifySuccessfulLogin();
        NavigationBarBL navigationBarBL = new NavigationBarBL();
        navigationBarBL.
                goToTheTaxClassesFromDashboard();
        TaxClassesPageBL taxClassesPageBL = new TaxClassesPageBL();
        taxClassesPageBL.
                deleteTaxClasses()
                .verifySuccessfulAlertClasses();
        navigationBarBL.
                goToTheTaxRates();
        TaxRatesPageBL taxRatesPageBL = new TaxRatesPageBL();
        taxRatesPageBL.
                deleteTaxRates();
        taxRatesPageBL.
                verifySuccessfulAlertRates();
    }
}
