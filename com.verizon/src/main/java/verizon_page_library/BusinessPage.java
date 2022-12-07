package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class BusinessPage extends SharedStepsUI {

    @FindBy(id = "gnav20-language-selection-menu")
    public WebElement languageSelector;

    @FindBy(xpath = "//div[@id='localization']//ul[@class='gnav20-dropdown']//li/a")
    public List<WebElement> languages;

    @FindBy(id = "gnav20-eyebrow-link-Business")
    public WebElement businessPageLink;

    public  BusinessPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectLanguage(int itemIndex) {
        hoverOverElement(languageSelector);
        selectItem(itemIndex, languages);
    }

    public String getBusinessLinkText() {
        return getTrimmedElementText(businessPageLink);
    }

}
