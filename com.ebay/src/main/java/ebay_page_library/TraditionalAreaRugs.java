package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class TraditionalAreaRugs extends SharedStepsUI {

    @FindBy(xpath = "//h1[@class='b-pageheader']/span[text() = 'Traditional Area Rugs']")
    public WebElement traditionalAreaRugsHeading;

    public TraditionalAreaRugs() {
        PageFactory.initElements(driver, this);
    }

    public String getRugsText() {
        return getTrimmedElementText(traditionalAreaRugsHeading);
    }

}
