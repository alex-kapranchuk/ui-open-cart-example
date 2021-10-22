package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//*/h1[contains( text(),'Dashboard')]")
    private WebElement dashboard;

    public WebElement getDashboard() {
        return dashboard;
    }
}
