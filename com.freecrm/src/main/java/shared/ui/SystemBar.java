package shared.ui;

import base.BasePage;
import freecrm_page_library.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//div[@id='top-header-menu']//div[@class='right menu']//div[@class='ui inverted transparent left icon input']/input")
    public WebElement searchInput;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/home']")
    public WebElement homeButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/calendar']")
    public WebElement calendarButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/contacts']")
    public WebElement contactsButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/companies']")
    public WebElement companiesButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/deals']")
    public WebElement dealsButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/tasks']")
    public WebElement tasksButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/cases']")
    public WebElement casesButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/calls']")
    public WebElement callsButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/documents']")
    public WebElement documentsButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/email']")
    public WebElement emailButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/campaigns']")
    public WebElement campaignsButton;

    @FindBy(xpath = "//div[@id='main-nav']//div[@class='menu-item-wrapper']/a[@href='/forms']")
    public WebElement formsButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public CompaniesPage navigateToCompaniesPage() {
        hoverOverElement(companiesButton);
        safeClickOnElement(companiesButton);

        return new CompaniesPage();
    }

    public ContactsPage navigateToContactsPage() {
        hoverOverElement(contactsButton);
        safeClickOnElement(contactsButton);

        return new ContactsPage();
    }

    public DealsPage navigateToDealsPage() {
        hoverOverElement(dealsButton);
        safeClickOnElement(dealsButton);

        return new DealsPage();
    }

    public TasksPage navigateToTasksPage() {
        hoverOverElement(tasksButton);
        safeClickOnElement(tasksButton);

        return new TasksPage();
    }

    public CasesPage navigateToCasesPage() {
        hoverOverElement(casesButton);
        safeClickOnElement(casesButton);

        return new CasesPage();
    }

    public CallsPage navigateToCallsPage() {
        hoverOverElement(callsButton);
        safeClickOnElement(callsButton);

        return new CallsPage();
    }

    public DocumentsPage navigateToDocumentsPage() {
        hoverOverElement(documentsButton);
        safeClickOnElement(documentsButton);

        return new DocumentsPage();
    }

    public CampaignsPage navigateToCampaignsPage() {
        hoverOverElement(campaignsButton);
        safeClickOnElement(campaignsButton);

        return new CampaignsPage();
    }
}
