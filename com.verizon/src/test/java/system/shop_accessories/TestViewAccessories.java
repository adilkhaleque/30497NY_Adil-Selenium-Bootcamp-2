package system.shop_accessories;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.GamingPage;
import verizon_page_library.HomePage;
import verizon_page_library.ItemPage;
import verizon_page_library.SearchResultsPage;

public class TestViewAccessories extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewSteelSeriesHeadset")
    public void testViewSteelSeriesHeadset(String text) {

        HomePage homePage = new HomePage();
        GamingPage gamingPage = homePage.systemBar.navigateToGamingPage();

        SearchResultsPage searchResultsPage = gamingPage.clickOnGamingHeadsets();

        searchResultsPage.clickOnSteelSeries();
        ItemPage itemPage = searchResultsPage.clickOnSteelSeriesHeadset();

        Assert.assertEquals(itemPage.getHeadsetText(), text);
    }
}
