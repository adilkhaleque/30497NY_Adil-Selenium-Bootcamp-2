package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewDocumentPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@name='folder']/input")
    public WebElement folderDropdown;

    @FindBy(xpath = "//div[@name='folder']//div[@role='option']")
    public List<WebElement> folderOptions;

    @FindBy(xpath = "//div[@name='folder']//div[@role='option']")
    public WebElement folderOption;

    @FindBy(name = "title")
    public WebElement titleField;

    @FindBy(xpath = "//label[@for='tags']/div")
    public WebElement tagsField;

    @FindBy(name = "description")
    public WebElement descriptionField;

    @FindBy(name = "//input[@name='file']")
    public WebElement fileField;

    @FindBy(xpath = "//div[@name='contact']/input")
    public WebElement contactField;

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

    @FindBy(name = "identifier")
    public WebElement identifierField;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='custom-view-container']//div[@class='ui form segment']//div[@class='field']//span/p")
    public WebElement documentTitleText;

    public CreateNewDocumentPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutNewDocumentForm(String title, String description, String contact, String company, String deal, String caseName, String task) {

        inputText(titleField, title);
        inputText(descriptionField, description);
        inputText(contactField, contact);
        safeClickOnElement(contactOption);
        inputText(companyField, company);
        safeClickOnElement(companyOption);
        inputText(dealField, deal);
        safeClickOnElement(dealOption);
        inputText(caseField, caseName);
        safeClickOnElement(caseOption);
        inputText(taskField, task);
        safeClickOnElement(taskOption);
    }

    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public String getDocumentTitleText() {
        return getTrimmedElementText(documentTitleText);
    }

    public void createNewDocument(String title, String description, String contact, String company, String deal, String caseName, String task) {

        fillOutNewDocumentForm(title, description, contact, company, deal, caseName, task);
        clickOnSaveButton();
    }
}
