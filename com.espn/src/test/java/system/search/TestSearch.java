package system.search;

import base.BasePage;
import espn_page_library.AthletePage;
import espn_page_library.HomePage;
import espn_page_library.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testFightHistory")
    public void testMmaSearch(String searchTerm, String searchTermAgain, String expected) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm);

        searchResultsPage.doSearchAgain(searchTermAgain);

        AthletePage athletePage = searchResultsPage.clickOnIslamMakhachev();

        athletePage.clickOnFightHistoryTab();

        Assert.assertEquals(athletePage.getFightHistoryHeadingText(), expected);

    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLeBronStats")
    public void testLebronSearch(String searchTerm, String searchTermAgain, String expected) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm);

        searchResultsPage.doSearchAgain(searchTermAgain);

        AthletePage athletePage = searchResultsPage.clickOnLebronJames();

        Assert.assertEquals(athletePage.getLebronStatsText(), expected);
    }
}
