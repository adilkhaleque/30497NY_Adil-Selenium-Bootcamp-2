package system.authentication;

import base.BasePage;
import freecrm_page_library.AuthenticationPage;
import freecrm_page_library.HomePage;
import freecrm_page_library.InitialPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "AuthenticationDP")
    public void testLogin(String email, String password, String expectedText) {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        Assert.assertEquals(homePage.getFullNameText(), expectedText);
    }
}
