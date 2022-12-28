package system.change_language;

import apartments_page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeLanguage extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testChangeLanguage")
    public void testChangeLanguage(String text) {
        HomePage homePage = new HomePage();

        homePage.changeLanguage();

        Assert.assertEquals(homePage.getSpanishLanguageText(), text);
    }
}