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

    @DataProvider(name = "testCreateNewCaseDP")
    public Object[][] getNewCaseInformation() {
        return excel.readStringArrays("CreateNewCase");
    }

    @DataProvider(name = "testCreateNewTaskDP")
    public Object[][] getNewTaskInformation() {
        return excel.readStringArrays("CreateNewTask");
    }

    @DataProvider(name = "testCreateNewCallDP")
    public Object[][] getNewCallInformation() {
        return excel.readStringArrays("CreateNewCall");
    }

    @DataProvider(name = "testCreateNewDocumentDP")
    public Object[][] getNewDocumentInformation() {
        return excel.readStringArrays("CreateNewDocument");
    }

}
