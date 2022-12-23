package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class HomePage extends SharedStepsUI {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

}
