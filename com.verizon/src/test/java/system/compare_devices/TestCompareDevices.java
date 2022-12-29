package system.compare_devices;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.CompareDevicesPage;
import verizon_page_library.HomePage;
import verizon_page_library.SearchResultsPage;

public class TestCompareDevices extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCompareHotspots")
    public void testCompareHotspots(String index, String index2, String index3, String index4, String text) {

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.navigateToJetpacksAndHotspots();

        selectItem(Integer.parseInt(index), searchResultsPage.compareHotspotsCheckboxes);
        selectItem(Integer.parseInt(index2), searchResultsPage.compareHotspotsCheckboxes);
        selectItem(Integer.parseInt(index3), searchResultsPage.compareHotspotsCheckboxes);
        selectItem(Integer.parseInt(index4), searchResultsPage.compareHotspotsCheckboxes);

        CompareDevicesPage compareDevicesPage = searchResultsPage.clickOnCompareButton();

        Assert.assertEquals(compareDevicesPage.getComparePhonesAndDevicesHeadingText(), text);
    }

}
