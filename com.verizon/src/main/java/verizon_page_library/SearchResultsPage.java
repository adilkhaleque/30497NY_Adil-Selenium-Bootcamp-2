package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@id='renderSelectedFiltersLeftRail']/div/div/p/span")
    public WebElement googleFilterText;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getGoogleFilterText() {
        return getTrimmedElementText(googleFilterText);
    }
}
