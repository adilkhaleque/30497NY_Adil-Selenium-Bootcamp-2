package ebay_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {

    @FindBy(id = "userid")
    public WebElement emailBox;

    @FindBy(id = "signin-continue-btn")
    public WebElement continueButton;

    @FindBy(id = "pass")
    public WebElement passwordBox;

    @FindBy(id = "sgnBt")
    public WebElement signInButton;

    public AuthenticationPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputEmailAddress(String email) {
        sendKeysToElement(emailBox, email);
    }

    public void clickOnContinueButton() {
        safeClickOnElement(continueButton);
    }

    public void inputPassword(String password) {
        sendKeysToElement(passwordBox, password);
    }

    public void clickOnSignInButton() {
        safeClickOnElement(signInButton);
    }
}
