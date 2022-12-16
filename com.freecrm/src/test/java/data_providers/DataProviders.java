package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "AuthenticationDP")
    public Object[][] getLoginDetails() {
        return excel.readStringArrays("Authentication");
    }
}
