package system.account_details;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import parabank_page_library.*;
import utils.GenerateData;

public class TestViewAccountDetails extends BasePage {

//    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewAccountBalance")
//    public void testViewAccountBalance(String expected) {
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
//
//        AccountOverviewPage accountOverviewPage = accountServicesPage.clickOnAccountOverviewButton();
//
//        Assert.assertEquals(accountOverviewPage.getBalanceHeadingText(), expected);
//    }
//
//    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewAccountBalance")
//    public void testViewAccountType(String expected) {
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
//
//        AccountOverviewPage accountOverviewPage = accountServicesPage.clickOnAccountOverviewButton();
//        AccountDetailsAndActivityPage accountDetailsAndActivityPage = accountOverviewPage.clickOnAccount();
//
//        Assert.assertEquals(accountDetailsAndActivityPage.getAccountTypeNameText(), expected);
//
//    }

}
