package system.apply_for_loan;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import parabank_page_library.AccountServicesPage;
import parabank_page_library.HomePage;
import parabank_page_library.RegistrationPage;
import parabank_page_library.RequestLoanPage;
import utils.GenerateData;

public class TestApplyForLoan extends BasePage {

//    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testApplyForLoan")
//    public void testUpdateProfile(String loanAmount, String downPayment, String message) {
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
//        RequestLoanPage requestLoanPage = accountServicesPage.clickOnRequestLoanButton();
//
//        requestLoanPage.applyForLoan(loanAmount, downPayment);
//
//        Assert.assertEquals(requestLoanPage.getLoanApprovedMessageText(), message);
//    }
}
