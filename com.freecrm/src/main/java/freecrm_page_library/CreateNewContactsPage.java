package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewContactsPage extends SharedStepsUI {

    @FindBy(name = "first_name")
    public WebElement firstNameField;

    @FindBy(name = "last_name")
    public WebElement lastNameField;

    @FindBy(name = "middle_name")
    public WebElement middleNameField;

    @FindBy(xpath = "//div[@name='company']/input")
    public WebElement companyField;

    @FindBy(xpath = "//div[@name='company']//div[@role='option']")
    public List<WebElement> companyOptions;

    @FindBy(xpath = "//label[@for='tags']/div")
    public WebElement tagsField;

    @FindBy(xpath = "//input[@Placeholder='Email address']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@Placeholder='Personal email, Business, Alt...']")
    public WebElement emailTypeField;

    @FindBy(name = "category")
    public WebElement categoryDropdown;

    @FindBy(xpath = "//div[@name='category']//div[@class='item']")
    public List<WebElement> categoryOptions;

    @FindBy(name = "status")
    public WebElement statusDropdown;

    @FindBy(xpath = "//div[@name='status']//div[@class='item']")
    public List<WebElement> statusOptions;

    @FindBy(name = "description")
    public WebElement descriptionField;

    @FindBy(xpath = "//div[@name='timezone']/input")
    public WebElement timezoneDropdown;

    @FindBy(xpath = "//div[@name='timezone']//div[@role='listbox']//div[@role='option']")
    public List<WebElement> timezoneOptions;

    @FindBy(name = "address")
    public WebElement addressField;

    @FindBy(name = "city")
    public WebElement cityField;

    @FindBy(name = "state")
    public WebElement stateField;

    @FindBy(name = "zip")
    public WebElement zipField;

    @FindBy(xpath = "//input[@Placeholder='Number']")
    public WebElement numberField;

    @FindBy(xpath = "//input[@Placeholder='Home, Work, Mobile...']")
    public WebElement numberTypeField;

    @FindBy(name = "identifier")
    public WebElement identifierField;

    @FindBy(xpath = "//*[@id='dashboard-toolbar']/div[1]")
    public WebElement contactNameText;

    @FindBy(name = "position")
    public WebElement positionField;

    @FindBy(name = "department")
    public WebElement departmentField;

    @FindBy(xpath = "//div[@name='supervisor']/input")
    public WebElement supervisorField;

    @FindBy(xpath = "//div[@name='assistant']/input")
    public WebElement assistantField;

    @FindBy(name = "source")
    public WebElement sourceDropdown;

    @FindBy(xpath = "//div[@name='source']//div[@class='item']")
    public List<WebElement> sourceOptions;

    @FindBy(name = "day")
    public WebElement dayField;

    @FindBy(name = "month")
    public WebElement monthDropdown;

    @FindBy(xpath = "//div[@name='month']//div[@role='option']")
    public List<WebElement> months;

    @FindBy(name = "year")
    public WebElement yearField;

    @FindBy(xpath = "//div[@name='referred_by']/input")
    public WebElement referredByField;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    public CreateNewContactsPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutCreateNewContactForm(String firstName, String lastName, String company, String email, String emailType,
                                            int categoryIndex, int statusIndex, String description, int timezoneIndex, String address,
                                            String city, String state, String zip, String number, String numberType, String position,
                                            String department, int sourceIndex, String day, int monthIndex, String year) {
        inputText(firstNameField, firstName);
        inputText(lastNameField, lastName);
        inputText(companyField, company);
        inputText(emailField, email);
        inputText(emailTypeField, emailType);
        safeClickOnElement(categoryDropdown);
        selectOption(categoryOptions, categoryIndex);
        safeClickOnElement(statusDropdown);
        selectOption(statusOptions, statusIndex);
        inputText(descriptionField, description);
        safeClickOnElement(timezoneDropdown);
        selectOption(timezoneOptions, timezoneIndex);
        inputText(addressField, address);
        inputText(cityField, city);
        inputText(stateField, state);
        inputText(zipField, zip);
        inputText(numberField, number);
        inputText(numberTypeField, numberType);
        jsScrollUntilElementIsVisible(statusDropdown);
        inputText(positionField, position);
        inputText(departmentField, department);
        safeClickOnElement(sourceDropdown);
        selectOption(sourceOptions, sourceIndex);
        inputText(dayField, day);
        safeClickOnElement(monthDropdown);
        selectOption(months, monthIndex);
        inputText(yearField, year);

    }

    public void clickOnSaveNewContactButton() {
        safeClickOnElement(saveButton);
    }

    public String getContactNameText() {
        return getTrimmedElementText(contactNameText);
    }

    public void createNewContact(String firstName, String lastName, String company, String email, String emailType,
                                 int categoryIndex, int statusIndex, String description, int timezoneIndex, String address,
                                 String city, String state, String zip, String number, String numberType, String position,
                                 String department, int sourceIndex, String day, int monthIndex, String year) throws InterruptedException {
        fillOutCreateNewContactForm(firstName, lastName, company, email, emailType, categoryIndex, statusIndex, description, timezoneIndex, address, city, state, zip, number, numberType, position, department, sourceIndex, day, monthIndex, year);
        clickOnSaveNewContactButton();
        Thread.sleep(2000);
    }
}
