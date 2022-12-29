package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class HomeAndGardenPage extends SharedStepsUI {

    public HomeAndGardenPage() {
        PageFactory.initElements(driver, this);
    }
}
