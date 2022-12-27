package system.shop;

import base.BasePage;
import data_providers.DataProviders;
import ebay_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShopping extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForDSLRCameras")
    public void testShopForDSLRs(String brand, String price, String text) {

        HomePage homePage = new HomePage();
        ElectronicsPage electronicsPage = homePage.clickOnElectronicsTab();
        CamerasAndPhotoPage camerasAndPhotoPage = electronicsPage.clickOnCamerasAndPhotoCategory();
        DSLRCamerasPage dslrCamerasPage = camerasAndPhotoPage.clickOnDSLRCameras();
        jsScrollUntilElementIsVisible(dslrCamerasPage.brandDropdown);
        dslrCamerasPage.clickOnBrandDropdown();
        selectOption(dslrCamerasPage.brands, Integer.parseInt(brand));
        dslrCamerasPage.clickOnPriceDropdown();
        selectOption(dslrCamerasPage.prices, Integer.parseInt(price));

        Assert.assertEquals(dslrCamerasPage.getDSLRCamerasHeaderText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForCarsAndTrucks")
    public void testShopForCars(String motorsIndex, String make, String model, String text) {

        HomePage homePage = new HomePage();
        CarsAndTrucksPage carsAndTrucksPage = homePage.selectMotorsCategory(homePage.motorsCategories, Integer.parseInt(motorsIndex));
        carsAndTrucksPage.clickOnAllMakesDropdown();
        selectFromDropdownByValue(carsAndTrucksPage.allMakesDropdown, make);
        carsAndTrucksPage.clickOnAllModelsDropdown();
        selectFromDropdownByValue(carsAndTrucksPage.allModelsDropdown, model);
        SearchResultsPage searchResultsPage = carsAndTrucksPage.clickOnFindAVehicleButton();

        Assert.assertEquals(searchResultsPage.getResultsText(), text);
    }
}
