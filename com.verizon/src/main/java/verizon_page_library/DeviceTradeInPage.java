package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class DeviceTradeInPage extends SharedStepsUI {

    @FindBy(xpath = "//select[@aria-label='device selection Brand']")
    public WebElement brandDropdown;

    @FindBy(xpath = "//select[@aria-label='device selection Brand']//option")
    public List<WebElement> brands;

    @FindBy(xpath = "//div[@class='StyledDiv-sc-n9jxr1-0 brxmtV']//label")
    public List<WebElement> deviceTypes;

    @FindBy(xpath = "//div[@id='page']/div[3]/div/div[2]/div/div/div/div[5]/div[2]/div/div")
    public WebElement modelDropdown;

    @FindBy(xpath = "//div[@id='react-select-2-listbox']//div[@class=' css-11unzgr']//div")
    public List<WebElement> models;

    @FindBy(xpath = "//div[@role='radiogroup']//label")
    public List<WebElement> colors;

    @FindBy(xpath = "//*[@id='page']/div[3]/div/div[2]/div/div/div/div[7]/div/div[2]/div/span[4]/label")
    public WebElement gray;

    @FindBy(xpath = "//select[@label='Storage']")
    public WebElement storageDropdown;

    @FindBy(xpath = "//select[@label='Storage']//option")
    public List<WebElement> storageOptions;

    @FindBy(xpath = "//select[@label='Network']")
    public WebElement networkDropdown;

    @FindBy(xpath = "//select[@label='Network']//option")
    public List<WebElement> networks;

    @FindBy(xpath = "//button[@aria-label='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@value='GOOD_CONDITION']")
    public WebElement goodConditionOption;

    @FindBy(xpath = "//input[@value='DAMAGED_CONDITION']")
    public WebElement damagedConditionOption;

    @FindBy(xpath = "//div[@data-testid='tradein-header-container']//h1")
    public WebElement tradeInValueHeading;

    @FindBy(xpath = "//div[@data-testid='tradein-header-container']//h3")
    public WebElement tradeInDeviceHeading;

    public DeviceTradeInPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnDropdown(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnGray() {
        safeClickOnElement(gray);
    }

    public void clickOnContinueButton() {
        jsScrollElementIntoView(continueButton);
        safeClickOnElement(continueButton);
    }

    public void clickOnConditionOption(WebElement element) {
        safeClickOnElement(element);
    }

    public String getTradeInDeviceHeadingText() {
        return getTrimmedElementText(tradeInDeviceHeading).substring(0, 30);
    }




}
