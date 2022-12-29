package freecrm_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InitialPage extends BasePage {

    @FindBy(xpath = "//a[@href and text() = 'Login']")
    public WebElement loginButton;


    public InitialPage() {
        PageFactory.initElements(driver, this);
    }

    public AuthenticationPage clickOnLoginButton() {
        safeClickOnElement(loginButton);

        return new AuthenticationPage();
    }

}
