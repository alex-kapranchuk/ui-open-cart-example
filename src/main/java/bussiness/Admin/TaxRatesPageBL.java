package bussiness.Admin;

import org.testng.Assert;
import pages.Admin.CurrenciesPage;
import pages.Admin.TaxRatesPage;


public class TaxRatesPageBL {

    private final TaxRatesPage taxRatesPage;
    private final CurrenciesPage currenciesPage;

    public TaxRatesPageBL() {
        this.taxRatesPage = new TaxRatesPage();
        currenciesPage = new CurrenciesPage();
    }

    public TaxRatesPageBL clickCreateTax(){
        clickOnPlus();
     return this;
    }

    public TaxRatesPageBL deleteTaxRates(){
        selectTestTax();
        clickOnTrashTax();
        getWindowPopUp();
        return this;
    }

    public void verifySuccessfulAlertRates() {
    Assert.assertTrue(taxRatesPage.getAllerSuccessModified().getText().contains("Success: You have modified tax rates!"), "Error - Incorrect title after add new product");
}

    private void getWindowPopUp(){
        currenciesPage.AcceptAlert();
    }

    private void clickOnTrashTax(){taxRatesPage.getTrashTax().click();}

    private void clickOnPlus(){
        taxRatesPage.getPlusTaxRate().click();
    }

    private void selectTestTax(){taxRatesPage.getSelectTestTax().click();}

}
