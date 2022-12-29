package system.cases;

import base.BasePage;
import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewCaseDP")
    public void testCreateNewCase(String email, String password, String title, String assignedToIndex, String contact, String company, String deal, String typeIndex, String deadline,
                                  String closeDate, String description, String priorityIndex, String statusIndex, String text) {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        CasesPage casesPage = homePage.systemBar.navigateToCasesPage();
        CreateNewCasePage createNewCasePage = casesPage.clickOnCreateNewDealButton();
        createNewCasePage.createNewCase(title, Integer.parseInt(assignedToIndex), contact, company, deal, Integer.parseInt(typeIndex), deadline, closeDate, description, Integer.parseInt(priorityIndex), Integer.parseInt(statusIndex));

        Assert.assertEquals(createNewCasePage.getCaseTitleText(), text);
    }
}
