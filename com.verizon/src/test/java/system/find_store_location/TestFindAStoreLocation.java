package system.find_store_location;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.BusinessPage;
import verizon_page_library.HomePage;
import verizon_page_library.StoreLocatorPage;

public class TestFindAStoreLocation extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testFindALocation")
    public void testFindAStore(String zip, String text) {

        HomePage homePage = new HomePage();
        BusinessPage businessPage = homePage.systemBar.navigateToBusinessPage();

        StoreLocatorPage storeLocatorPage = businessPage.findStores();
        storeLocatorPage.inputZipCode(zip);
        storeLocatorPage.clickOnSearchButton();

        Assert.assertEquals(storeLocatorPage.getLocationResultsText(), text);

    }
}
