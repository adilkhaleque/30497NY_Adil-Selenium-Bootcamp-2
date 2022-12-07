package shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import verizon_page_library.*;

public class SystemBar extends BasePage {

    @FindBy(id = "gnav20-Shop-L1")
    public WebElement shopButton;

    @FindBy(id = "gnav20-search-icon")
    public WebElement searchButton;

    @FindBy(id = "search_box_gnav_input")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@class='gnav20-row-one opacityOne']//a[@aria-label='Stores']")
    public WebElement storesButton;

    @FindBy(id = "gnav20-Shop-L2-3")
    public WebElement devicesButton;

    @FindBy(xpath = "//a[@id='gnav20-Shop-L3-2']")
    public WebElement fiveGeePhones;

    @FindBy(xpath = "//a[@id='gnav20-Shop-L3-1']")
    public WebElement smartphones;

    @FindBy(xpath = "//a[@aria-label='Smartwatches']")
    public WebElement searchSuggestion;

    @FindBy(id = "gnav20-Shop-L3-8")
    public WebElement tabletsAndLaptops;

    @FindBy(id = "gnav20-Shop-L3-9")
    public WebElement watches;

    @FindBy(id = "gnav20-Shop-L3-11")
    public WebElement jetpacksAndHotspots;

    @FindBy(id = "gnav20-Shop-L2-4")
    public WebElement accessoriesButton;

    @FindBy(id = "gnav20-Shop-L3-49")
    public WebElement gaming;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnShopButton() {
        safeClickOnElement(shopButton);
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public StoresPage clickOnStoresButton() {
        safeClickOnElement(storesButton);

        return new StoresPage();
    }

    public void clickOnDevicesButton() {
        safeClickOnElement(devicesButton);
    }

    public ShopPage clickOn5gPhonesButton() {
        safeClickOnElement(fiveGeePhones);

        return new ShopPage();
    }

    public SearchResultsPage clickOnSmartPhones() {
        safeClickOnElement(smartphones);

        return new SearchResultsPage();
    }

    public void inputSearch(String searchTerm) {
        sendKeysToElement(searchBar, searchTerm);
    }

    public SearchResultsPage clickOnSearchSuggestion() {
        safeClickOnElement(searchSuggestion);

        return new SearchResultsPage();
    }

    public SearchResultsPage clickOnTabletsAndLaptops() {
        safeClickOnElement(tabletsAndLaptops);

        return new SearchResultsPage();
    }

    public SearchResultsPage clickOnWatches() {
        safeClickOnElement(watches);

        return new SearchResultsPage();
    }

    public SearchResultsPage clickOnJetpacksAndHotspots() {
        safeClickOnElement(jetpacksAndHotspots);

        return new SearchResultsPage();
    }

    public void clickOnAccessoriesButton() {
        safeClickOnElement(accessoriesButton);
    }

    public GamingPage clickOnGaming() {
        safeClickOnElement(gaming);

        return new GamingPage();
    }

    public SearchResultsPage doSearch(String searchTerm) {
        clickOnSearchButton();
        inputSearch(searchTerm);
        clickOnSearchSuggestion();

        return new SearchResultsPage();
    }

    public ShopPage navigateTo5gPhones() {
        clickOnShopButton();
        clickOnDevicesButton();
        clickOn5gPhonesButton();

        return new ShopPage();
    }

    public SearchResultsPage navigateToSmartphonesResults() {
        clickOnShopButton();
        clickOnDevicesButton();
        clickOnSmartPhones();

        return clickOnSmartPhones();
    }

    public SearchResultsPage navigateToTabletsAndLaptopsResults() {
        clickOnShopButton();
        clickOnDevicesButton();
        clickOnTabletsAndLaptops();

        return new SearchResultsPage();
    }

    public SearchResultsPage navigateToWatches() {
        clickOnShopButton();
        clickOnDevicesButton();
        clickOnWatches();

        return new SearchResultsPage();
    }

    public SearchResultsPage navigateToJetpacksAndHotspots() {
        clickOnShopButton();
        clickOnDevicesButton();
        jsScrollUntilElementIsVisible(jetpacksAndHotspots);
        clickOnJetpacksAndHotspots();

        return new SearchResultsPage();
    }

    public GamingPage navigateToGamingPage() {
        clickOnShopButton();
        clickOnAccessoriesButton();
        clickOnGaming();

        return new GamingPage();
    }

}
