package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class RugsAndCarpetsPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[1]")
    public WebElement areaRugsCategory;

    public RugsAndCarpetsPage() {
        PageFactory.initElements(driver, this);
    }

    public AreaRugsPage clickOnAreaRugsCategory() {
        safeClickOnElement(areaRugsCategory);

        return new AreaRugsPage();
    }
}
