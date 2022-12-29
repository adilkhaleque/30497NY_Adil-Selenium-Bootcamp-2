package system.events;

import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import shared.SharedStepsUI;

public class TestEvents extends SharedStepsUI {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewEventDP")
    public void createNewEvent(String email, String password, String title, String start, String end, String categoryIndex, String description,
                               String location, String deal, String task, String caseName, String alertBeforeIndex,
                               String alertViaIndex, String reminder, String company, String text) {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        CalendarPage calendarPage = homePage.systemBar.navigateToCalendarPage();
        CreateNewEventPage createNewEventPage = calendarPage.clickOnCreateNewCalendarButton();
        createNewEventPage.createNewEvent(title, start, end, Integer.parseInt(categoryIndex), description, location, deal, task, caseName, Integer.parseInt(alertBeforeIndex), Integer.parseInt(alertViaIndex), reminder, company);

        Assert.assertEquals(createNewEventPage.getEventTitleText(), text);
    }
}
