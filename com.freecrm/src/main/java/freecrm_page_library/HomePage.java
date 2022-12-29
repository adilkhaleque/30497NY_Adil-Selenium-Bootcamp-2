package freecrm_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SharedStepsUI;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SharedStepsUI {

    @FindBy(xpath = "//a[@href and text() = 'Login']")
    public WebElement loginButton;

    @FindBy(className = "user-display")
    public WebElement fullNameText;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String getFullNameText() {
        return getTrimmedElementText(fullNameText);
    }

}
