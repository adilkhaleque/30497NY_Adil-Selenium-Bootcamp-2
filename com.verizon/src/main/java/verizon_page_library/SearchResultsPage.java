package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@id='filters']//div[@id='renderSelectedFilters']//p/span")
    public WebElement googleFilterText;

    @FindBy(xpath = "//button[@aria-label='My recommendation']")
    public WebElement myRecommendationButton;

    @FindBy(xpath = "//button[@aria-label='Start over']")
    public WebElement startOver;

    @FindBy(xpath = "//button[@type='button' and text() = 'Yes, start again']")
    public WebElement startAgainConfirmation;

    //wait until visible and then click
    @FindBy(xpath = "//button[@aria-label='Help me choose']")
    public WebElement helpMeChooseButton;

    //wait until visible then click
    @FindBy(id = "no_label")
    public WebElement newCustomerOption;

    @FindBy(xpath = "//button[@type='button' and text() = 'Next']")
    public WebElement nextButton;

    @FindBy(id = "single_line_label")
    public WebElement oneLineOption;

    @FindBy(xpath = "//*[@id='no_help_me_choose-2']")
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

    @FindBy(id = "shopping-0")
    public WebElement browsingAndShopping;

    @FindBy(id = "social_media-1")
    public WebElement socialMedia;

    @FindBy(id = "listen_to_music-2")
    public WebElement musicOrPodcasts;

    @FindBy(id = "watch_tv_and_films-3")
    public WebElement tvAndMovies;

    @FindBy(id = "streaming_sports-4")
    public WebElement streamSports;

    @FindBy(id = "maps_and_gps-6")
    public WebElement mapsAndGps;

    @FindBy(id = "organising_my_life-8")
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

    @FindBy(id = "apple-1")
    public WebElement appleCheckbox;

    @FindBy(id = "samsung-2")
    public WebElement samsungCheckbox;

    @FindBy(id = "google_label")
    public WebElement googleCheckbox;

    @FindBy(id = "i_want_a_bigger_screen_label")
    public WebElement biggerScreenOption;
    //click next

    @FindBy(id = "dont_mind_label")
    public WebElement dontMind5gOption;
    //click next

    @FindBy(id = "none_of_these-7")
    public WebElement noPerksOption;
    //click next

    @FindBy(id = "hd_video_streaming-0")
    public WebElement hdStreamingOption;
    //click next

    @FindBy(id = "none_of_these-2")
    public WebElement noBenefitsOption;
    //click next

    //click next

    //wait until visibility of text

    //assert

    @FindBy(xpath = "//span[@class='css-1ol8tse' and text() = 'Apple iPhone 14 Pro Max']")
    public WebElement phoneOfChoiceText;


    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getGoogleFilterText() {
        return getTrimmedElementText(googleFilterText);
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

    public void clickOnApple() {
        safeClickOnElement(appleCheckbox);
    }

    public void clickOnSamsung() {
        safeClickOnElement(samsungCheckbox);
    }

    public void clickOnGoogle() {
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

    public void chooseSmartphone() {
        webDriverWait.until(ExpectedConditions.visibilityOf(helpMeChooseButton));
        clickOnHelpMeChoose();
        webDriverWait.until(ExpectedConditions.visibilityOf(newCustomerOption));
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
        clickOnApple();
        clickOnSamsung();
        clickOnGoogle();
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
