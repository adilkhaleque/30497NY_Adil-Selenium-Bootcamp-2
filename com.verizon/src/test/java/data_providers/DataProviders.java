package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testGoogle5GPhones")
    public Object[][] getFilterText() {
        return excel.readStringArrays("Google5GPhones");
    }
}
