package system.open_new_account;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import parabank_page_library.AccountServicesPage;
import parabank_page_library.HomePage;
import parabank_page_library.OpenNewAccountPage;
import parabank_page_library.RegistrationPage;
import utils.GenerateData;

import java.awt.*;
import java.awt.event.KeyEvent;


public class TestOpenNewAccount extends BasePage {

//    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testOpenCheckingAccount")
//    public void testOpenCheckingAccount(String checking, String message) throws AWTException {
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
//        OpenNewAccountPage openNewAccountPage = accountServicesPage.clickOnOpenNewAccountButton();
//
//        openNewAccountPage.openCheckingAccount(checking);
//
//        webDriverWait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().sendKeys(username);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_TAB);
//        driver.switchTo().alert().sendKeys(password);
//        pressEnterKey();
//
//        Assert.assertEquals(openNewAccountPage.getAccountOpenedMessageText(), message);
//    }
//
//    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testOpenCheckingAccount")
//    public void testOpenSavingsAccount(String savings, String message) throws AWTException {
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
//        OpenNewAccountPage openNewAccountPage = accountServicesPage.clickOnOpenNewAccountButton();
//
//        webDriverWait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().sendKeys(username);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_TAB);
//        driver.switchTo().alert().sendKeys(password);
//        pressEnterKey();
//
//        openNewAccountPage.openSavingsAccount(savings);
//
//        Assert.assertEquals(openNewAccountPage.getAccountOpenedMessageText(), message);
//    }
}
