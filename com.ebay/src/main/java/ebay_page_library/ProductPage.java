package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class ProductPage extends SharedStepsUI {

    @FindBy(xpath = "//div[@class='d-item-condition-value']//div[@class='ux-icon-text__text']//span[@class='ux-textspans']")
    public WebElement conditionText;

    @FindBy(xpath = "//div[@class='vim x-about-this-item']//div[@data-testid='ux-layout-section']//div[@class='ux-layout-section__row'][1]//div[@class='ux-labels-values__values'][2]//span[@class='ux-textspans']")
    public WebElement productNameText;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public String getConditionText() {
        return getTrimmedElementText(conditionText);
    }

    public String getProductNameText() {
        return getTrimmedElementText(productNameText);
    }
}
