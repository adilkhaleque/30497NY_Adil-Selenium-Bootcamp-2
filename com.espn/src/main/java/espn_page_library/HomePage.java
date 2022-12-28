package espn_page_library;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class HomePage extends SharedStepsUI {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
