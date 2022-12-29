package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class HomeDecorPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@id='mainContent']//section[@class='b-module b-visualnav'][1]//div[@class='b-visualnav__grid']//a[1]")
    public WebElement rugsCategory;

    public HomeDecorPage() {
        PageFactory.initElements(driver, this);
    }

    public RugsAndCarpetsPage clickOnRugsCategory() {
        safeClickOnElement(rugsCategory);

        return new RugsAndCarpetsPage();
    }

}
