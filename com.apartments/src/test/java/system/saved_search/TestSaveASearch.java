package system.saved_search;

import apartments_page_library.HomePage;
import apartments_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSaveASearch extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSavedSearch")
    public void testSaveSearch(String email, String password, String searchTerm, String savedSearchText) throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);
        searchResultsPage.doNarrowSearch();
        searchResultsPage.clickOnSaveSearchPromptButton();
        searchResultsPage.clickOnSaveSearchButton();

        Assert.assertEquals(searchResultsPage.getSavedSearchSummaryText(), savedSearchText);
    }
}
