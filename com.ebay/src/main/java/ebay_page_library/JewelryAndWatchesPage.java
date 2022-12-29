package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class JewelryAndWatchesPage extends SharedStepsUI {

    public JewelryAndWatchesPage() {
        PageFactory.initElements(driver, this);
    }
}
