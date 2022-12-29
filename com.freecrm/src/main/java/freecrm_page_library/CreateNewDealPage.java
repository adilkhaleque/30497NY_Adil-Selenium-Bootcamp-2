package freecrm_page_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewDealPage extends SharedStepsUI {

    @FindBy(name = "title")
    public WebElement titleField;

    @FindBy(xpath = "//div[@class='two fields'][2]//div[@class='field'][1]//div[@class='ui field'][1]//div[@role='listbox']")
    public WebElement assignedToDropdown;

    @FindBy(xpath = "//div[@class='two fields'][2]//div[@class='field'][1]//div[@class='ui field'][1]//div[@role='listbox']//div[@role='option']")
    public List<WebElement> assignedToOptions;

    @FindBy(xpath = "//div[@name='company']/input")
    public WebElement companyField;

    @FindBy(xpath = "//div[@name='company']//div[@role='option']")
    public List<WebElement> companyOptions;

    @FindBy(xpath = "//div[@name='company']//div[@role='option']")
    public WebElement companyOption;

    @FindBy(name = "products")
    public WebElement productsField;

    @FindBy(xpath = "//div[@name='contacts']/input")
    public WebElement contactsField;

    @FindBy(xpath = "//div[@name='contacts']//div[@role='option']")
    public List<WebElement> contactsOptions;

    @FindBy(xpath = "//div[@name='contacts']//div[@role='option']")
    public WebElement contactOption;

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

    @FindBy(name = "probability")
    public WebElement probabilityField;

    @FindBy(name = "amount")
    public WebElement amountField;

    @FindBy(name = "commission")
    public WebElement commissionField;

    @FindBy(name = "stage")
    public WebElement stageDropdown;

    @FindBy(xpath = "//div[@name='stage']//div[@class='item']")
    public List<WebElement> stageOptions;

    @FindBy(name = "status")
    public WebElement statusDropdown;

    @FindBy(xpath = "//div[@name='status']//div[@class='item']")
    public List<WebElement> statusOptions;

    @FindBy(name = "next_step")
    public WebElement nextStepsField;

    @FindBy(name = "type")
    public WebElement typeDropdown;

    @FindBy(xpath = "//div[@name='type']//div[@class='item']")
    public List<WebElement> typeOptions;

    @FindBy(name = "source")
    public WebElement sourceDropdown;

    @FindBy(xpath = "//div[@name='source']//div[@class='item']")
    public List<WebElement> sourceOptions;

    @FindBy(name = "identifier")
    public WebElement identifierField;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='custom-view-container']//div[@class='ui form segment']//div[@class='field'][1]//span/p")
    public WebElement dealTitleText;

    public CreateNewDealPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutCreateNewDealForm(String title, int assignedToIndex, String company, int companyIndex, String contact, int contactIndex,
                                         int closeDate, int closeTime, String description, String probability, String amount, String commission,
                                         int stageIndex, int statusIndex, String nextSteps, int typeIndex, int sourceIndex) {
        inputText(titleField, title);
        safeClickOnElement(assignedToDropdown);
        selectOption(assignedToOptions, assignedToIndex);
        inputText(companyField, company);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='company']//div[@role='option']")));
        safeClickOnElement(companyOption);
        inputText(contactsField, contact);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='contacts']//div[@role='option']")));
        safeClickOnElement(contactOption);
        safeClickOnElement(closeDateField);
        safeClickOnElement(nextMonthButton);
        selectOption(daysOfTheMonth, closeDate);
        selectOption(times, closeTime);
        inputText(descriptionField, description);
        inputText(probabilityField, probability);
        inputText(amountField, amount);
        inputText(commissionField, commission);
        safeClickOnElement(stageDropdown);
        selectOption(stageOptions, stageIndex);
        safeClickOnElement(statusDropdown);
        selectOption(statusOptions, statusIndex);
        inputText(nextStepsField, nextSteps);
        safeClickOnElement(typeDropdown);
        selectOption(typeOptions, typeIndex);
        safeClickOnElement(sourceDropdown);
        selectOption(sourceOptions, sourceIndex);
    }

    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public String getDealTitleText() {
        return getTrimmedElementText(dealTitleText);
    }

    public void createNewDeal(String title, int assignedToIndex, String company, int companyIndex, String contact, int contactIndex,
                              int closeDate, int closeTime, String description, String probability, String amount, String commission,
                              int stageIndex, int statusIndex, String nextSteps, int typeIndex, int sourceIndex) {
        fillOutCreateNewDealForm(title, assignedToIndex, company, companyIndex, contact, contactIndex, closeDate, closeTime, description, probability, amount, commission, stageIndex, statusIndex, nextSteps, typeIndex, sourceIndex);
        clickOnSaveButton();
    }
}
