package system.search;

import base.BasePage;
import ebay_page_library.HomePage;
import ebay_page_library.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSearchFunctionality")
    public void testSearch(String searchTerm, String categoryValue, String expectedText) {

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm, homePage.systemBar.categoryDropdown, categoryValue);

        Assert.assertEquals(searchResultsPage.getResultsText(), expectedText);
    }
}
