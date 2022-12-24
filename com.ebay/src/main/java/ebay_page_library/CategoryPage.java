package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class CategoryPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[@class='b-module b-visualnav']/div[@class='b-visualnav__grid']//a[1]")
    public WebElement dSLRCamerasLink;

    @FindBy(xpath = "//ul[@class='brm__list']//li[@class='brm__item'][3]/div/button")
    public WebElement brandDropdown;

    @FindBy(xpath = "//ul[@class='brm__list']//li[@class='brm__item'][3]//div/ul[@class='brm__aspect-list']/li[@class='brm__aspect-item']")
    public List<WebElement> brands;

    @FindBy(xpath = "//ul[@class='brm__list']//li[@class='brm__item'][7]/div/button")
    public WebElement priceDropdown;

    @FindBy(xpath = "//ul[@class='brm__list']//li[@class='brm__item'][7]//div/ul[@class='brm__aspect-list']/li[@class='brm__aspect-item']")
    public List<WebElement> prices;

    @FindBy(xpath = "//div[@class='pagecontainer__top']//h1[@class='b-pageheader']/span")
    public WebElement dSLRCamerasHeader;

    public CategoryPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnDSLRCameras() {
        safeClickOnElement(dSLRCamerasLink);
    }

    public void clickOnBrandDropdown() {
        safeClickOnElement(brandDropdown);
    }

    public void clickOnPriceDropdown() {
        safeClickOnElement(priceDropdown);
    }

    public String getDSLRCamerasHeaderText() {
        return getTrimmedElementText(dSLRCamerasHeader);
    }

}
