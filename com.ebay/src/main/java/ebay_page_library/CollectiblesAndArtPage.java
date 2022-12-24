package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CollectiblesAndArtPage extends SharedStepsUI {

    public CollectiblesAndArtPage() {
        PageFactory.initElements(driver, this);
    }
}
