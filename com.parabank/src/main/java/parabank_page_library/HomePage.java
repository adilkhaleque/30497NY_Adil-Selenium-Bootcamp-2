package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='login']/input[@name='username']")
    public WebElement usernameInputField;

    @FindBy (xpath = "//div[@class='login']/input[@name='password']")
    public WebElement passwordInputField;

    @FindBy (xpath = "//div[@class='login']/input[@value='Log In']")
    public WebElement submitLoginButton;

    @FindBy (css = "#rightPanel p[class='error']")
    public WebElement errorMessage;

    @FindBy (xpath = "//a[contains(text(), 'Register')]")
    public WebElement registerAccountButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void inputUsername(String username) {
        sendKeysToElement(usernameInputField, username);
    }

    public void inputPassword(String password) {
        sendKeysToElement(passwordInputField, password);
    }

    public AccountOverviewPage clickSubmitLogin() {
        clickOnElement(submitLoginButton);

        return new AccountOverviewPage();
    }

    public AccountOverviewPage doLogin(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        return clickSubmitLogin();
    }

    public RegistrationPage clickRegisterNewAccountButton() {
        clickOnElement(registerAccountButton);

        return new RegistrationPage();
    }
}
