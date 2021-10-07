package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//*[@id='content']/div[1]/div/h1")
    private WebElement dashboard;

    public WebElement getDashboard() {
        return dashboard;
    }
}
