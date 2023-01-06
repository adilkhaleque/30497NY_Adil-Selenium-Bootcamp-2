package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

public class CartPage extends SharedStepsUI {

    @FindBy(xpath = "//button[@aria-label='Continue']")
    public WebElement continueButton;
    @FindBy(xpath = "//span[contains(text(), 'Save cart')]")
    public WebElement saveCart;

    @FindBy(xpath = "//div[@id='page']/div[3]/div/div[1]/h1/div")
    public WebElement addedToCartHeading;

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnContinue() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(continueButton));
        jsScrollElementIntoView(continueButton);
        safeClickOnElement(continueButton);
    }

    public String getSaveCartText() {
        return getTrimmedElementText(saveCart);
    }

    public String getAddedToCartText() {
        return getTrimmedElementText(addedToCartHeading);
    }
}
