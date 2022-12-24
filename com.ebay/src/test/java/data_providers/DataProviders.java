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

    @DataProvider(name = "testViewProduct")
    public Object[][] getProductInfo() {
        return excel.readStringArrays("ViewProduct");
    }

    @DataProvider(name = "testShopForDSLRCameras")
    public Object[][] getCameraDetails() {
        return excel.readStringArrays("ShopForDSLRs");
    }

}
