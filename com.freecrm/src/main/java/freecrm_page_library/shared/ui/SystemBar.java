package freecrm_page_library.shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//div[@id='top-header-menu']//div[@class='right menu']//div[@class='ui inverted transparent left icon input']/input")
    public WebElement searchInput;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }
}
