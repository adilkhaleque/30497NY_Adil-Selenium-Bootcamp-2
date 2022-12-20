package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewTaskPage extends SharedStepsUI {

    @FindBy(name = "title")
    public WebElement titleField;

    @FindBy(xpath = "//div[@class='two fields'][2]//div[@class='field'][1]//div[@class='ui field'][1]//div[@role='listbox']")
    public WebElement assignedToDropdown;

    @FindBy(xpath = "//div[@class='two fields'][2]//div[@class='field'][1]//div[@class='ui field'][1]//div[@role='listbox']//div[@role='option']")
    public List<WebElement> assignedToOptions;

    @FindBy(name = "type")
    public WebElement typeDropdown;

    @FindBy(xpath = "//div[@name='type']//div[@class='item']")
    public List<WebElement> typeOptions;

    @FindBy(xpath = "//input[@class='calendarField react-datepicker-ignore-onclickoutside']")
    public WebElement dueDateField;

    @FindBy(className = "calendarField")
    public WebElement closeDateField;

    @FindBy(xpath = "//button[@type='button' and text() = 'Next Month']")
    public WebElement nextMonthButton;

    @FindBy(xpath = "//div[@class='react-datepicker__month-container']//div[@class='react-datepicker__month']//div[not(contains(@class, 'react-datepicker__week'))]")
    public List<WebElement> daysOfTheMonth;

    @FindBy(xpath = "//div[@class='react-datepicker__time-container ']//div[@class='react-datepicker__time']//ul//li")
    public List<WebElement> times;

    @FindBy(xpath = "//div[@name='contact']/input")
    public WebElement contactsField;

    @FindBy(xpath = "//div[@name='contact']//div[@role='option']")
    public List<WebElement> contactOptions;

    @FindBy(xpath = "//div[@name='contact']//div[@role='option']")
    public WebElement contactOption;

    @FindBy(xpath = "//div[@name='deal']/input")
    public WebElement dealField;

    @FindBy(xpath = "//div[@name='deal']//div[@role='option']")
    public List<WebElement> dealOptions;

    @FindBy(xpath = "//div[@name='deal']//div[@role='option']")
    public WebElement dealOption;

    @FindBy(xpath = "//div[@name='case']/input")
    public WebElement caseField;

    @FindBy(xpath = "//div[@name='case']//div[@role='option']")
    public List<WebElement> caseOptions;

    @FindBy(xpath = "//div[@name='case']//div[@role='option']")
    public WebElement caseOption;

    @FindBy(xpath = "//label[@for='tags']/div")
    public WebElement tagsField;

    @FindBy(name = "description")
    public WebElement descriptionField;

    @FindBy(xpath = "//input[@name='completion']")
    public WebElement completionField;

    @FindBy(name = "priority")
    public WebElement priorityDropdown;

    @FindBy(xpath = "//div[@name='priority']//div[@class='item']")
    public List<WebElement> priorityOptions;

    @FindBy(name = "status")
    public WebElement statusDropdown;

    @FindBy(xpath = "//div[@name='status']//div[@class='item']")
    public List<WebElement> statusOptions;

    @FindBy(name = "identifier")
    public WebElement identifierField;

    public CreateNewTaskPage() {
        PageFactory.initElements(driver, this);
    }
}
