package verizon_page_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

import java.util.List;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@id='filters']//div[@id='renderSelectedFilters']//p/span")
    public WebElement googleFilterText;

    @FindBy(xpath = "//div[@id='filters']//div[@id='renderSelectedFilters']//p/span")
    public WebElement samsungFilterText;

    @FindBy(xpath = "//button[@aria-label='My recommendation']")
    public WebElement myRecommendationButton;

    @FindBy(xpath = "//button[@aria-label='Start over']")
    public WebElement startOver;

    @FindBy(xpath = "//button[@type='button' and text() = 'Yes, start again']")
    public WebElement startAgainConfirmation;

    //wait until visible and then click
    @FindBy(id = "_15gifts-launcher-button")
    public WebElement helpMeChooseButton;

    //wait until visible then click
    @FindBy(id = "no_label")
    public WebElement newCustomerOption;

    @FindBy(xpath = "//button[@type='button' and text() = 'Next']")
    public WebElement nextButton;

    @FindBy(id = "single_line_label")
    public WebElement oneLineOption;

    @FindBy(id = "no_help_me_choose-2")
    public WebElement helpMeDecidePhone;

    @FindBy(id = "no_help_me_choose_label")
    public WebElement reiterateHelpMeDecide;

    //0 - 4, starts at 0, need to slide to 4
//    @FindBy(xpath = "//button[@aria-valuetext='Low cost and basic']")
//    public WebElement lowCostSlider;
//
//    @FindBy(xpath = "//div[@class='fgifts-ryo36r']//div[@data-pit-position='0']")
//    public WebElement lowCostPos;

    @FindBy(xpath = "//div[@class='fgifts-ryo36r']//div[@data-pit-position='4']")
    public WebElement veryLatestTech;

    //1, 2, 3, 4, 5, 7, 9
//    @FindBy(xpath = "//fieldset[@class='_15gifts-answers fgifts-1bt56pd']//div[@class='fgifts-ucm1hq']/input[@type='checkbox']")
//    public List<WebElement> phoneUsagesCheckboxes;
    //scroll down after and click next

    @FindBy(id = "shopping_label")
    public WebElement browsingAndShopping;

    @FindBy(id = "social_media_label")
    public WebElement socialMedia;

    @FindBy(id = "listen_to_music_label")
    public WebElement musicOrPodcasts;

    @FindBy(id = "watch_tv_and_films_label")
    public WebElement tvAndMovies;

    @FindBy(id = "streaming_sports_label")
    public WebElement streamSports;

    @FindBy(id = "maps_and_gps_label")
    public WebElement mapsAndGps;

    @FindBy(id = "organising_my_life_label")
    public WebElement organizingMyLife;

//    @FindBy(xpath = "//button[@aria-valuetext=\"Camera quality, Don't mind\"]")
//    public WebElement cameraQualitySlider;

    @FindBy(xpath = "//div[@id='_15gifts-engine']/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/div[5]")
    public WebElement cameraQualityEssential;
//
//    @FindBy(xpath = "//button[@aria-valuetext=\"Battery life, Don't mind\"]")
//    public WebElement batteryLifeSlider;

    @FindBy(xpath = "//div[@id='_15gifts-engine']/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[5]")
    public WebElement batteryLifeEssential;
//
//    //scroll down to screenQuality
//    @FindBy(xpath = "//button[@aria-valuetext=\"Screen quality, Don't mind\"]")
//    public WebElement screenQualitySlider;

    @FindBy(xpath = "//h3[@class='fgifts-czx6lp' and text() = 'Screen quality']")
    public WebElement screenQualityHeading;

    @FindBy(xpath = "//div[@id='_15gifts-engine']/div[1]/div/div/div/div/div[2]/div[3]/div/div[2]/div[5]")
    public WebElement screenQualityEssential;
//
//    @FindBy(xpath = "//button[@aria-valuetext=\"Water resistance, Don't mind\"]")
//    public WebElement waterResistanceSlider;

    @FindBy(xpath = "//div[@id='_15gifts-engine']/div[1]/div/div/div/div/div[2]/div[4]/div/div[2]/div[5]")
    public WebElement waterResistanceEssential;
//
//    @FindBy(xpath = "//button[@aria-valuetext=\"Wireless charging, Don't mind\"]")
//    public WebElement wirelessChargingSlider;
    //scroll down to nwxt button and press click

    @FindBy(xpath = "//div[@id='_15gifts-engine']/div[1]/div/div/div/div/div[2]/div[5]/div/div[2]/div[5]")
    public WebElement wirelessChargingEssential;

    //2, 3, 4
//    @FindBy(xpath = "//fieldset[@class='_15gifts-answers fgifts-1bt56pd']//input")
//    public List<WebElement> brandsCheckboxes;
    //scroll down to next button and click next

    @FindBy(id = "apple_label")
    public WebElement appleCheckbox;

    @FindBy(id = "samsung_label")
    public WebElement samsungCheckbox;

    @FindBy(id = "google_label")
    public WebElement googleCheckbox;

    @FindBy(id = "i_want_a_bigger_screen_label")
    public WebElement biggerScreenOption;
    //click next

    @FindBy(id = "dont_mind_label")
    public WebElement dontMind5gOption;
    //click next

    @FindBy(id = "none_of_these_label")
    public WebElement noPerksOption;
    //click next

    @FindBy(id = "hd_video_streaming-0")
    public WebElement hdStreamingOption;
    //click next

    @FindBy(id = "none_of_these_label")
    public WebElement noBenefitsOption;
    //click next

    //click next

    //wait until visibility of text

    //assert

    @FindBy(xpath = "//span[@class='css-1ol8tse' and text() = 'Apple iPhone 14 Pro Max']")
    public WebElement phoneOfChoiceText;

    @FindBy(xpath = "//div[@id='content-filters']/ul/li[2]/button")
    public WebElement brandDropdown;

    @FindBy(xpath = "//*[@id='product.manufacturer.name_s']/div/li/span/label")
    public List<WebElement> brands;

    @FindBy(xpath = "//div[@id='content-filters']/ul/li[3]/button")
    public WebElement colorDropdown;

    @FindBy(xpath = "//*[@id='sku.color_description_s']/div/li/span/label")
    public List<WebElement> colors;

    @FindBy(xpath = "//div[@id='content-filters']/div/button[2]")
    public WebElement filterButton;

    @FindBy(xpath = "//div[@id='layout_container']//div[@class='newGridTileStyled__InnerDiv-bsQFXG eybXYa']//h2/a[@href]")
    public List<WebElement> watches;

    @FindBy(xpath = "//div[@id='header-container']//ul//li[2]/button")
    public WebElement appleTabletsButton;

    @FindBy(xpath = "//*[@id='breadCrumb']/h1")
    public WebElement shopTabletsHeading;

    @FindBy(xpath = "//select[@label='Sort by:']")
    public WebElement sortByDropdown;

    @FindBy(xpath = "//select[@label='Sort by:']//option")
    public List<WebElement> sortByOptions;

    @FindBy(xpath = "//select[@label='Sort by:']//option[2]")
    public WebElement newestOption;

    @FindBy(xpath = "//div[@data-testid='stop-propagation']//label")
    public List<WebElement> compareHotspotsCheckboxes;

    @FindBy(id = "compareButton")
    public WebElement compareButton;

    @FindBy(xpath = "//div[@id='header-container']//ul//li[5]/button")
    public WebElement steelSeriesButton;

    @FindBy(xpath = "//*[@id='gridwall-wrapper']/section/div[2]/div[1]/a")
    public WebElement steelSeriesHeadsetLink;

    @FindBy(xpath = "//ul[@role='tablist']//li[3]/button")
    public WebElement appleSmartphonesButton;

    @FindBy(xpath = "//*[@id='gridwall-wrapper']/section/div[2]/div[3]/a")
    public WebElement iPhoneLink;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getGoogleFilterText() {
        return getTrimmedElementText(googleFilterText);
    }

    public String getSamsungFilterText() {
        return getTrimmedElementText(samsungFilterText);
    }

    public void clickOnMyRecommendationButton() {
        safeClickOnElement(myRecommendationButton);
    }

    public void clickOnStartOver() {
        safeClickOnElement(startOver);
    }

    public void clickOnStartAgain() {
        safeClickOnElement(startAgainConfirmation);
    }

    public void clickOnHelpMeChoose() {
        safeClickOnElement(helpMeChooseButton);
    }

    public void clickOnNewCustomer() {
        safeClickOnElement(newCustomerOption);
    }

    public void clickOnNext() {
        safeClickOnElement(nextButton);
    }

    public void clickOnOneLine() {
        safeClickOnElement(oneLineOption);
    }

    public void clickOnHelpMeDecidePhone() {
        safeClickOnElement(helpMeDecidePhone);
    }

    public void clickOnVeryLatestTech() {
        safeClickOnElement(veryLatestTech);
    }

    public void clickOnBrowsingAndShopping() {
        safeClickOnElement(browsingAndShopping);
    }

    public void clickOnSocialMedia() {
        safeClickOnElement(socialMedia);
    }

    public void clickOnStreamingMusicOrPodcasts() {
        safeClickOnElement(musicOrPodcasts);
    }

    public void clickOnWatchingTvOrMovies() {
        safeClickOnElement(tvAndMovies);
    }

    public void clickOnStreamingSports() {
        safeClickOnElement(streamSports);
    }

    public void clickOnMapsAndGps() {
        safeClickOnElement(mapsAndGps);
    }

    public void clickOnOrganizingMyLife() {
        safeClickOnElement(organizingMyLife);
    }

//    public void clickOnHelpMeDecideAgain() {
//        safeClickOnElement(reiterateHelpMeDecide);
//    }

    public void clickOnCameraQualityEssential() {
        safeClickOnElement(cameraQualityEssential);
    }

    public void clickOnBatteryLifeEssential() {
        safeClickOnElement(batteryLifeEssential);
    }

    public void clickOnScreenQualityEssential() {
        safeClickOnElement(screenQualityEssential);
    }

    public void clickOnWaterResistanceEssential() {
        safeClickOnElement(waterResistanceEssential);
    }

    public void clickOnWirelessChargingEssential() {
        safeClickOnElement(wirelessChargingEssential);
    }

    public void clickOnAppleCheckbox() {
        safeClickOnElement(appleCheckbox);
    }

    public void clickOnSamsungCheckbox() {
        safeClickOnElement(samsungCheckbox);
    }

    public void clickOnGoogleCheckbox() {
        safeClickOnElement(googleCheckbox);
    }

    public void clickOnBiggerScreen() {
        safeClickOnElement(biggerScreenOption);
    }

    public void clickOnDontMind5g() {
        safeClickOnElement(dontMind5gOption);
    }

    public void clickOnNoPerks() {
        safeClickOnElement(noPerksOption);
    }

    public void clickOnHdStreaming() {
        safeClickOnElement(hdStreamingOption);
    }

    public void clickOnNoBenefits() {
        safeClickOnElement(noBenefitsOption);
    }
    //wait until visibility of text

    public String getPhoneOfChoiceText() {
        return getTrimmedElementText(phoneOfChoiceText);
    }

    public void clickOnBrandDropdown() {
        safeClickOnElement(brandDropdown);
    }

    public void selectSpecificBrand(int itemIndex) {
        try {
            clickOnElement(brands.get(itemIndex));
        } catch (IndexOutOfBoundsException e) {
            clickOnElement(brands.get(brands.size() - 1));
        }
    }

    public void clickOnFilterButton() {
        safeClickOnElement(filterButton);
    }

    public void clickOnColorDropdown() {
        safeClickOnElement(colorDropdown);
    }

    public void selectSpecificColor(int itemIndex) {
        try {
            clickOnElement(colors.get(itemIndex));
        } catch (IndexOutOfBoundsException e) {
            clickOnElement(colors.get(colors.size() - 1));
        }
    }

    public ItemPage selectProduct(int itemIndex) {
        try {
            clickOnElement(watches.get(itemIndex));
        } catch (IndexOutOfBoundsException e) {
            clickOnElement(watches.get(watches.size() - 1));
        }

        return new ItemPage();
    }

    public void clickOnAppleTabletsButton() {
        safeClickOnElement(appleTabletsButton);
    }

    public String getShopTabletsHeadingText() {
        return getTrimmedElementText(shopTabletsHeading);
    }

    public void clickOnSortByDropdown() {
        safeClickOnElement(sortByDropdown);
    }

    public void selectSortByOption(int index) {
        selectFromDropdownByIndex(sortByDropdown, index);
    }

    public String getNewestOptionText() {
        return getTrimmedElementText(newestOption);
    }

    public CompareDevicesPage clickOnCompareButton() {
        safeClickOnElement(compareButton);

        return new CompareDevicesPage();
    }

    public void clickOnSteelSeries() {
        safeClickOnElement(steelSeriesButton);
    }

    public ItemPage clickOnSteelSeriesHeadset() {
        safeClickOnElement(steelSeriesHeadsetLink);

        return new ItemPage();
    }

    public void clickOnAppleSmartphonesButton() {
        safeClickOnElement(appleSmartphonesButton);
    }

    public ItemPage clickOnIphone() throws InterruptedException {
        Thread.sleep(2000);
        safeClickOnElement(iPhoneLink);

        return new ItemPage();
    }

    public void chooseSmartphone() {
        webDriverWait.until(ExpectedConditions.visibilityOf(helpMeChooseButton));
        clickOnHelpMeChoose();
        clickOnNewCustomer();
        clickOnNext();
        clickOnOneLine();
        clickOnNext();
        clickOnHelpMeDecidePhone();
        clickOnNext();
        clickOnVeryLatestTech();
        clickOnNext();
        clickOnBrowsingAndShopping();
        clickOnSocialMedia();
        clickOnStreamingMusicOrPodcasts();
        clickOnWatchingTvOrMovies();
        clickOnStreamingSports();
        clickOnMapsAndGps();
        clickOnOrganizingMyLife();
        jsScrollUntilElementIsVisible(nextButton);
        clickOnNext();
        clickOnCameraQualityEssential();
        clickOnBatteryLifeEssential();
        jsScrollUntilElementIsVisible(screenQualityHeading);
        clickOnScreenQualityEssential();
        clickOnWaterResistanceEssential();
        clickOnWirelessChargingEssential();
        jsScrollUntilElementIsVisible(nextButton);
        clickOnNext();
        clickOnAppleCheckbox();
        clickOnSamsungCheckbox();
        clickOnGoogleCheckbox();
        jsScrollUntilElementIsVisible(nextButton);
        clickOnNext();
        clickOnBiggerScreen();
        clickOnNext();
        clickOnDontMind5g();
        clickOnNext();
        clickOnNoPerks();
        clickOnNext();
        clickOnHdStreaming();
        clickOnNext();
        clickOnNoBenefits();
        clickOnNext();
        clickOnNext();
        webDriverWait.until(ExpectedConditions.visibilityOf(phoneOfChoiceText));
    }




}
