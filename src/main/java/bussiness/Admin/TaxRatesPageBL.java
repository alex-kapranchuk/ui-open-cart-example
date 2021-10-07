package bussiness.Admin;

import pages.Admin.TaxRatesPage;


public class TaxRatesPageBL {

    private final TaxRatesPage taxRatesPage;

    public TaxRatesPageBL() {
        this.taxRatesPage = new TaxRatesPage();
    }

    public TaxRatesPageBL clickCreateTax(){
        clickOnPlus();
     return this;
    }

    private void clickOnPlus(){
        taxRatesPage.getPlusTaxRate().click();
    }

}
