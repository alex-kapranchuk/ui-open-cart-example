package bussiness.Admin;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

    public TaxClassesPageBL deleteTaxClasses(){
        editTaxableGoods();
        removeRuleFromClasses();
        saveTaxClasses();
        return this;
    }



    private void removeRuleFromClasses(){taxClassesPage.getRemoveTaxRateButton().click();}
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

    public void verifySuccessfulAlertClasses() {
        Assert.assertTrue(taxClassesPage.getAllerSuccessModified().getText().contains("Success: You have modified tax classes!"), "Error - Incorrect title");
    }
}
