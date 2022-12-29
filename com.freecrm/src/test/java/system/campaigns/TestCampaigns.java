package system.campaigns;

import base.BasePage;
import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCampaigns extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewCampaignDP")
    public void testCreateNewCampaign(String email, String password, String name, String transportTypeIndex, String text) throws InterruptedException {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        CampaignsPage campaignsPage = homePage.systemBar.navigateToCampaignsPage();
        CreateNewCampaignPage createNewCampaignPage = campaignsPage.clickOnCreateNewCampaignsButton();
        createNewCampaignPage.createNewCampaign(name, Integer.parseInt(transportTypeIndex));

        Assert.assertEquals(createNewCampaignPage.getCampaignNameText(), text);
    }
}
