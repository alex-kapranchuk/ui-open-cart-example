import bussiness.HomePageBL;
import bussiness.RegisterPageBL;
import navigation.Navigation;
import org.testng.annotations.Test;

import static enums.URLs.BASE_URL;

public class RegistrationTests extends BaseTest {

    @Test
    public void validUserRegistrationTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        RegisterPageBL registerPageBL = homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifySuccessfulUserRegistration();
    }
}
