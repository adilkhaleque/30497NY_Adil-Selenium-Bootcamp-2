package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CalendarPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='dashboard-toolbar']/div[2]/div/button")
    public WebElement syncNowButton;

    @FindBy(xpath = "//a[@href='/calendar/new']")
    public WebElement createNewCalendarButton;

    public CalendarPage() {
        PageFactory.initElements(driver, this);
    }

    public CreateNewEventPage clickOnCreateNewCalendarButton() {
        safeClickOnElement(createNewCalendarButton);

        return new CreateNewEventPage();
    }
}
