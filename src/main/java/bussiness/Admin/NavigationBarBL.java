package bussiness.Admin;


import pages.Admin.NavigationBar;

public class NavigationBarBL {

    private final NavigationBar navigationBar;

    public NavigationBarBL() {
        this.navigationBar = new NavigationBar();
    }

    public NavigationBarBL goToTheProductsPage(){
        clickOnCatalog();
        clickOnProductTab();
        return this;
    }
    public NavigationBarBL goToTheCurrencies(){
        clickOnSystemTab();
        clickOnSystemLocalizationTab();
        clickOnSystemLocalizationCurrenciesTab();
        return this;
    }
    public NavigationBarBL goToTheTaxRates(){
        clickOnSystemTab();
        clickOnSystemLocalizationTab();
        clickOnTaxesTab();
        clickOnTaxRates();
        return this;
    }

    public NavigationBarBL goToTheTaxClasses(){
//        clickOnSystemTab();
//        clickOnSystemLocalizationTab();
//        clickOnTaxesTab();
        clickOnClasses();
        return this;
    }

    private void clickOnTaxesTab(){navigationBar.getSystemLocalizationTaxesTab().click();}

    private void clickOnTaxRates(){navigationBar.getSystemLocalizationTaxesTexRatesTab().click();}

    private void clickOnClasses(){navigationBar.getSystemLocalizationTaxesTexClassesTab().click();}

    private void clickOnCatalog() {navigationBar.getCatalogTab().click();}

    private void clickOnProductTab(){navigationBar.getCatalogProductsTab().click();}

    private void clickOnSystemTab(){navigationBar.getSystemTab().click();}

    private void clickOnSystemLocalizationTab(){navigationBar.getSystemLocalisationTab().click();}

    private void clickOnSystemLocalizationCurrenciesTab(){navigationBar.getSystemLocalisationCurrenciesTab().click();}
}
