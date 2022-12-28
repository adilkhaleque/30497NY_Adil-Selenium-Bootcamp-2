package system.nearby_spots;

import apartments_page_library.HomePage;
import apartments_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestViewNearbySpots extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNearbyNeighborhoods")
    public void testViewNearbyNeighborhoods(String searchTerm, String text) throws InterruptedException {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.clickOnNearbyButton();
        searchResultsPage.clickOnNeighborhoods();

        Assert.assertEquals(searchResultsPage.getNeighborhoodsText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNearbyTransit")
    public void testViewNearbyTransit(String searchTerm, String text) throws InterruptedException {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.clickOnNearbyButton();
        searchResultsPage.clickOnTransit();

        Assert.assertEquals(searchResultsPage.getTransitText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNearbyRestaurants")
    public void testViewNearbyRestaurants(String searchTerm, String text) throws InterruptedException {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.clickOnNearbyButton();
        searchResultsPage.clickOnRestaurants();

        Assert.assertEquals(searchResultsPage.getRestaurantsText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNearbyCampuses")
    public void testViewNearbyCampuses(String searchTerm, String text) throws InterruptedException {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.clickOnNearbyButton();
        searchResultsPage.clickOnCampuses();

        Assert.assertEquals(searchResultsPage.getCampusesText(), text);
    }

}
