package system.team_name_text;

import base.BasePage;
import espn_page_library.HomePage;
import espn_page_library.SportsLeaguePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTeamName extends BasePage {

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLakersName")
    public void testLakersText(String expected) {
        HomePage homePage = new HomePage();

        SportsLeaguePage sportsLeaguePage = homePage.systemBar.clickOnNba();

        sportsLeaguePage.clickOnNbaTeams();

        Assert.assertEquals(sportsLeaguePage.getLakersText(), expected);

    }

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testYankeesName")
    public void testYankeesText(String expected) {
        HomePage homePage = new HomePage();

        SportsLeaguePage sportsLeaguePage = homePage.systemBar.clickOnMlb();

        sportsLeaguePage.clickOnMlbTeams();

        Assert.assertEquals(sportsLeaguePage.getYankeesText(), expected);

    }
}
