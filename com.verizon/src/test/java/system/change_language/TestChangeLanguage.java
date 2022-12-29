package system.change_language;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.BusinessPage;
import verizon_page_library.HomePage;

public class TestChangeLanguage extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testFrench")
    public void testChangeLanguage(String index, String text) {

        HomePage homePage = new HomePage();
        BusinessPage businessPage =  homePage.systemBar.navigateToBusinessPage();
        businessPage.selectLanguage(Integer.parseInt(index));

        Assert.assertEquals(businessPage.getBusinessLinkText(), text);
    }
}
