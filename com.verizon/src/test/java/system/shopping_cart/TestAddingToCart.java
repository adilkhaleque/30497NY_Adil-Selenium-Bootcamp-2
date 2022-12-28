package system.shopping_cart;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.CartPage;
import verizon_page_library.HomePage;
import verizon_page_library.ItemPage;
import verizon_page_library.SearchResultsPage;

public class TestAddingToCart extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testAddingToCart")
    public void testAddToCart(String searchTerm, String brand, String color, String product, String zip, String text) {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm);

        searchResultsPage.clickOnBrandDropdown();
        searchResultsPage.selectSpecificBrand(Integer.parseInt(brand));
        searchResultsPage.clickOnFilterButton();
        searchResultsPage.clickOnColorDropdown();
        searchResultsPage.selectSpecificColor(Integer.parseInt(color));
        searchResultsPage.clickOnFilterButton();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='layout_container']//div[@class='newGridTileStyled__InnerDiv-bsQFXG eybXYa']//h2/a[@href]")));
        ItemPage itemPage = searchResultsPage.selectProduct(Integer.parseInt(product));

        itemPage.clickOnContinueButton();
        itemPage.clickOnNewCustomer();
        CartPage cartPage = itemPage.confirmLocation(zip);

        cartPage.clickOnContinue();

        Assert.assertEquals(cartPage.getAddedToCartText(), text);


    }
}
