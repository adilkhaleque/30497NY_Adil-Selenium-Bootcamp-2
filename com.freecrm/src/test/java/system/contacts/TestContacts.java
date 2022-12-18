package system.contacts;

import base.BasePage;
import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContacts extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewContactDP")
    public void testCreateNewContact(String userEmail, String password, String firstName, String lastName, String company, String email, String emailType,
                                     String categoryIndex, String statusIndex, String description, String timezoneIndex, String address,
                                     String city, String state, String zip, String number, String numberType, String position,
                                     String department, String sourceIndex, String day, String monthIndex, String year, String text) throws InterruptedException {
        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(userEmail, password);
        ContactsPage contactsPage = homePage.systemBar.navigateToContactsPage();
        CreateNewContactsPage createNewContactsPage = contactsPage.clickOnCreateNewContactsPage();
        createNewContactsPage.createNewContact(firstName, lastName, company, email, emailType, Integer.parseInt(categoryIndex), Integer.parseInt(statusIndex), description, Integer.parseInt(timezoneIndex), address, city, state, zip, number, numberType, position, department, Integer.parseInt(sourceIndex), day, Integer.parseInt(monthIndex), year);

        Assert.assertEquals(createNewContactsPage.getContactNameText(), text);
    }
}
