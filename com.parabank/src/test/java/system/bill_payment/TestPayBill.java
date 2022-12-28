package system.bill_payment;

import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import parabank_page_library.AccountServicesPage;
import parabank_page_library.BillPayPage;
import parabank_page_library.HomePage;
import parabank_page_library.RegistrationPage;
import utils.GenerateData;

public class TestPayBill extends BasePage {

//    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testPayBill")
//    public void testPayBill(String accNum, String verifyAccNum, String amount, String text) {
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
//        BillPayPage billPayPage = accountServicesPage.clickOnBillPayButton();
//
//        webDriverWait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().dismiss();
//
//        String name = generateData.firstName();
//        String address = generateData.streetAddress();
//        String city1 = generateData.city();
//        String state1 = generateData.state();
//        String zip1 = generateData.zipCode();
//        String phoneNumber1 = generateData.mobilePhone();
//
//        billPayPage.enterPayeeInformation(name, address, city1, state1, zip1, phoneNumber1, accNum, verifyAccNum,
//                amount);
//
//        billPayPage.clickOnSendPaymentButton();
//
//        Assert.assertEquals(billPayPage.getBillPaymentCompleteTitle(), text);
//
//    }
}
