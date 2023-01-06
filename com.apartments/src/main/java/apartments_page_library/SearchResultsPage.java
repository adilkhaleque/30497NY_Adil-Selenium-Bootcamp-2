package apartments_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(id = "searchBarLookup")
    public WebElement searchResultsSearchBar;

    @FindBy(id = "rentRangeLink")
    public WebElement priceDropdown;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minRentOptions js-minRentOptions active']//li")
    public List<WebElement> priceOptions;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minRentOptions js-minRentOptions active']//li[1]")
    public WebElement noMinPriceOption;

    @FindBy(xpath = "//ul[@id='maxRentOptions']/li[6]")
    public WebElement maxPriceOption;

    @FindBy(id = "bedRangeLink")
    public WebElement numOfBedsDropdown;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minBedOptions active']//li")
    public List<WebElement> numOfBedsOptions;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minBedOptions active']//li[1]")
    public WebElement noMinBedsOption;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='maxBedOptions active']//li[4]")
    public WebElement maxTwoBeds;

    @FindBy(id = "typeSelect")
    public WebElement typeDropdown;

    @FindBy(xpath = "//div[@class='drop-down-container mortar-wrapper active']//div[@data-path]")
    public List<WebElement> typeOptions;

    @FindBy(xpath = "//div[@class='drop-down-container mortar-wrapper active']//div[@data-value='1']/a")
    public WebElement typeOptionApartments;

    @FindBy(id = "lifestyleControl")
    public WebElement lifestyleDropdown;

    @FindBy(xpath = "//fieldset[@class='drop-down-container active']//span[@class='radioGroup']//span//input[@type='radio']")
    public List<WebElement> lifestyleOptions;

    @FindBy(xpath = "//*[@id='lifestyleControl']/fieldset/span/span[1]/a")
    public WebElement lifestyleOptionStudent;

    @FindBy(id = "moveInLink")
    public WebElement moveInDateDropdown;

    @FindBy(xpath = "//div[@id='datepickerSearch']/div/div[1]/table/thead/tr[1]/th[2]")
    public WebElement nextMonthButton;

    @FindBy(xpath = "//div[@id='datepickerSearch']/div/div[1]/table/tbody/tr[2]/td[2]")
    public WebElement moveInDateSelection;

    @FindBy(id = "advancedFiltersIcon")
    public WebElement moreDropdown;

    @FindBy(id = "_baths")
    public WebElement anyBathsOption;

    @FindBy(xpath = "//label[@for='UnitAmenities_16']")
    public WebElement airConditioningOption;

    @FindBy(xpath = "//label[@for='UnitAmenities_2']")
    public WebElement washerAndDryerOption;

    @FindBy(xpath = "//label[@for='UnitAmenities_4']")
    public WebElement dishwasherOption;

    @FindBy(xpath = "//label[@for='CommunityAmenities_65536']")
    public WebElement parkingOption;

    @FindBy(xpath = "//label[@for='CommunityAmenities_512']")
    public WebElement poolOption;

    @FindBy(xpath = "//label[@for='AdditionalAmenities_1073741824']")
    public WebElement garageOption;

    @FindBy(id = "Specialties_128")
    public WebElement cheapAffordability;

    @FindBy(id = "Specialties_64")
    public WebElement luxuryAffordability;

    @FindBy(id = "Rating_16")
    public WebElement fiveStarRatings;

    @FindBy(xpath = "//*[@id='advancedFilters']/section/button[2]")
    public WebElement doneButton;

    @FindBy(id = "saveSearchIcon")
    public WebElement savePromptButton;

    @FindBy(xpath = "//section[@id='marketingBlurb']//div[@class='mortar-wrapper']/h2")
    public WebElement forRentLocation;

    @FindBy(xpath = "//div[@id='placardContainer']/ul/li[1]/article/header/div[3]/a")
    public WebElement favoritesButton1;

    @FindBy(xpath = "//div[@id='placardContainer']/ul/li[2]/article/header/div[3]/a")
    public WebElement favoritesButton2;

    @FindBy(xpath = "//div[@id='notificationsFavorites']/i[1]")
    public WebElement seeFavoritesButton;

    @FindBy(id = "backToSearch")
    public WebElement backToSearchButton;

    @FindBy(xpath = "//div[@id='noFavoritesYetModal']/div/div/h3")
    public WebElement noFavoritesModalText;

    @FindBy(xpath = "//*[@id='placardContainer']/ul/li[1]/article/header/div[1]/a/div[1]/span")
    public WebElement propertyTitle;

    @FindBy(xpath = "//div[@class='property-information']/a")
    public WebElement propertyLinks;

    @FindBy(id = "notificationsFavoritesCount")
    public WebElement favoritesCountHeader;

    @FindBy(id = "sortSearchIcon")
    public WebElement sortButton;

    @FindBy(xpath = "//*[@id='searchResultSortMenu']/ul/li[3]")
    public WebElement rentSortOption;

    @FindBy(xpath = "//div[@class='property-information']/a[@aria-label='THE BELLSLIP, Brooklyn, NY']")
    public WebElement reviewProperty;

    @FindBy(xpath = "//div[@id='placardContainer']/ul/li[1]/article/header/div[1]/a")
    public WebElement rentalProperty;

    @FindBy(xpath = "//a[@id='rentRangeLink']/span[1]")
    public WebElement rentalPriceRangeText;

    @FindBy(xpath = "//section[@id='map']/div[2]/div[6]/div[2]/i")
    public WebElement zoomOutButton;

    @FindBy(id = "savedSearchBtn")
    public WebElement saveSearchButton;

    @FindBy(id = "savedSearchEmailAlerts")
    public WebElement emailAlertsCheckbox;
    //fieldset[@class='checkbox']//label[@for='savedSearchEmailAlerts']

    @FindBy(xpath = "//div[@class='summary']")
    public WebElement savedSearchSummary;

    @FindBy(xpath = "//div[@id='overlaysMenuView']//a")
    public WebElement nearbyButton;

    @FindBy(xpath = "//div[@id='overlaysMenuView']/div/div/button[2]")
    public WebElement nearbyNeighborhoodsButton;

    @FindBy(xpath = "//div[@id='overlaysMenuView']/div/a/span[2]")
    public WebElement neighborhoodsText;

    @FindBy(xpath = "//div[@id='overlaysMenuView']/div/div/button[3]")
    public WebElement nearbyTransitButton;

    @FindBy(xpath = "//div[@id='overlaysMenuView']/div/a/span[2]")
    public WebElement transitText;

    @FindBy(xpath = "//div[@id='overlaysMenuView']/div/div/button[4]")
    public WebElement nearbyRestaurantsButton;

    @FindBy(xpath = "//div[@id='overlaysMenuView']/div/a/span[2]")
    public WebElement restaurantsText;

    @FindBy(xpath = "//div[@id='overlaysMenuView']/div/div/button[5]")
    public WebElement nearbyCampusesButton;

    @FindBy(xpath = "//div[@id='overlaysMenuView']/div/a/span[2]")
    public WebElement campusesText;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectOptions(List<WebElement> elements, int typeIndex) {
        try {
            safeClickOnElement(elements.get(typeIndex));
        } catch (IndexOutOfBoundsException e) {
            safeClickOnElement(elements.get(elements.size() - 1));
        }
    }

    public void clickOnPriceDropdown() {
        safeClickOnElement(priceDropdown);
    }

    public String getPriceDropdownText() {
        return getTrimmedElementText(priceDropdown);
    }

    public void clickOnSelectors(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnSelectorOptions(WebElement element) {
        safeClickOnElement(element);
    }

    public void navigateToDate(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnDoneButton() {
        safeClickOnElement(doneButton);
    }

    public void clickOnSaveSearchPromptButton() {
        safeClickOnElement(savePromptButton);
    }

    public String getPropertyTitleText() {
        return getTrimmedElementText(propertyTitle);
    }

    public void clickToAddAsFavorite(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnFavoritesCountButton() {
        safeClickOnElement(favoritesCountHeader);
    }

    public String getCountOfFavoritesText() {
        return getTrimmedElementText(favoritesCountHeader);
    }

    public void clickOnSortButton() {
        safeClickOnElement(sortButton);
    }

    public void clickOnRentSortOption() {
        safeClickOnElement(rentSortOption);
    }

    public void clickOnZoomOut() {
        safeClickOnElement(zoomOutButton);
    }

    public PropertyPage clickOnRentalProperty() {
        safeClickOnElement(rentalProperty);

        return new PropertyPage();
    }

    public String getRentalPriceRangeText() {
        return getTrimmedElementText(rentalPriceRangeText).substring(3, 5);
    }

    public String getForRentLocationText() {
        hoverOverElement(forRentLocation);
        return getTrimmedElementText(forRentLocation);
    }

    public void clickOnSaveSearchButton() {
        safeClickOnElement(saveSearchButton);
    }

    public void clickOnEmailAlertsCheckbox() {
        safeClickOnElement(emailAlertsCheckbox);
    }

    public String getSavedSearchSummaryText() {
        return getTrimmedElementText(savedSearchSummary);
    }

    public void clickOnNearbyButton() {
        safeClickOnElement(nearbyButton);
    }

    public void clickOnNeighborhoods() {
        safeClickOnElement(nearbyNeighborhoodsButton);
    }

    public void clickOnTransit() {
        safeClickOnElement(nearbyTransitButton);
    }

    public void clickOnRestaurants() {
        safeClickOnElement(nearbyRestaurantsButton);
    }

    public void clickOnCampuses() {
        safeClickOnElement(nearbyCampusesButton);
    }

    public String getNeighborhoodsText() {
        return getTrimmedElementText(neighborhoodsText);
    }

    public String getTransitText() {
        return getTrimmedElementText(transitText);
    }

    public String getRestaurantsText() {
        return getTrimmedElementText(restaurantsText);
    }

    public String getCampusesText() {
        return getTrimmedElementText(campusesText);
    }

    public PropertyPage clickOnProperty() {
        clickOnSortButton();
        clickOnRentSortOption();
        clickOnZoomOut();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(reviewProperty));
        jsScrollElementIntoView(reviewProperty);
        safeClickOnElement(reviewProperty);

        return new PropertyPage();
    }

    public void checkAddTwoFavorites() {
        clickToAddAsFavorite(favoritesButton1);
        clickToAddAsFavorite(favoritesButton2);
        jsScrollElementIntoView(favoritesCountHeader);
        clickOnFavoritesCountButton();
    }

    public void removeOneFavorite() {
        clickToAddAsFavorite(favoritesButton1);
        clickToAddAsFavorite(favoritesButton2);
        jsScrollElementIntoView(favoritesCountHeader);
        clickOnFavoritesCountButton();
        safeClickOnElement(favoritesButton2);
    }


    public void doNarrowSearch() {
        clickOnSelectors(priceDropdown);
        clickOnSelectorOptions(noMinPriceOption);
        clickOnSelectorOptions(maxPriceOption);
        clickOnSelectors(typeDropdown);
        clickOnSelectorOptions(typeOptionApartments);
        clickOnSelectors(lifestyleDropdown);
        clickOnSelectorOptions(lifestyleOptionStudent);
        clickOnSelectors(moveInDateDropdown);
        navigateToDate(nextMonthButton);
        navigateToDate(nextMonthButton);
        clickOnSelectorOptions(moveInDateSelection);
        clickOnSelectors(moreDropdown);
        clickOnSelectorOptions(anyBathsOption);
        jsScrollElementIntoView(luxuryAffordability);
        clickOnSelectorOptions(luxuryAffordability);
        clickOnSelectorOptions(fiveStarRatings);
        clickOnDoneButton();
    }

    public void chooseAmenitiesForRental() {
        clickOnSelectors(moreDropdown);
        clickOnSelectorOptions(airConditioningOption);
        clickOnSelectorOptions(washerAndDryerOption);
        clickOnSelectorOptions(dishwasherOption);
        clickOnSelectorOptions(parkingOption);
        clickOnSelectorOptions(poolOption);
        jsScrollElementIntoView(garageOption);
        clickOnSelectorOptions(garageOption);
        clickOnDoneButton();
        clickOnSortButton();
        clickOnRentSortOption();
    }
}
