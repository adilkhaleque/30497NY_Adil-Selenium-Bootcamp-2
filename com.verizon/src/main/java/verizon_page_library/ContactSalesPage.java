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
    public WebElement areaOfInterestSelector;

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

    @FindBy(id = "_db_ad_street")
    public WebElement addressField;

    @FindBy(id = "_db_ad_city")
    public WebElement cityField;

    @FindBy(id = "_db_ad_state")
    public WebElement stateSelector;

    @FindBy(id = "_db_ad_zip")
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

    public void selectCountry(String country) {
        selectFromDropdownByValue(countrySelector, country);
    }

    public void selectSizeOfCompany(String size) {
        selectFromDropdownByValue(sizeOfCompanySelector, size);
    }

    public void selectAreaOfInterest(String aoi) {
        selectFromDropdownByValue(areaOfInterestSelector, aoi);
    }

    public void selectIndustry(String industry) {
        selectFromDropdownByValue(industrySelector, industry);
    }

    public void clickOnNextButton() {
        safeClickOnElement(nextButton);
    }

    public void inputFirstName(String fName) {
        sendKeysToElement(firstNameField, fName);
    }

    public void inputLastName(String lName) {
        sendKeysToElement(lastNameField, lName);
    }

    public void inputEmail(String email) {
        sendKeysToElement(emailField, email);
    }

    public void inputPhoneNumber(String number) {
        sendKeysToElement(phoneNumberField, number);
    }

    public void inputCompany(String company) {
        sendKeysToElement(companyField, company);
    }

    public void selectContactMethod(String contactMethod) {
        selectFromDropdownByValue(contactMethodSelector, contactMethod);
    }

    public void inputAddress(String address) {
        clearSendKeysToElement(addressField, address);
    }

    public void inputCity(String city) {
        clearSendKeysToElement(cityField, city);
    }

    public void selectState(String state) {
        selectFromDropdownByValue(stateSelector, state);
    }

    public void inputZip(String zip) {
        clearSendKeysToElement(zipField, zip);
    }

    public void inputComment(String comment) {
        sendKeysToElement(commentsBox, comment);
    }

    public void clickOnPrivacyPolicyCheckbox() {
        safeClickOnElement(privacyPolicyCheckbox);
    }

    public String getSubmitText() {
        return getTrimmedElementText(submitButton);
    }

    public void fillInProfileInfo(String country, String size, String aoi, String industry) {
        selectCountry(country);
        selectSizeOfCompany(size);
        selectAreaOfInterest(aoi);
        selectIndustry(industry);
    }

    public void fillInContactInfo(String fName, String lName, String email, String number, String company, String contactMethod,
                                  String address, String city, String state, String zip, String comment) {
        inputFirstName(fName);
        inputLastName(lName);
        inputEmail(email);
        inputPhoneNumber(number);
        jsScrollUntilElementIsVisible(companyField);
        inputCompany(company);
        selectContactMethod(contactMethod);
        inputAddress(address);
        inputCity(city);
        selectState(state);
        inputZip(zip);
        inputComment(comment);
    }

}
