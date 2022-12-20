package freecrm_page_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewCasePage extends SharedStepsUI {

    @FindBy(name = "title")
    public WebElement titleField;

    @FindBy(xpath = "//div[@class='two fields'][2]//div[@class='field'][1]//div[@class='ui field'][1]//div[@role='listbox']")
    public WebElement assignedToDropdown;

    @FindBy(xpath = "//div[@class='two fields'][2]//div[@class='field'][1]//div[@class='ui field'][1]//div[@role='listbox']//div[@role='option']")
    public List<WebElement> assignedToOptions;

    @FindBy(xpath = "//div[@name='contact']/input")
    public WebElement contactsField;

    @FindBy(xpath = "//div[@name='contact']//div[@role='option']")
    public List<WebElement> contactOptions;

    @FindBy(xpath = "//div[@name='contact']//div[@role='option']")
    public WebElement contactOption;

    @FindBy(xpath = "//div[@name='company']/input")
    public WebElement companyField;

    @FindBy(xpath = "//div[@name='company']//div[@role='option']")
    public List<WebElement> companyOptions;

    @FindBy(xpath = "//div[@name='company']//div[@role='option']")
    public WebElement companyOption;

    @FindBy(xpath = "//div[@name='deal']/input")
    public WebElement dealField;

    @FindBy(xpath = "//div[@name='deal']//div[@role='option']")
    public List<WebElement> dealOptions;

    @FindBy(xpath = "//div[@name='deal']//div[@role='option']")
    public WebElement dealOption;

    @FindBy(name = "type")
    public WebElement typeDropdown;

    @FindBy(xpath = "//div[@name='type']//div[@class='item']")
    public List<WebElement> typeOptions;

    @FindBy(xpath = "//input[@class='calendarField react-datepicker-ignore-onclickoutside']")
    public WebElement deadlineField;

    @FindBy(className = "calendarField")
    public WebElement closeDateField;

    @FindBy(xpath = "//button[@type='button' and text() = 'Next Month']")
    public WebElement nextMonthButton;

    @FindBy(xpath = "//div[@class='react-datepicker__month-container']//div[@class='react-datepicker__month']//div[not(contains(@class, 'react-datepicker__week'))]")
    public List<WebElement> daysOfTheMonth;

    @FindBy(xpath = "//div[@class='react-datepicker__time-container ']//div[@class='react-datepicker__time']//ul//li")
    public List<WebElement> times;

    @FindBy(xpath = "//label[@for='tags']/div")
    public WebElement tagsField;

    @FindBy(name = "description")
    public WebElement descriptionField;

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

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='custom-view-container']//div[@class='ui form segment']//div[@class='field'][1]//span/p")
    public WebElement caseTitleText;

    public CreateNewCasePage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutCreateNewCaseForm(String title, int assignedToIndex, String contact, String company, String deal, int typeIndex, String deadline,
                                         String closeDate, String description, int priorityIndex, int statusIndex) {
        inputText(titleField, title);
        safeClickOnElement(assignedToDropdown);
        selectOption(assignedToOptions, assignedToIndex);
        inputText(contactsField, contact);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='contacts']//div[@role='option']")));
        safeClickOnElement(contactOption);
        inputText(companyField, company);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='company']//div[@role='option']")));
        safeClickOnElement(companyOption);
        inputText(dealField, company);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='deal']//div[@role='option']")));
        safeClickOnElement(dealOption);
        safeClickOnElement(typeDropdown);
        selectOption(typeOptions, typeIndex);
        inputText(deadlineField, deadline);
        inputText(closeDateField, closeDate);
        inputText(descriptionField, description);
        safeClickOnElement(priorityDropdown);
        selectOption(priorityOptions, priorityIndex);
        safeClickOnElement(statusDropdown);
        selectOption(statusOptions, statusIndex);
    }

    public void clickOnSaveNewCaseButton() {
        safeClickOnElement(saveButton);
    }

    public void createNewCase(String title, int assignedToIndex, String contact, String company, String deal, int typeIndex, String deadline,
                              String closeDate, String description, int priorityIndex, int statusIndex) {
        fillOutCreateNewCaseForm(title, assignedToIndex, contact, company, deal, typeIndex, deadline, closeDate, description, priorityIndex, statusIndex);
        clickOnSaveNewCaseButton();
    }

    public String getCaseTitleText() {
        return getTrimmedElementText(caseTitleText);
    }
}
