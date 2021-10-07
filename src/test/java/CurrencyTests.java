import bussiness.Admin.AddCurrenciesPageBL;
import bussiness.Admin.LoginPageBL;
import bussiness.Admin.NavigationBarBL;
import bussiness.HeaderPageBL;
import bussiness.HomePageBL;
import bussiness.SearchPageBL;
import enums.URLs;
import navigation.Navigation;
import org.testng.annotations.Test;

public class CurrencyTests extends BaseTest {

    @Test
    public void productListCurrencyTest() {
        new Navigation().navigateToUrl(URLs.BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.
                searchFoundProduct();
        SearchPageBL searchPageBL = new SearchPageBL();
        searchPageBL.verifyCurrency("$");
        HeaderPageBL headerPageBL = new HeaderPageBL();
        headerPageBL.
                changeCurrencyToEuro();
        searchPageBL.
                verifyCurrency("€"); /** if we get from model parameters (euro and pound) equals null */
    }

    @Test
    public void addNewCurrencyTest() {
        new Navigation().navigateToUrl(URLs.ADMIN_LOGIN_URL.getValue());
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.
                loginAsAdmin();
        NavigationBarBL navigationBarBL = new NavigationBarBL();
        navigationBarBL.
                goToTheCurrencies();
        AddCurrenciesPageBL addCurrenciesPageBL = new AddCurrenciesPageBL();
        addCurrenciesPageBL.
                addNewCurrency();
        new Navigation().navigateToUrl(URLs.BASE_URL.getValue());
        HeaderPageBL headerPageBL = new HeaderPageBL();
        headerPageBL.
                changeCurrencyToHryvnia();
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.
                searchFoundProduct();
        SearchPageBL searchPageBL = new SearchPageBL();
        searchPageBL.
                verifyCurrency("₴");
    }

    @Test
    public void deleteCreatedCurrenciesTest() throws InterruptedException {
        new Navigation().navigateToUrl(URLs.ADMIN_LOGIN_URL.getValue());
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.
                loginAsAdmin();
        NavigationBarBL navigationBarBL = new NavigationBarBL();
        navigationBarBL.
                goToTheCurrencies();
        AddCurrenciesPageBL addCurrenciesPageBL = new AddCurrenciesPageBL();
        addCurrenciesPageBL.
                DeleteCreatedCurrencies();
        addCurrenciesPageBL.
                verifyCurrenciesAlertMessage();
    }

}
