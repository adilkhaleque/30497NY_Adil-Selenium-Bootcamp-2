package freecrm_page_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewCallPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='main-content']/div/div[2]/form/div[1]/div[1]/div/div/div/input")
    public WebElement callTimeField;

    @FindBy(xpath = "//div[@class='two fields'][1]//div[@class='field']//div[@class='ui field']//div[@role='listbox']")
    public WebElement assignedToDropdown;

    @FindBy(xpath = "//div[@class='two fields'][1]//div[@class='field']//div[@class='ui field']//div[@role='listbox']//div[@role='option']")
    public List<WebElement> assignedToOptions;

    @FindBy(xpath = "//div[@class='two fields'][1]//div[@class='field']//div[@class='ui field']//div[@role='listbox']//div[@role='option']")
    public WebElement assignedToOption;

    @FindBy(name = "type")
    public WebElement typeDropdown;

    @FindBy(xpath = "//div[@name='type']//div[@class='item']")
    public List<WebElement> typeOptions;

    @FindBy(xpath = "//input[@name='duration']")
    public WebElement durationField;

    @FindBy(xpath = "//*[@id='main-content']/div/div[2]/form/div[3]/div[1]/div/div/div/input")
    public WebElement startTimeField;

    @FindBy(name = "flag")
    public WebElement flagDropdown;

    @FindBy(xpath = "//div[@name='flag']//div[@name='flag' and @role='option']")
    public List<WebElement> flagOptions;

    @FindBy(xpath = "//label[@for='tags']/div")
    public WebElement tagsField;

    @FindBy(name = "description")
    public WebElement descriptionField;

    @FindBy(xpath = "//div[@class='ui fluid container main-content']//form[@class='ui form segment custom-form-container']//div[@class='two fields'][5]//div[@class='field'][1]//div[@role='combobox']/input")
    public WebElement contactsField;

    @FindBy(xpath = "//div[@class='ui fluid container main-content']//form[@class='ui form segment custom-form-container']//div[@class='two fields'][5]//div[@class='field'][1]//div[@role='combobox']//div[@role='option']")
    public List<WebElement> contactOptions;

    @FindBy(xpath = "//div[@class='ui fluid container main-content']//form[@class='ui form segment custom-form-container']//div[@class='two fields'][5]//div[@class='field'][1]//div[@role='combobox']//div[@role='option']")
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

    @FindBy(xpath = "//div[@name='task']/input")
    public WebElement taskField;

    @FindBy(xpath = "//div[@name='task']//div[@role='option']")
    public List<WebElement> taskOptions;

    @FindBy(xpath = "//div[@name='task']//div[@role='option']")
    public WebElement taskOption;

    @FindBy(xpath = "//input[@Placeholder='Number']")
    public WebElement numberField;

    @FindBy(xpath = "//input[@Placeholder='Home, Work, Mobile...']")
    public WebElement numberTypeField;

    @FindBy(name = "identifier")
    public WebElement identifierField;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='ui form segment']//div[@class='field'][1]//a[1]")
    public WebElement callTimeText;

    public CreateNewCallPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutCreateNewCallForm(int assignedToIndex, String callTime, int typeIndex, String duration, String startTime,
                                         int flagIndex, String description, String contact, String deal, String caseName, String task,
                                         String number, String numberType)  {

        safeClickOnElement(assignedToDropdown);
        selectOption(assignedToOptions, assignedToIndex);
        inputText(callTimeField, callTime);
        safeClickOnElement(typeDropdown);
        selectOption(typeOptions, typeIndex);
        inputText(durationField, duration);
        inputText(startTimeField, startTime);
        safeClickOnElement(flagDropdown);
        selectOption(flagOptions, flagIndex);
        inputText(descriptionField, description);
        jsScrollUntilElementIsVisible(contactsField);
        inputText(contactsField, contact);
        inputText(dealField, deal);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='deal']//div[@role='option']")));
        safeClickOnElement(dealOption);
        inputText(caseField, caseName);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='case']//div[@role='option']")));
        safeClickOnElement(caseOption);
        inputText(taskField, task);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='task']//div[@role='option']")));
        safeClickOnElement(taskOption);
        inputText(numberField, number);
        inputText(numberTypeField, numberType);

    }

    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public void createNewCall(int assignedToIndex, String callTime, int typeIndex, String duration, String startTime,
                              int flagIndex, String description, String contact, String deal, String caseName, String task,
                              String number, String numberType) {

        fillOutCreateNewCallForm(assignedToIndex, callTime, typeIndex, duration, startTime, flagIndex, description, contact, deal, caseName, task, number, numberType);
        clickOnSaveButton();
    }

    public String getCallTimeText() {
        return getTrimmedElementText(callTimeText);
    }

}
