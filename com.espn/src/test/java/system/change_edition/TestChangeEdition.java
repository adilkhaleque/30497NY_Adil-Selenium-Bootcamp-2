package system.change_edition;

import base.BasePage;
import espn_page_library.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeEdition extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testEditions")
    public void testChangeEditionToMexico(String index, String text) {
        HomePage homePage = new HomePage();

        homePage.systemBar.navigateToEditions();

        homePage.systemBar.selectEdition(homePage.systemBar.editions, Integer.parseInt(index));

        Assert.assertEquals(homePage.systemBar.getEditionText(), text);
    }
}
