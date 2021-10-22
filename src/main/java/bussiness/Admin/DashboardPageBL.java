package bussiness.Admin;


import org.testng.Assert;
import pages.Admin.DashboardPage;


public class DashboardPageBL {

    private final DashboardPage dashboardPage;

    public DashboardPageBL() {
        this.dashboardPage = new DashboardPage();
    }

    public void verifySuccessfulLogin() {
        String expectedMessage = "Dashboard";
        Assert.assertEquals(dashboardPage.getDashboard().getText(), expectedMessage, "Error - Incorrect title after Login");
    }
}
