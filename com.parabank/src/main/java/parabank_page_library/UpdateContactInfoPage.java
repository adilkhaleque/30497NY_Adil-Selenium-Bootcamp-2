package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateContactInfoPage extends BasePage {

    @FindBy(id = "customer.firstName")
    public WebElement firstNameField;

    @FindBy(id = "customer.lastName")
    public WebElement lastNameField;

    @FindBy(id = "customer.address.street")
    public WebElement addressField;

    @FindBy(id = "customer.address.city")
    public WebElement cityField;

    @FindBy(id = "customer.address.state")
    public WebElement stateField;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCodeField;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement updateProfileButton;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/h1")
    public WebElement profileUpdatedTitle;

    public UpdateContactInfoPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputNewFirstName(String fName) {
        clearSendKeysToElement(firstNameField, fName);
    }

    public void inputNewLastName(String lName) {
        clearSendKeysToElement(lastNameField, lName);
    }

    public void inputNewAddress(String address) {
        clearSendKeysToElement(addressField, address);
    }

    public void inputNewCity(String city) {
        clearSendKeysToElement(cityField, city);
    }

    public void inputNewState(String state) {
        clearSendKeysToElement(stateField, state);
    }

    public void inputNewZipCode(String zip) {
        clearSendKeysToElement(zipCodeField, zip);
    }

    public void inputNewPhoneNumber(String phoneNumber) {
        clearSendKeysToElement(phoneNumberField, phoneNumber);
    }

    public void clickOnUpdateProfileButton() {
        safeClickOnElement(updateProfileButton);
    }

    public String getProfileUpdatedTitleText() {
        return getTrimmedElementText(profileUpdatedTitle);
    }

    public void updateInfo(String fName, String lName, String address, String city, String state, String zip, String number) {
        inputNewFirstName(fName);
        inputNewLastName(lName);
        inputNewAddress(address);
        inputNewCity(city);
        inputNewState(state);
        inputNewZipCode(zip);
        inputNewPhoneNumber(number);
        clickOnUpdateProfileButton();
    }

}
