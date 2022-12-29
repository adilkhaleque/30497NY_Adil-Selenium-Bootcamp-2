package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class TimberlandMensBootsPage extends SharedStepsUI {

    @FindBy(xpath = "//h1[@class='b-pageheader']/span[@class='b-pageheader__text']")
    public WebElement timberlandMensBootsHeading;

    public TimberlandMensBootsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getTimberlandMensBootsHeadingText() {
        return getTrimmedElementText(timberlandMensBootsHeading);
    }
}
