package bussiness.Admin;

import org.openqa.selenium.support.ui.Select;
import pages.Admin.TaxClassesPage;

public class TaxClassesPageBL {
    private final TaxClassesPage taxClassesPage;

    public TaxClassesPageBL(){
        this.taxClassesPage = new TaxClassesPage();
    }

    public TaxClassesPageBL addTaxToTheClasses() {
        editTaxableGoods();
        addRuleToTheClass();
        selectTestTax();
        saveTaxClasses();
        return this;
    }

    private void editTaxableGoods(){
        taxClassesPage.getEditTaxableGoods().click();
    }
    private void addRuleToTheClass(){
        taxClassesPage.getPlusTaxRatesToClasses().click();
    }
    private void selectTestTax(){
        new Select(taxClassesPage.getListTaxRate()).selectByVisibleText("TestTax");
    }
    private void saveTaxClasses(){
        taxClassesPage.getSaveTaxClasses().click();
    }




}
