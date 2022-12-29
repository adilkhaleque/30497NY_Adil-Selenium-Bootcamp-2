package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class AreaRugsPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[2]/div[2]/a[1]")
    public WebElement traditionalStyle;

    public AreaRugsPage() {
        PageFactory.initElements(driver, this);
    }

    public TraditionalAreaRugs clickOnTraditionalStyle() {
        jsScrollUntilElementIsVisible(traditionalStyle);
        safeClickOnElement(traditionalStyle);

        return new TraditionalAreaRugs();
    }
}
