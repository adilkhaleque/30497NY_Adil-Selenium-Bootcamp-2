package system.stats;

import base.BasePage;
import espn_page_library.AthletePage;
import espn_page_library.HomePage;
import espn_page_library.SportsLeaguePage;
import espn_page_library.TeamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStats extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLewisStats")
    public void testViewLewisStats(String expected) {
        HomePage homePage = new HomePage();

        homePage.systemBar.clickOnF1();

        SportsLeaguePage sportsLeaguePage = new SportsLeaguePage();

        sportsLeaguePage.clickOnDriversButton();

        AthletePage athletePage = sportsLeaguePage.clickOnLewisHamilton();

        athletePage.clickOnRaceResultsTab();

        Assert.assertEquals(athletePage.getResultsTitleText(), expected);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLakersStats")
    public void testViewLakersStats(String expectedValue, String expectedName) {
        HomePage homePage = new HomePage();

        SportsLeaguePage sportsLeaguePage = homePage.systemBar.clickOnNba();

        TeamPage teamPage = sportsLeaguePage.navigateToLakersPage();

        teamPage.clickOnLakersStatsButton();

        teamPage.clickOnSeasonDropdown();

        teamPage.selectSeason(expectedValue);

        AthletePage athletePage = teamPage.clickOnKobeBryantLink();

        Assert.assertEquals(athletePage.getKobeText(), expectedName);


    }

}





