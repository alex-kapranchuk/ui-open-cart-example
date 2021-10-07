import bussiness.Admin.*;
import enums.URLs;
import navigation.Navigation;
import org.testng.annotations.Test;
import pages.Admin.TaxRatesPage;

public class TaxesTests extends BaseTest{

    @Test
    public void AddNewTaxesTest() throws InterruptedException {
        new Navigation().navigateToUrl(URLs.ADMIN_LOGIN_URL.getValue());
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.
                loginAsAdmin();
        DashboardPageBL dashboardPageBL = new DashboardPageBL();
        dashboardPageBL.
                verifySuccessfulLogin();
        NavigationBarBL navigationBarBL = new NavigationBarBL();
        navigationBarBL.
                goToTheTaxRates();
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
        Thread.sleep(3000);

    }
}
