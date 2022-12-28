package system.wwe_history;

import base.BasePage;
import espn_page_library.HomePage;
import espn_page_library.SportsLeaguePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestViewWweUniversalChampionshipHistory extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testWweUniversalChampion")
    public void testWweUniversalChampionshipHistory(String expected) {
        HomePage homePage = new HomePage();

        SportsLeaguePage sportsLeaguePage = homePage.systemBar.clickOnWweButton();

        sportsLeaguePage.clickOnWweTitleHistory();

        sportsLeaguePage.clickOnWweUniversalChampionshipHistoryArticle();

        Assert.assertEquals(sportsLeaguePage.getRomanReignsText(), expected);

    }
}
