package system.homes_for_rent;

import apartments_page_library.HomePage;
import apartments_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindHomesForRent extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testHomesForRent")
    public void testFindHomesForRent(String locationIndex, String text) {
        HomePage homePage = new HomePage();
        homePage.clickOnMenuButton();
        homePage.clickOnHomesForRent();

        SearchResultsPage searchResultsPage = homePage.selectRentalLocation(Integer.parseInt(locationIndex), homePage.rentalHomeLocations);
        searchResultsPage.chooseAmenitiesForRental();
        searchResultsPage.clickOnSortButton();
        searchResultsPage.clickOnRentSortOption();

        Assert.assertEquals(searchResultsPage.getForRentLocationText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testApartmentsForRent")
    public void testFindApartmentsForRent(String locationIndex, String text) {
        HomePage homePage = new HomePage();
        homePage.clickOnMenuButton();
        homePage.clickOnHomesForRent();

        SearchResultsPage searchResultsPage = homePage.selectRentalLocation(Integer.parseInt(locationIndex), homePage.rentalApartmentLocations);
        searchResultsPage.chooseAmenitiesForRental();
        searchResultsPage.clickOnSortButton();
        searchResultsPage.clickOnRentSortOption();

        Assert.assertEquals(searchResultsPage.getForRentLocationText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCondosForRent")
    public void testFindCondosForRent(String locationIndex, String text) {
        HomePage homePage = new HomePage();
        homePage.clickOnMenuButton();
        homePage.clickOnHomesForRent();

        SearchResultsPage searchResultsPage = homePage.selectRentalLocation(Integer.parseInt(locationIndex), homePage.rentalCondoLocations);
        searchResultsPage.chooseAmenitiesForRental();
        searchResultsPage.clickOnSortButton();
        searchResultsPage.clickOnRentSortOption();

        Assert.assertEquals(searchResultsPage.getForRentLocationText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testTownhomesForRent")
    public void testFindTownhomesForRent(String locationIndex, String text) {
        HomePage homePage = new HomePage();
        homePage.clickOnMenuButton();
        homePage.clickOnHomesForRent();

        SearchResultsPage searchResultsPage = homePage.selectRentalLocation(Integer.parseInt(locationIndex), homePage.rentalTownhomeLocations);
        searchResultsPage.chooseAmenitiesForRental();
        searchResultsPage.clickOnSortButton();
        searchResultsPage.clickOnRentSortOption();

        Assert.assertEquals(searchResultsPage.getForRentLocationText(), text);
    }

}
