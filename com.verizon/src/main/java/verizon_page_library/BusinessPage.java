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

    @FindBy(className = "gnav20-sign-in")
    public WebElement businessStoresButton;

    @FindBy(xpath = "//ul[@class='gnav20-dropdown']//li[@class='gnav20-dropdown-list']/a[contains(text(), 'Find a Verizon Store')]")
    public WebElement findAVerizonStoreButton;

    @FindBy(id = "gnav20-Contact-Us-L1")
    public WebElement contactUsButton;

    @FindBy(id = "gnav20-Contact-Us-L2-2")
    public WebElement contactSalesButton;

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

    public StoreLocatorPage findStores() {
        hoverOverElement(businessStoresButton);
        safeClickOnElement(findAVerizonStoreButton);

        return new StoreLocatorPage();
    }

    public ContactSalesPage navigateToContactSalesPage() {
        hoverOverElement(contactUsButton);
        safeClickOnElement(contactSalesButton);

        return new ContactSalesPage();
    }

}
