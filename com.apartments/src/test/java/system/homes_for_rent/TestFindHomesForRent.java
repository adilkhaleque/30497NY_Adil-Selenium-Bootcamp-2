package system.homes_for_rent;

import apartments_page_library.HomePage;
import apartments_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindHomesForRent extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLAHomesForRent")
    public void testFindLAHomesForRent(String locationIndex, String text) {
        HomePage homePage = new HomePage();
        homePage.clickOnMenuButton();
        homePage.clickOnHomesForRent();

        SearchResultsPage searchResultsPage = homePage.selectRentalHomeLocation(Integer.parseInt(locationIndex));
        searchResultsPage.chooseAmenitiesForRental();
        searchResultsPage.clickOnSortButton();
        searchResultsPage.clickOnRentSortOption();

        Assert.assertEquals(searchResultsPage.getForRentLocationText(), text);
    }
}
