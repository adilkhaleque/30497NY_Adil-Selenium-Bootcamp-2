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

    @DataProvider(name = "testShopForCarsAndTrucks")
    public Object[][] getCarDetails() {
        return excel.readStringArrays("ShopForChargers");
    }

    @DataProvider(name = "testShopForArtPaintings")
    public Object[][] getPaintingType() {
        return excel.readStringArrays("ShopForPaintings");
    }

    @DataProvider(name = "testShopForRugs")
    public Object[][] getRugType() {
        return excel.readStringArrays("ShopForRugs");
    }

    @DataProvider(name = "testShopForBoots")
    public Object[][] getBootsType() {
        return excel.readStringArrays("ShopForBoots");
    }

    @DataProvider(name = "testShopForCardGames")
    public Object[][] getGamesType() {
        return excel.readStringArrays("ShopForCardGames");
    }

    @DataProvider(name = "testShopForOptics")
    public Object[][] getGearType() {
        return excel.readStringArrays("ShopForOptics");
    }

}
