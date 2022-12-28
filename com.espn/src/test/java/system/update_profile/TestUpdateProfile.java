package system.update_profile;

import base.BasePage;
import espn_page_library.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUpdateProfile extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testUpdateAccount")
    public void testUpdateProfile(String email, String password, String fName, String lName, String text) {
        HomePage homePage = new HomePage();

        homePage.systemBar.doLogin(email, password);

        homePage.systemBar.updateProfile(fName, lName);

        Assert.assertEquals(homePage.systemBar.getWelcomeUserText(), text);
    }
}
