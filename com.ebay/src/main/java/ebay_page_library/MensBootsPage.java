package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class MensBootsPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[1]/a")
    public WebElement timberlandBrand;

    public MensBootsPage() {
        PageFactory.initElements(driver, this);
    }

    public TimberlandMensBootsPage clickOnTimberlandBrand() {
        safeClickOnElement(timberlandBrand);

        return new TimberlandMensBootsPage();
    }

}
