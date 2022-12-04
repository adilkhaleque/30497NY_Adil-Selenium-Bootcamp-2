package apartments_page_library;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

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

    @FindBy(id = "iFrameResizer0")
    public WebElement signInIFrame;

    @FindBy(xpath = "//header[@id='mainHeader']//div[@class='header-switch-language-wrapper mortar-wrapper']/a")
    public WebElement languageButton;

    @FindBy(xpath = "//div[@class='language-pop modal show']//div[@class='modal-actions']//a[@title='Español']")
    public WebElement spanishOption;

    @FindBy(xpath = "//*[@id='mainHeaderNavigation']/div[2]/a/span")
    public WebElement spanishLanguageText;

    @FindBy(xpath = "//ul[@id='menuNavigation']//li[@id='menuNavItemContainer2']/a")
    public WebElement homesForRent;

    @FindBy(xpath = "//li[@id='menuNavItemContainer2']//ul[@class='submenu properties']//li/a")
    public List<WebElement> rentalHomeLocations;

    @FindBy(xpath = "//ul[@id='menuNavigation']//li[@id='menuNavItemContainer1']")
    public WebElement apartmentsForRent;

    @FindBy(xpath = "//li[@id='menuNavItemContainer1']//ul[@class='submenu properties']//li/a")
    public List<WebElement> rentalApartmentLocations;

    @FindBy(xpath = "//ul[@id='menuNavigation']//li[@id='menuNavItemContainer3']")
    public WebElement condosForRent;

    @FindBy(xpath = "//li[@id='menuNavItemContainer3']//ul[@class='submenu properties']//li/a")
    public List<WebElement> rentalCondoLocations;

    @FindBy(xpath = "//ul[@id='menuNavigation']//li[@id='menuNavItemContainer4']")
    public WebElement townhomesForRent;

    @FindBy(xpath = "//li[@id='menuNavItemContainer4']//ul[@class='submenu properties']//li/a")
    public List<WebElement> rentalTownhomeLocations;

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

    public void clickOnHomesForRent() {
        safeClickOnElement(homesForRent);
    }

    public void clickOnApartmentsForRent() {
        safeClickOnElement(apartmentsForRent);
    }

    public void clickOnCondosForRent() {
        safeClickOnElement(condosForRent);
    }

    public void clickOnTownhomesForRent() {
        safeClickOnElement(townhomesForRent);
    }

    public SearchResultsPage doSearch(String searchTerm) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("quickSearchLookup"))).click();
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
        webDriverWait.until(ExpectedConditions.visibilityOf(signInIFrame));
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

    public SearchResultsPage selectRentalLocation(int index, List<WebElement> locations) {
        try {
            safeClickOnElement(locations.get(index));
        } catch (IndexOutOfBoundsException e) {
            safeClickOnElement(locations.get(locations.size() - 1));
        }

        return new SearchResultsPage();
    }

}
