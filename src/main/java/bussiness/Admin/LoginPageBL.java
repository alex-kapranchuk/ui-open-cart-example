package bussiness.Admin;

import models.LoginAdminModel;
import pages.Admin.LoginPage;
import repository.Admin.LoginAdminRepository;

public class LoginPageBL {

    private final LoginPage loginPage;

    public LoginPageBL() {
        this.loginPage = new LoginPage();
    }

    public LoginPageBL loginAsAdmin() {
        LoginAdminModel model = LoginAdminRepository.getValidLoginModel();
        inputUserName(model.getUserName());
        inputPassword(model.getPassword());
        clickButton();
        return this;
    }

    private void inputUserName(String userName) {
        loginPage.getInputUsername().clear();
        loginPage.getInputUsername().sendKeys(userName);
    }

    private void inputPassword(String password) {
        loginPage.getInputPassword().clear();
        loginPage.getInputPassword().sendKeys(password);
    }

    private void clickButton() {
        loginPage.getLoginButton().click();
    }
}
