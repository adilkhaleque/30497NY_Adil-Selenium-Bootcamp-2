package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CompareDevicesPage extends SharedStepsUI {

    @FindBy(xpath = "//h1[@class='margin12 onlyBottomMargin']")
    public WebElement comparePhonesAndDevicesHeading;

    public CompareDevicesPage() {
        PageFactory.initElements(driver, this);
    }

    public String getComparePhonesAndDevicesHeadingText() {
        return getTrimmedElementText(comparePhonesAndDevicesHeading);
    }

}
