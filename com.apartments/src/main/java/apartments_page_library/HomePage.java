package apartments_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(id = "quickSearchLookup")
    public WebElement searchBox;

    @FindBy(className = "go")
    public WebElement searchButton;

    @FindBy(id = "headerMenuLabel")
    public WebElement menuButton;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li[1]/a")
    public WebElement renterTools;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li[1]/ul/li[3]/a")
    public WebElement rentalCalculator;

    @FindBy(xpath = "//a[@title='Sign In']")
    public WebElement signInPromptButton;

    @FindBy(id = "username")
    public WebElement emailInputField;

    @FindBy(id = "password")
    public WebElement passwordInputField;

    @FindBy(id = "loginButton")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@id='headerLoginSection']//div/button/span")
    public WebElement accountNameText;

    @FindBy(id = "iFrameResizer1")
    public WebElement signInIFrame;

    @FindBy(xpath = "//header[@id='mainHeader']//div[@class='header-switch-language-wrapper mortar-wrapper']/a")
    public WebElement languageButton;

    @FindBy(xpath = "//div[@class='language-pop modal show']//div[@class='modal-actions']//a[@title='Español']")
    public WebElement spanishOption;

    @FindBy(xpath = "//*[@id='mainHeaderNavigation']/div[2]/a/span")
    public WebElement spanishLanguageText;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void inputSearch(String searchTerm) {
        clearSendKeysToElement(searchBox, searchTerm);
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public void clickOnMenuButton() {
        safeClickOnElement(menuButton);
    }

    public void clickOnRenterToolsButton() {
        safeClickOnElement(renterTools);
    }

    public void clickOnSignInPromptButton() {
        safeClickOnElement(signInPromptButton);
    }

    public void inputEmail(String email) {
        sendKeysToElement(emailInputField, email);
    }

    public void inputPassword(String password) {
        sendKeysToElement(passwordInputField, password);
    }

    public void clickOnSignInButton() {
        safeClickOnElement(signInButton);
    }

    public String getAccountNameText() {
        return getTrimmedElementText(accountNameText);
    }

    public void clickOnLanguageButton() {
        safeClickOnElement(languageButton);
    }

    public void clickOnSpanish() {
        safeClickOnElement(spanishOption);
    }

    public String getSpanishLanguageText() {
        return getTrimmedElementText(spanishLanguageText);
    }

    public RentAffordabilityCalculatorPage clickOnRentalCalculator() {
        safeClickOnElement(rentalCalculator);

        return new RentAffordabilityCalculatorPage();
    }

    public SearchResultsPage doSearch(String searchTerm) throws InterruptedException {
        inputSearch(searchTerm);
        Thread.sleep(2000);
        clickOnSearchButton();

        return new SearchResultsPage();
    }

    public RentAffordabilityCalculatorPage navigateToRentCalculatorPage() {
        clickOnMenuButton();
        clickOnRenterToolsButton();
        clickOnRentalCalculator();

        return new RentAffordabilityCalculatorPage();
    }

    public void doSignIn(String email, String password) {
        clickOnSignInPromptButton();
        switchToIFrame(signInIFrame);
        inputEmail(email);
        inputPassword(password);
        clickOnSignInButton();
        switchToParentFrame();
    }

    public void changeLanguage() {
        clickOnLanguageButton();
        clickOnSpanish();
    }

}
