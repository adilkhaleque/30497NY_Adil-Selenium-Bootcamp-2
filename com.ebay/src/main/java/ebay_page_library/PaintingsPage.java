package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class PaintingsPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@class='carousel']/div//div/ul[@class='carousel__list']//li[@class='carousel__snap-point'][2]/a[@class='b-guidancecard__link']")
    public WebElement watercolorMedium;

    public PaintingsPage() {
        PageFactory.initElements(driver, this);
    }

    public WatercolorArtPaintingsPage clickOnWatercolorMedium() {
        safeClickOnElement(watercolorMedium);

        return new WatercolorArtPaintingsPage();
    }
}
