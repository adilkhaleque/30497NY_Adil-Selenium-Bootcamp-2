package system.deals;

import base.BasePage;
import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDeals extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewDealDP")
        public void testCreateNewDeal(String email, String password, String title, String assignedToIndex, String company, String companyIndex, String contact, String contactIndex,
                                  String closeDate, String closeTime, String description, String probability, String amount, String commission,
                                  String stageIndex, String statusIndex, String nextSteps, String typeIndex, String sourceIndex, String text) {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        DealsPage dealsPage = homePage.systemBar.navigateToDealsPage();
        CreateNewDealPage createNewDealPage = dealsPage.clickOnCreateNewDealButton();
        createNewDealPage.createNewDeal(title, Integer.parseInt(assignedToIndex), company, Integer.parseInt(companyIndex), contact, Integer.parseInt(contactIndex), Integer.parseInt(closeDate), Integer.parseInt(closeTime), description, probability, amount, commission, Integer.parseInt(stageIndex), Integer.parseInt(statusIndex), nextSteps, Integer.parseInt(typeIndex), Integer.parseInt(sourceIndex));

        Assert.assertEquals(createNewDealPage.getDealTitleText(), text);
    }
}
