package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class HuntingGearPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[1]")
    public WebElement opticsLink;

    public HuntingGearPage() {
        PageFactory.initElements(driver, this);
    }

    public OpticsPage clickOnOpticsLink() {
        safeClickOnElement(opticsLink);

        return new OpticsPage();
    }
}
