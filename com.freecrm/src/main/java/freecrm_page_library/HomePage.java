package freecrm_page_library;

import freecrm_page_library.shared.SharedStepsUI;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SharedStepsUI {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

}
