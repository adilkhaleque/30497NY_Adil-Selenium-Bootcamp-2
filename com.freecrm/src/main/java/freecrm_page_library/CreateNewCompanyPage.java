package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewCompanyPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@class='ui field']//div[@class='ui right corner labeled input']//input[@name='name']")
    public WebElement nameField;

    @FindBy(name = "url")
    public WebElement websiteField;

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

    @FindBy(xpath = "//label[@for='tags']/div")
    public WebElement tagsField;

    @FindBy(name = "industry")
    public WebElement industryField;

    @FindBy(name = "num_employees")
    public WebElement numOfEmployeesField;

    @FindBy(name = "description")
    public WebElement descriptionField;

    @FindBy(name = "symbol")
    public WebElement stockSymbolField;

    @FindBy(name = "annual_revenue")
    public WebElement annualRevenueField;

    @FindBy(name = "priority")
    public WebElement priorityDropdown;

    @FindBy(xpath = "//div[@name='priority']//div[@class='item']")
    public List<WebElement> priorityOptions;

    @FindBy(name = "status")
    public WebElement statusDropdown;

    @FindBy(xpath = "//div[@name='status']//div[@class='item']")
    public List<WebElement> statusOptions;

    @FindBy(name = "source")
    public WebElement sourceDropdown;

    @FindBy(xpath = "//div[@name='source']//div[@class='item']")
    public List<WebElement> sourceOptions;

    @FindBy(name = "category")
    public WebElement categoryDropdown;

    @FindBy(xpath = "//div[@name='category']//div[@class='item']")
    public List<WebElement> categoryOptions;

    @FindBy(name = "vat_number")
    public WebElement vatField;

    @FindBy(name = "identifier")
    public WebElement identifierField;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='custom-view-container']//div[@class='ui form segment']//div[@class='field'][1]//span/p")
    public WebElement companyNameText;

    public CreateNewCompanyPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutCreateNewCompanyForm(String name, String address, String city, String state, String zip, String number,
                                            String numberType, String description, String industry, String numOfEmployees,
                                            String annualRevenue, int priorityIndex, int statusIndex, int sourceIndex, int categoryIndex) {
        inputText(nameField, name);
        inputText(addressField, address);
        inputText(cityField, city);
        inputText(stateField, state);
        inputText(zipField, zip);
        inputText(numberField, number);
        inputText(numberTypeField, numberType);
        inputText(descriptionField, description);
        inputText(industryField, industry);
        inputText(numOfEmployeesField, numOfEmployees);
        inputText(annualRevenueField, annualRevenue);
        jsScrollElementIntoView(numberField);
        safeClickOnElement(priorityDropdown);
        selectOption(priorityOptions, priorityIndex);
        safeClickOnElement(statusDropdown);
        selectOption(statusOptions, statusIndex);
        safeClickOnElement(sourceDropdown);
        selectOption(sourceOptions, sourceIndex);
        safeClickOnElement(categoryDropdown);
        selectOption(categoryOptions, categoryIndex);
    }

    public void clickOnSaveNewCompanyButton() {
        safeClickOnElement(saveButton);
    }

    public String getCompanyNameText() {
        return getTrimmedElementText(companyNameText);
    }

    public void createNewCompany(String name, String address, String city, String state, String zip, String number,
                                 String numberType, String description, String industry, String numOfEmployees,
                                 String annualRevenue, int priorityIndex, int statusIndex, int sourceIndex, int categoryIndex) {
        fillOutCreateNewCompanyForm(name, address, city, state, zip, number, numberType, description, industry, numOfEmployees, annualRevenue, priorityIndex, statusIndex, sourceIndex, categoryIndex);
        clickOnSaveNewCompanyButton();
        getCompanyNameText();
    }
}
