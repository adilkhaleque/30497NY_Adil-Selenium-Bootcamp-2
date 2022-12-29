package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class CamerasAndPhotoPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[@class='b-module b-visualnav']/div[@class='b-visualnav__grid']//a[1]")
    public WebElement dSLRCamerasLink;


    public CamerasAndPhotoPage() {
        PageFactory.initElements(driver, this);
    }

    public DSLRCamerasPage clickOnDSLRCameras() {
        safeClickOnElement(dSLRCamerasLink);

        return new DSLRCamerasPage();
    }


}
