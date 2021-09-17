package bussiness;

import models.UserRegisterModel;
import org.testng.Assert;
import pages.RegisterPage;
import pages.SuccessRegisterPage;
import repository.UserRegisterRepository;
import utils.DriverUtils;

public class RegisterPageBL {

    private RegisterPage registerPage;
    private SuccessRegisterPage successRegisterPage;
    private DriverUtils driverUtils;

    public RegisterPageBL() {
        this.registerPage = new RegisterPage();
        driverUtils = new DriverUtils();
    }

    public RegisterPageBL registerNewPerson() {
        UserRegisterModel model = UserRegisterRepository.getValidModel();
        inputFirstName(model.getFirstName());
        inputLastName(model.getLastName());
        inputEmail(model.getEmail());
        inputTelephone(model.getTelephone());
        inputPassword(model.getPassword());
        inputPasswordConfirm(model.getPasswordConfirm());
        chooseSubscribe(1);
        clickOnPrivacyPolicyCheckbox();
        clickOnContinueButton();

        successRegisterPage = new SuccessRegisterPage();
        return this;
    }

    private void inputFirstName(String firstName) {
        registerPage.getFirstNameInput().clear();
        registerPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        registerPage.getLastNameInput().clear();
        registerPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        registerPage.getEmailInput().clear();
        registerPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        registerPage.getTelephoneInput().clear();
        registerPage.getTelephoneInput().sendKeys(telephone);
    }

    private void inputPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
    }

    private void inputPasswordConfirm(String passwordConfirm) {
        registerPage.getConfirmPasswordInput().clear();
        registerPage.getConfirmPasswordInput().sendKeys(passwordConfirm);
    }

    private void chooseSubscribe(int value) {
        driverUtils.clickOnElementJS(registerPage.getSubscribeButton(value));
    }

    private void clickOnPrivacyPolicyCheckbox() {
        driverUtils.clickOnElementJS(registerPage.getPrivacyPolicyCheckbox());
    }

    private void clickOnContinueButton() {
        registerPage.getContinueButton().click();
    }

    public void verifySuccessfulUserRegistration() {
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(successRegisterPage.getSuccessRegistrationTitle().getText(), expectedMessage, "Error - Incorrect title after success registration");
    }
}
