package system.choose_smartphone;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.HomePage;
import verizon_page_library.SearchResultsPage;

public class TestChooseSmartphone extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testPhoneOfChoice")
    public void testChooseSmartphone(String expectedText) {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.navigateToSmartphonesResults();
        searchResultsPage.chooseSmartphone();

        Assert.assertEquals(searchResultsPage.getPhoneOfChoiceText(), expectedText);
    }
}
