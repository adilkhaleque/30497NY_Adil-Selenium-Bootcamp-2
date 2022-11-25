package system.trade_in_device;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.DeviceTradeInPage;
import verizon_page_library.HomePage;
import verizon_page_library.StoresPage;
import verizon_page_library.TradeInPage;

public class TestTradeInDevice extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testTradeInDevice")
    public void testTradeInDevice(String deviceType, String brand, String model, String color, String storage, String network, String text) {
        HomePage homePage = new HomePage();
        StoresPage storesPage = homePage.systemBar.clickOnStoresButton();

        TradeInPage tradeInPage = storesPage.navigateToTradeInPage();
        DeviceTradeInPage deviceTradeInPage = tradeInPage.navigateToDeviceTradeInPage();

        deviceTradeInPage.selectItem(Integer.parseInt(deviceType), deviceTradeInPage.deviceTypes);

        deviceTradeInPage.clickOnDropdown(deviceTradeInPage.brandDropdown);
        deviceTradeInPage.selectItem(Integer.parseInt(brand), deviceTradeInPage.brands);

        deviceTradeInPage.clickOnDropdown(deviceTradeInPage.modelDropdown);
        deviceTradeInPage.selectItem(Integer.parseInt(model), deviceTradeInPage.models);

        deviceTradeInPage.selectItem(Integer.parseInt(color), deviceTradeInPage.colors);

        deviceTradeInPage.clickOnDropdown(deviceTradeInPage.storageDropdown);
        deviceTradeInPage.selectItem(Integer.parseInt(storage), deviceTradeInPage.storageOptions);

        deviceTradeInPage.clickOnDropdown(deviceTradeInPage.networkDropdown);
        deviceTradeInPage.selectItem(Integer.parseInt(network), deviceTradeInPage.networks);

        deviceTradeInPage.clickOnContinueButton();
        deviceTradeInPage.clickOnConditionOption(deviceTradeInPage.goodConditionOption);
        deviceTradeInPage.clickOnContinueButton();

        Assert.assertEquals(deviceTradeInPage.getTradeInDeviceHeadingText(), text);
    }

}
