package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testSignIn")
    public Object[][] getSignInInfo() {
        return excel.readStringArrays("Authentication");
    }

    @DataProvider(name = "testSearchFunctionality")
    public Object[][] getSearchInfo() {
        return excel.readStringArrays("Search");
    }
}
