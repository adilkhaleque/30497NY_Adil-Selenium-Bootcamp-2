package freecrm_page_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewEventPage extends SharedStepsUI {

    @FindBy(name = "title")
    public WebElement titleField;

    @FindBy(xpath = "//*[@id='main-content']/div/div[2]/form/div[2]/div[1]/div/div/div/input")
    public WebElement startTimeField;

    @FindBy(xpath = "//*[@id='main-content']/div/div[2]/form/div[2]/div[2]/div/div/div/input")
    public WebElement endTimeField;

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

    @FindBy(xpath = "//div[@name='deal']//div[@role='option']")
    public WebElement dealOption;

    @FindBy(xpath = "//div[@name='task']/input")
    public WebElement taskField;

    @FindBy(xpath = "//div[@name='task']//div[@role='option']")
    public WebElement taskOption;

    @FindBy(xpath = "//div[@name='case']/input")
    public WebElement caseField;

    @FindBy(xpath = "//div[@name='case']//div[@role='option']")
    public WebElement caseOption;

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

    @FindBy(xpath = "//div[@name='company']//div[@role='option']")
    public WebElement companyOption;

    @FindBy(name = "identifier")
    public WebElement identifierField;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='custom-view-container']//div[@class='ui form segment']//div[@class='field'][1]//span/p")
    public WebElement eventTitleText;

    public CreateNewEventPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public String getEventTitleText() {
        return getTrimmedElementText(eventTitleText);
    }

    public void fillOutCreateNewEventForm(String title, String start, String end, int categoryIndex, String description,
                                          String location, String deal, String task, String caseName, int alertBeforeIndex,
                                          int alertViaIndex, String reminder, String company) {

        inputText(titleField, title);
        inputText(startTimeField, start);
        inputText(endTimeField, end);
        safeClickOnElement(categoryDropdown);
        selectOption(categoryOptions, categoryIndex);
        inputText(descriptionField, description);
        inputText(locationField, location);
        inputText(dealField, deal);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='deal']//div[@role='option']")));
        safeClickOnElement(dealOption);
        inputText(taskField, task);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='task']//div[@role='option']")));
        safeClickOnElement(taskOption);
        inputText(caseField, caseName);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='case']//div[@role='option']")));
        safeClickOnElement(caseOption);
        safeClickOnElement(alertBeforeDropdown);
        selectOption(alertBeforeOptions, alertBeforeIndex);
        safeClickOnElement(alertViaDropdown);
        selectOption(alertViaOptions, alertViaIndex);
        inputText(reminderTimeField, reminder);
        inputText(companyField, company);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='company']//div[@role='option']")));
        safeClickOnElement(companyOption);

    }

    public void createNewEvent(String title, String start, String end, int categoryIndex, String description,
                               String location, String deal, String task, String caseName, int alertBeforeIndex,
                               int alertViaIndex, String reminder, String company) {

        fillOutCreateNewEventForm(title, start, end, categoryIndex, description, location, deal, task, caseName, alertBeforeIndex, alertViaIndex, reminder, company);
        clickOnSaveButton();
    }

}
