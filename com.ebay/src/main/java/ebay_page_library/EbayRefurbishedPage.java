package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class EbayRefurbishedPage extends SharedStepsUI {

    public EbayRefurbishedPage() {
        PageFactory.initElements(driver, this);
    }
}
