package system.calls;

import base.BasePage;
import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalls extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewCallDP")
    public void testCreateNewCall(String email, String password, String assignedToIndex, String callTime, String typeIndex, String duration, String startTime,
                                  String flagIndex, String description, String contact, String deal, String caseName, String task,
                                  String number, String numberType, String text) {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        CallsPage callsPage = homePage.systemBar.navigateToCallsPage();
        CreateNewCallPage createNewCallPage = callsPage.clickOnCreateNewCallButton();
        createNewCallPage.createNewCall(Integer.parseInt(assignedToIndex), callTime, Integer.parseInt(typeIndex), duration, startTime, Integer.parseInt(flagIndex), description, contact, deal, caseName, task, number, numberType);

        Assert.assertEquals(createNewCallPage.getCallTimeText(), text);
    }
}
