package bussiness;


import driver.DriverRepository;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.HeaderPage;
import utils.DriverUtils;

import java.time.Duration;


public class HeaderPageBL {

    private HeaderPage headerPage;
    private DriverUtils driverUtils;

    public HeaderPageBL() {
        this.headerPage = new HeaderPage();
        driverUtils = new DriverUtils();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    private boolean isTextOnCardChanged(String text){
       return headerPage.getItemsCounter().getText().equals(text);
    }

    public void verifyItemsCounter1() {
        String oldText = headerPage.getItemsCounter().getText();
        new DriverUtils().getDriverWait(10).until(driver -> !isTextOnCardChanged(oldText));
        Assert.assertTrue(headerPage.getItemsCounter().getText().contains("1 item(s)"), "Error - Incorrect amount of item`s ");
    }
    /**Assert for delete from cart */
    public void verifyItemsCounter0() {
        new DriverUtils().getDriverWait(10).until(driver -> headerPage.getItemsCounter().getText().contains("0 item(s)"));
        Assert.assertTrue(headerPage.getItemsCounter().getText().contains("0 item(s)"), "Error - Incorrect amount of item`s ");}


    public HeaderPageBL changeCurrencyToEuro(){
        clickOnCurrency();
        clickOnEuroButton();
        return this;
    }
    public HeaderPageBL changeCurrencyToHryvnia(){
        clickOnCurrency();
        clickOnHryvniaButton();
        return this;
    }
    private void clickOnHryvniaButton(){headerPage.getHryvnia().click();}
    private void clickOnCurrency() {
        headerPage.getFormCurrency().click();
    }
    private void clickOnEuroButton(){
        headerPage.getEuroButton().click();
    }

}
