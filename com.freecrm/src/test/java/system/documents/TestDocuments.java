package system.documents;

import base.BasePage;
import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDocuments extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewDocumentDP")
    public void testCreateNewDocument(String email, String password, String title, String description, String contact, String company, String deal, String caseName, String task, String text) {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        DocumentsPage documentsPage = homePage.systemBar.navigateToDocumentsPage();
        CreateNewDocumentPage createNewDocumentPage = documentsPage.clickOnCreateNewDocumentsButton();
        createNewDocumentPage.createNewDocument(title, description, contact, company, deal, caseName, task);

        Assert.assertEquals(createNewDocumentPage.getDocumentTitleText(), text);
    }
}
