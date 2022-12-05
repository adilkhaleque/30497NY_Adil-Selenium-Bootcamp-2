package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testGoogle5GPhones")
    public Object[][] getGoogleFilterText() {
        return excel.readStringArrays("Google5GPhones");
    }

    @DataProvider(name = "testSamsung5GPhones")
    public Object[][] getSamsungFilterText() {
        return excel.readStringArrays("Samsung5GPhones");
    }

    @DataProvider(name = "testPhoneOfChoice")
    public Object[][] getPhoneText() {
        return excel.readStringArrays("PhoneOfChoice");
    }

    @DataProvider(name = "testAddingToCart")
    public Object[][] getItemDetails() {
        return excel.readStringArrays("Smartwatches");
    }

    @DataProvider(name = "testTradeInDevice")
    public Object[][] getTradeInInfo() {
        return excel.readStringArrays("TradeInDevice");
    }


}
