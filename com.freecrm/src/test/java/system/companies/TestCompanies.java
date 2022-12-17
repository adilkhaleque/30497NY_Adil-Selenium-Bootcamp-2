package system.companies;

import base.BasePage;
import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCompanies extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewCompanyDP")
    public void testCreateNewCompany(String email, String password, String name, String address, String city, String state, String zip, String number,
                                     String numberType, String description, String industry, String numOfEmployees,
                                     String annualRevenue, String priorityIndex, String statusIndex, String sourceIndex, String categoryIndex, String text) {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        CompaniesPage companiesPage = homePage.systemBar.navigateToCompaniesPage();
        CreateNewCompanyPage createNewCompanyPage = companiesPage.clickOnCreateNewCompanyPage();
        createNewCompanyPage.createNewCompany(name, address, city, state, zip, number, numberType, description, industry, numOfEmployees, annualRevenue, Integer.parseInt(priorityIndex), Integer.parseInt(statusIndex), Integer.parseInt(sourceIndex), Integer.parseInt(categoryIndex));

        Assert.assertEquals(createNewCompanyPage.getCompanyNameText(), text);
    }
}
