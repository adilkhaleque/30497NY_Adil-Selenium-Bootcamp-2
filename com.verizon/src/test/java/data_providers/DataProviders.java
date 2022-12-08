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

    @DataProvider(name = "testAppleTablets")
    public Object[][] getAppleTabletsHeadingText() {
        return excel.readStringArrays("AppleTablets");
    }

    @DataProvider(name = "testViewNewestSmartwatches")
    public Object[][] getNewestText() {
        return excel.readStringArrays("NewestWatches");
    }

    @DataProvider(name = "testCompareHotspots")
    public Object[][] getCompareText() {
        return excel.readStringArrays("CompareHotspots");
    }

    @DataProvider(name = "testViewSteelSeriesHeadset")
    public Object[][] getSteelSeriesText() {
        return excel.readStringArrays("SteelSeriesHeadset");
    }

    @DataProvider(name = "testWriteAReview")
    public  Object[][] getReviewDetails() {
        return excel.readStringArrays("WriteAReview");
    }

    @DataProvider(name = "testFrench")
    public Object[][] getFranceText() {
        return excel.readStringArrays("Language");
    }

    @DataProvider(name = "testFindALocation")
    public Object[][] getLocationInfo() {
        return excel.readStringArrays("StoreLocation");
    }

}
