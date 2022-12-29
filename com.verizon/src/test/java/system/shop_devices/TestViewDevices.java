package system.shop_devices;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.HomePage;
import verizon_page_library.SearchResultsPage;
import verizon_page_library.ShopPage;

public class TestViewDevices extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testGoogle5GPhones")
    public void testViewGoogle5gPhones(String expectedText) {

        HomePage homePage = new HomePage();
        ShopPage shopPage = homePage.systemBar.navigateTo5gPhones();
        SearchResultsPage searchResultsPage = shopPage.clickOnGooglePhoneButton();

        Assert.assertEquals(searchResultsPage.getGoogleFilterText(), expectedText);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSamsung5GPhones")
    public void testViewSamsung5gPhones(String expectedText) {

        HomePage homePage = new HomePage();
        ShopPage shopPage = homePage.systemBar.navigateTo5gPhones();
        SearchResultsPage searchResultsPage = shopPage.clickOnSamsungPhoneButton();

        Assert.assertEquals(searchResultsPage.getSamsungFilterText(), expectedText);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testAppleTablets")
    public void testViewAppleTablets(String expectedText) {

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.navigateToTabletsAndLaptopsResults();
        searchResultsPage.clickOnAppleTabletsButton();

        Assert.assertEquals(searchResultsPage.getShopTabletsHeadingText(), expectedText);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewNewestSmartwatches")
    public void testViewNewestSmartwatches(String index, String expectedText) {

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.navigateToWatches();
        searchResultsPage.clickOnSortByDropdown();
        searchResultsPage.selectSortByOption(Integer.parseInt(index));
        searchResultsPage.clickOnSortByDropdown();

        Assert.assertEquals(searchResultsPage.getNewestOptionText(), expectedText);
    }
}
