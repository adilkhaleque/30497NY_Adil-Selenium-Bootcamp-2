package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class SportingGoodsPage extends SharedStepsUI {

    public SportingGoodsPage() {
        PageFactory.initElements(driver, this);
    }
}
