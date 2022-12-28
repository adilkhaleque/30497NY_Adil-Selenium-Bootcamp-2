package system.write_a_review;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.HomePage;
import verizon_page_library.ItemPage;
import verizon_page_library.SearchResultsPage;

public class TestWriteAReview extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testWriteAReview")
    public void testWriteAReview(String title, String body, String nickname, String email, String text) throws InterruptedException {

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.navigateToSmartphonesResults();

        searchResultsPage.clickOnAppleSmartphonesButton();
        ItemPage itemPage = searchResultsPage.clickOnIphone();

        itemPage.postReview(title, body, nickname, email);

        Assert.assertEquals(itemPage.getPostReviewText(), text);
    }

}
