package bussiness.Admin;

import models.CreateProductModel;
import models.TaxRateModel;
import pages.Admin.AddTaxRatesPage;
import pages.Admin.TaxRatesPage;
import repository.Admin.CreateProductAdminRepository;
import repository.Admin.TaxRatesRepository;

public class AddTaxRatesPageBL {

    private final AddTaxRatesPage addTaxRatesPage;

    public AddTaxRatesPageBL() {
        this.addTaxRatesPage = new AddTaxRatesPage();
    }

    public AddTaxRatesPageBL createTaxRate(){
        TaxRateModel model = TaxRatesRepository.getTestTaxRateModel();
        inputTaxName(model.getTaxName());
        inputTaxRate(model.getTaxRate());
        clickSaveTaxRate();
        return this;
    }

    private void inputTaxName(String taxName){
        addTaxRatesPage.getTaxNameInput().clear();
        addTaxRatesPage.getTaxNameInput().sendKeys(taxName);
    }

    private void inputTaxRate(String taxRate){
        addTaxRatesPage.getTaxRateInput().clear();
        addTaxRatesPage.getTaxRateInput().sendKeys(taxRate);
    }

    private void clickSaveTaxRate(){
        addTaxRatesPage.getSaveTaxRates().click();
    }
}
