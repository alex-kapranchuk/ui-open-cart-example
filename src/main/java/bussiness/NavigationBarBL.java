package bussiness;


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

    private void clickOnCatalog() {
        navigationBar.getCatalogTab().click();
    }

    private void clickOnProductTab(){navigationBar.getCatalogProductsTab().click();}
}
