package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class MotorsPage extends SharedStepsUI {

    public MotorsPage() {
        PageFactory.initElements(driver, this);
    }
}
