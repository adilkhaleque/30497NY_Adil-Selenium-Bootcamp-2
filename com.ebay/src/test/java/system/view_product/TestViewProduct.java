package system.view_product;

import base.BasePage;
import ebay_page_library.HomePage;
import ebay_page_library.ProductPage;
import ebay_page_library.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestViewProduct extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewProduct")
    public void testViewProduct(String searchTerm, String categoryValue, String newIndex, String openBoxIndex, String productIndex, String expectedText) {

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm, homePage.systemBar.categoryDropdown, categoryValue);
        searchResultsPage.clickOnBuyItNowTab();
        searchResultsPage.clickOnConditionDropdown();
        selectOption(searchResultsPage.conditions, Integer.parseInt(newIndex));
        searchResultsPage.clickOnConditionDropdown();
        selectOption(searchResultsPage.conditions, Integer.parseInt(openBoxIndex));
        ProductPage productPage = searchResultsPage.selectProduct(searchResultsPage.products, Integer.parseInt(productIndex));
        switchToTab();
        switchToTab();
        switchToTab();
        jsScrollElementIntoView(productPage.productNameText);

        Assert.assertEquals(productPage.getProductNameText(), expectedText);
    }
}
