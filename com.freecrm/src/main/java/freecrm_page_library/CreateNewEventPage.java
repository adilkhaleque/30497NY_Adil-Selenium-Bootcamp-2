package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewEventPage extends SharedStepsUI {

    @FindBy(name = "title")
    public WebElement titleField;

    @FindBy(xpath = "//div[@name='category' and @class='ui selection dropdown']")
    public WebElement categoryDropdown;

    @FindBy(xpath = "//div[@name='category' and @role='option']")
    public List<WebElement> categoryOptions;

    @FindBy(xpath = "//label[@for='tags']/div")
    public WebElement tagsField;

    @FindBy(name = "description")
    public WebElement descriptionField;

    @FindBy(name = "location")
    public WebElement locationField;

    @FindBy(xpath = "//div[@class='ui toggle checkbox']/input")
    public WebElement allDayToggle;

    @FindBy(xpath = "//div[@name='deal']/input")
    public WebElement dealField;

    @FindBy(xpath = "//div[@name='task']/input")
    public WebElement taskField;

    @FindBy(xpath = "//div[@name='task']/case")
    public WebElement caseField;

    @FindBy(name = "minutesBefore")
    public WebElement alertBeforeDropdown;

    @FindBy(xpath = "//div[@name='minutesBefore']//div[@role='option']")
    public List<WebElement> alertBeforeOptions;

    @FindBy(name = "channels")
    public WebElement alertViaDropdown;

    @FindBy(xpath = "//div[@name='channels']//div[@role='option']")
    public List<WebElement> alertViaOptions;

    @FindBy(name = "reminder_minutes")
    public WebElement reminderTimeField;

    @FindBy(xpath = "//div[@name='company']/input")
    public WebElement companyField;

    @FindBy(name = "identifier")
    public WebElement identifierField;

    public CreateNewEventPage() {
        PageFactory.initElements(driver, this);
    }
}
