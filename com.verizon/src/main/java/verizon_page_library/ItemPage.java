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



}
