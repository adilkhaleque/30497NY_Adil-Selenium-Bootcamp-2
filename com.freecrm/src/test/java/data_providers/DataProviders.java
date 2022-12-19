package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "AuthenticationDP")
    public Object[][] getLoginDetails() {
        return excel.readStringArrays("Authentication");
    }

    @DataProvider(name = "testCreateNewCompanyDP")
    public Object[][] getNewCompanyInformation() {
        return excel.readStringArrays("CreateNewCompany");
    }

    @DataProvider(name = "testCreateNewContactDP")
    public Object[][] getNewContactInformation() {
        return excel.readStringArrays("CreateNewContact");
    }

    @DataProvider(name = "testCreateNewDealDP")
    public Object[][] getNewDealInformation() {
        return excel.readStringArrays("CreateNewDeal");
    }
}
