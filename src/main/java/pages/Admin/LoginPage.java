package pages.Admin;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    private WebElement inputUsername;
    @FindBy(name = "password")
    private WebElement inputPassword;
    @FindBy(xpath = "//*[contains(text(), ' Login')]")
    private WebElement loginButton;

    public WebElement getInputUsername() {
        return inputUsername;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
