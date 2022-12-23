package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy(xpath = "//h1[contains(text(), 'results for')]")
    public WebElement resultsText;

    @FindBy(xpath = "//h1//span[@class='BOLD'][2]")
    public WebElement searchResultText;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getResultsText() {
        return getTrimmedElementText(searchResultText);
    }
}
