package system.shop;

import base.BasePage;
import ebay_page_library.CategoryPage;
import ebay_page_library.ElectronicsPage;
import ebay_page_library.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShopping extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForDSLRCameras")
    public void testShopForDSLRs(String brand, String price, String text) {

        HomePage homePage = new HomePage();
        ElectronicsPage electronicsPage = homePage.clickOnElectronicsTab();
        CategoryPage categoryPage = electronicsPage.clickOnCamerasAndPhotoCategory();
        categoryPage.clickOnDSLRCameras();
        jsScrollUntilElementIsVisible(categoryPage.brandDropdown);
        categoryPage.clickOnBrandDropdown();
        selectOption(categoryPage.brands, Integer.parseInt(brand));
        categoryPage.clickOnPriceDropdown();
        selectOption(categoryPage.prices, Integer.parseInt(price));

        Assert.assertEquals(categoryPage.getDSLRCamerasHeaderText(), text);
    }
}
