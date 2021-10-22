package bussiness.Admin;

import models.CurrencyModel;
import org.testng.Assert;
import pages.Admin.AddCurrenciesPage;
import pages.Admin.CurrenciesPage;
import repository.Admin.CurrencyRepository;
import utils.DriverUtils;

public class AddCurrenciesPageBL {

    private final AddCurrenciesPage addCurrenciesPage;
    private final DriverUtils driverUtils;
    private final CurrenciesPage currenciesPage;

    public AddCurrenciesPageBL() {

        this.addCurrenciesPage = new AddCurrenciesPage();
        this.currenciesPage = new CurrenciesPage();
        driverUtils = new DriverUtils();
    }

    public AddCurrenciesPageBL addNewCurrency() {
        CurrencyModel model = CurrencyRepository.getAddCurrencyModel();
        clickAddNewCurrency();
        inputCurrencyTitle(model.getCurrencyTitle());
        inputCode(model.getCode());
        inputSymbolLeft(model.getSymbolLeft());
        inputValue(model.getValue());
        selectStatus();
        clickSaveCurrency();
        return this;
    }

    public AddCurrenciesPageBL DeleteCreatedCurrencies() {
        selectCreatedCurrencies();
        clickTrashCurrencies();
        getWindowPopUp();
        return this;
    }
    public void verifyCurrenciesAlertMessage(){
        Assert.assertTrue(currenciesPage.getAlertMessage().isDisplayed());
    }

    private void getWindowPopUp(){
        currenciesPage.AcceptAlert();
    }

    private void selectCreatedCurrencies() {
        currenciesPage.getSelectCurrencies().click();
    }

    private void clickTrashCurrencies() {
        currenciesPage.getTrashCurrencies().click();
    }


    private void inputCurrencyTitle(String currencyTitle) {
        addCurrenciesPage.getCurrencyTitle().clear();
        addCurrenciesPage.getCurrencyTitle().sendKeys(currencyTitle);
    }

    private void inputCode(String code) {
        addCurrenciesPage.getInputCode().clear();
        addCurrenciesPage.getInputCode().sendKeys(code);
    }

    private void inputSymbolLeft(String symbolLeft) {
        addCurrenciesPage.getSymbolLeft().clear();
        addCurrenciesPage.getSymbolLeft().sendKeys(symbolLeft);
    }

    private void inputValue(String value) {
        addCurrenciesPage.getValue().clear();
        addCurrenciesPage.getValue().sendKeys(value);
    }

    private void clickSaveCurrency() {
        addCurrenciesPage.getSaveCurrency().click();
    }

    private void clickAddNewCurrency() {
        currenciesPage.getPlusCurrencies().click();
    }

    private void selectStatus() {
        addCurrenciesPage.getInputStatus().click();
    }
}
