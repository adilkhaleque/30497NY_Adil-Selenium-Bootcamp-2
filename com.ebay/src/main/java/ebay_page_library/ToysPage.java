package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class ToysPage extends SharedStepsUI {

    public ToysPage() {
        PageFactory.initElements(driver, this);
    }
}
