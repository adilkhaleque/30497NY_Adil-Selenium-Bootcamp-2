package verizon_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactSalesPage extends BasePage {

    @FindBy(id = "_db_country")
    public WebElement countrySelector;

    @FindBy(name = "NumberOfEmployees")
    public WebElement sizeOfCompanySelector;

    @FindBy(className = "topic")
    public WebElement areasOfInterestSelector;

    @FindBy(id = "_db_industry")
    public WebElement industrySelector;

    @FindBy(xpath = "//a[contains(text(), 'Next')]")
    public WebElement nextButton;

    @FindBy(name = "FirstName")
    public WebElement firstNameField;

    @FindBy(name = "LastName")
    public WebElement lastNameField;

    @FindBy(id = "Email")
    public WebElement emailField;

    @FindBy(name = "Phone")
    public WebElement phoneNumberField;

    @FindBy(id = "Company")
    public WebElement companyField;

    @FindBy(name = "PrefMeth")
    public WebElement contactMethodSelector;

    @FindBy(id = "_db_ad_city")
    public WebElement citySelector;

    @FindBy(id = "_db_ad_state")
    public WebElement stateSelector;

    @FindBy(xpath = "_db_ad_zip")
    public WebElement zipField;

    @FindBy(name = "Comments")
    public WebElement commentsBox;

    @FindBy(className = "privacy")
    public WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//button[contains(text(), 'Submit') and @class='step2 submit primary vz-button-link']")
    public WebElement submitButton;

    public ContactSalesPage() {
        PageFactory.initElements(driver, this);
    }


}
