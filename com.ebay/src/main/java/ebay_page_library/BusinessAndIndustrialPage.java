package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class BusinessAndIndustrialPage extends SharedStepsUI {

    public BusinessAndIndustrialPage() {
        PageFactory.initElements(driver, this);
    }
}
