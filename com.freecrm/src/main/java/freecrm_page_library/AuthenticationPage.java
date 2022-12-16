package freecrm_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {

    @FindBy(name = "email")
    public WebElement emailInputField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//div[@class='ui stacked segment']//div[contains(text(), 'Login')]")
    public WebElement loginButton;

    public AuthenticationPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputEmailAddress(String email) {
        sendKeysToElement(emailInputField, email);
    }

    public void inputPassword(String password) {
        sendKeysToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        safeClickOnElement(loginButton);
    }

    public HomePage doSignIn(String email, String password) {
        inputEmailAddress(email);
        inputPassword(password);
        clickOnLoginButton();

        return new HomePage();
    }
}
