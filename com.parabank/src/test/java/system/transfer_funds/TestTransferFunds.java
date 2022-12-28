package system.transfer_funds;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import parabank_page_library.*;
import utils.GenerateData;

public class TestTransferFunds extends BasePage {

//    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testTransferFunds")
//    public void testTransferFunds(String expectedAmount, String text) {
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
//        TransferFundsPage transferFundsPage = accountServicesPage.clickOnTransferFundsButton();
//
//        transferFundsPage.doTransfer(expectedAmount);
//
//        Assert.assertEquals(transferFundsPage.getTransferCompleteTitleText(), text);
//    }
}
