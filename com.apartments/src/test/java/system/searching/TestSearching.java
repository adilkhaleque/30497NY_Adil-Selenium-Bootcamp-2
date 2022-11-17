package system.searching;

import apartments_page_library.HomePage;
import apartments_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearching extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testBasicSearch")
    public void testSearchFunctionality(String searchTerm, String expectedText) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        Assert.assertEquals(searchResultsPage.getPriceDropdownText(), expectedText);
    }

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testDetailedSearch")
    public void testDetailedSearch(String searchTerm, String title) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.doNarrowSearch();

        Assert.assertEquals(searchResultsPage.getPropertyTitleText(), title);
    }
}
