package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class TradeInPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@class='u-textCenter']//button[text() = 'Get started']")
    public WebElement getStartedButton;

    @FindBy(id = "lines-new-customer")
    public WebElement newCustomerButton;

    public TradeInPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnGetStarted() {
        safeClickOnElement(getStartedButton);
    }

    public DeviceTradeInPage clickOnNewCustomer() {
        safeClickOnElement(newCustomerButton);

        return new DeviceTradeInPage();
    }

    public DeviceTradeInPage navigateToDeviceTradeInPage() {
        clickOnGetStarted();
        clickOnNewCustomer();

        return new DeviceTradeInPage();
    }


}
