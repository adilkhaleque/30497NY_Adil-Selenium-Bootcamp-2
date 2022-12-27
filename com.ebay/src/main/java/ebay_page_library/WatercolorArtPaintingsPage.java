package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class WatercolorArtPaintingsPage extends SharedStepsUI {

    @FindBy(xpath = "//h1[@class='b-pageheader']/span[text() = 'Watercolor Art Paintings']")
    public WebElement watercolorArtPaintingsHeading;

    public WatercolorArtPaintingsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getWatercolorArtPaintingsHeadingText() {
        return getTrimmedElementText(watercolorArtPaintingsHeading);
    }

}
