package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class ElectronicsPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[@class='b-module b-visualnav']/div[@class='b-visualnav__grid']/a[2]")
    public WebElement camerasAndPhotoCategory;

    public ElectronicsPage() {
        PageFactory.initElements(driver, this);
    }

    public CamerasAndPhotoPage clickOnCamerasAndPhotoCategory() {
        safeClickOnElement(camerasAndPhotoCategory);

        return new CamerasAndPhotoPage();
    }
}
