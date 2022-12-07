package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class ItemPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@id='cta-btn']/div[1]/button")
    public WebElement continueButton;

    @FindBy(xpath = "//button[@aria-label='New Customer']")
    public WebElement newCustomerButton;

    @FindBy(xpath = "//input[@data-testid='zipInput']")
    public WebElement zipCodeField;

    @FindBy(xpath = "//button[@data-testid='zipConfirm']")
    public WebElement confirmLocationButton;

    @FindBy(xpath = "//input[@data-testid='test-input']")
    public WebElement rememberLocationCheckBox;

    @FindBy(xpath = "//button[@aria-label='Skip for now']")
    public WebElement skipButton;

    @FindBy(xpath = "//button[@aria-label='Continue']")
    public WebElement continueAgainButton;

    @FindBy(xpath = "//div[@data-testid='titleId']/h1/div")
    public WebElement headsetTitle;

    @FindBy(xpath = "//div[@data-testid='titleId']//div[@data-testid='reviewWrapper']//a")
    public WebElement reviewLink;

    @FindBy(xpath = "//*[@id='featuredTabREVIEWSTAB']/div/div[2]/div[1]/div[4]/button")
    public WebElement writeAReviewButton;

    @FindBy(id = "bv-radio-rating-5")
    public WebElement fiveStarButton;

    @FindBy(id = "bv-text-field-title")
    public WebElement reviewTitleField;

    @FindBy(id = "bv-textarea-field-reviewtext")
    public WebElement reviewBodyField;

    @FindBy(id = "bv-radio-isrecommended-true-label")
    public WebElement yesRecommendButton;

    @FindBy(id = "bv-radio-rating_Design-5")
    public WebElement fiveStarDesignButton;

    @FindBy(id = "bv-radio-rating_Features-5")
    public WebElement fiveStarFeaturesButton;

    @FindBy(id = "bv-radio-rating_Performance-5")
    public WebElement fiveStarPerformanceButton;

    @FindBy(id = "bv-text-field-usernickname")
    public WebElement nickNameField;

    @FindBy(id = "bv-email-field-hostedauthentication_authenticationemail")
    public WebElement emailField;

    @FindBy(id = "bv-checkbox-reviews-termsAndConditions")
    public WebElement termsAndConditionsCheckbox;

    @FindBy(name = "bv-submit-button")
    public WebElement postReviewButton;

    public ItemPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnContinueButton() {
        jsClickOnElement(continueButton);
        safeClickOnElement(continueButton);
    }

    public void clickOnNewCustomer() {
        safeClickOnElement(newCustomerButton);
    }

    public void inputZipCode(String zip) {
        clearSendKeysToElement(zipCodeField, zip);
    }

    public void clickOnRememberMyLocationCheckBox() {
        safeClickOnElement(rememberLocationCheckBox);
    }

    public CartPage confirmLocation(String zip) {
        inputZipCode(zip);
        clickOnRememberMyLocationCheckBox();
        clickOnConfirmLocation();

        return new CartPage();
    }

    public void clickOnConfirmLocation() {
        safeClickOnElement(confirmLocationButton);
    }

    public CartPage clickOnSkipButton() {
        jsScrollUntilElementIsVisible(skipButton);
        safeClickOnElement(skipButton);

        return new CartPage();
    }

    public String getHeadsetText() {
        return getTrimmedElementText(headsetTitle).substring(0, 11);
    }

    public void clickOnReviewLink() {
        safeClickOnElement(reviewLink);
    }

    public void clickOnWriteAReviewButton() {
        safeClickOnElement(writeAReviewButton);
    }

    public void clickOnFiveStarOverallRating() {
        safeClickOnElement(fiveStarButton);
    }

    public void inputReviewTitle(String title) {
        sendKeysToElement(reviewTitleField, title);
    }

    public void inputReviewBody(String body) {
        sendKeysToElement(reviewBodyField, body);
    }

    public void clickOnYesButton() {
        safeClickOnElement(yesRecommendButton);
    }

    public void clickOnFiveStarDesignButton() {
        safeClickOnElement(fiveStarDesignButton);
    }

    public void clickOnFiveStarFeaturesButton() {
        safeClickOnElement(fiveStarFeaturesButton);
    }

    public void clickOnFiveStarPerformanceButton() {
        safeClickOnElement(fiveStarPerformanceButton);
    }

    public void inputNickname(String nickname) {
        sendKeysToElement(nickNameField, nickname);
    }

    public void inputEmail(String email) {
        sendKeysToElement(emailField, email);
    }

    public void clickOnTermsAndConditionsCheckbox() {
        safeClickOnElement(termsAndConditionsCheckbox);
    }

    public String getPostReviewText() {
        return getTrimmedElementText(postReviewButton);
    }

    public void postReview(String title, String body, String nickname, String email) {
        clickOnReviewLink();
        clickOnWriteAReviewButton();
        clickOnFiveStarOverallRating();
        inputReviewTitle(title);
        inputReviewBody(body);
        clickOnYesButton();
        clickOnFiveStarDesignButton();
        clickOnFiveStarFeaturesButton();
        clickOnFiveStarPerformanceButton();
        jsScrollUntilElementIsVisible(reviewTitleField);
        inputNickname(nickname);
        inputEmail(email);
        clickOnTermsAndConditionsCheckbox();
        getPostReviewText();

    }
}
