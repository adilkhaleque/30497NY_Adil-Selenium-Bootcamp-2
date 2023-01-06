package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class StoresPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@class='Accordion']//div[@class='Accordion-group'][3]//button")
    public WebElement deviceSetupDropdown;

    @FindBy(xpath = "//div[@id='accordionOnePanel']//a[contains(text(), 'Trade in your device')]")
    public WebElement tradeInYourDeviceLink;

    public StoresPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnDeviceSetupDropdown() {
        safeClickOnElement(deviceSetupDropdown);

    }

    public TradeInPage clickOnTradeInYourDevice() {
        safeClickOnElement(tradeInYourDeviceLink);

        return new TradeInPage();
    }

    public TradeInPage navigateToTradeInPage() {
        jsScrollElementIntoView(deviceSetupDropdown);
        clickOnDeviceSetupDropdown();
        clickOnTradeInYourDevice();

        return new TradeInPage();
    }


}
