package system.update_profile;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import parabank_page_library.AccountServicesPage;
import parabank_page_library.HomePage;
import parabank_page_library.RegistrationPage;
import parabank_page_library.UpdateContactInfoPage;
import utils.GenerateData;

public class TestUpdateProfile extends BasePage {

//    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testUpdateProfile")
//    public void testUpdateProfile(String fName, String lName, String address, String newCity, String newState, String newZip,
//                                  String number, String title) {
//
//        HomePage homePage = new HomePage();
//        GenerateData generateData = new GenerateData();
//
//        String firstName = generateData.firstName();
//        String lastName = generateData.lastName();
//        String streetAddress = generateData.streetAddress();
//        String city = generateData.city();
//        String state = generateData.state();
//        String zip = generateData.zipCode();
//        String phoneNumber = generateData.mobilePhone();
//        String ssn = generateData.ssn();
//        String username = generateData.email().split("@")[0];
//        String password = generateData.password();
//
//        RegistrationPage registrationPage = homePage.clickRegisterNewAccountButton();
//        registrationPage.fillRegistrationAccountForm(firstName, lastName, streetAddress, city, state, zip, phoneNumber,
//                ssn, username, password);
//
//        AccountServicesPage accountServicesPage = registrationPage.submitAccountRegistrationForm();
//        UpdateContactInfoPage updateContactInfoPage = accountServicesPage.clickOnUpdateContactInfoButton();
//
//        updateContactInfoPage.updateInfo(fName, lName, address, newCity, newState, newZip, number);
//
//        Assert.assertEquals(updateContactInfoPage.getProfileUpdatedTitleText(), title);
//
//    }
}
