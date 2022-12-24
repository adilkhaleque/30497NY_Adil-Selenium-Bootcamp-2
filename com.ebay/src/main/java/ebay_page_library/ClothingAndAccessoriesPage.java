package ebay_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class ClothingAndAccessoriesPage extends SharedStepsUI {

    public ClothingAndAccessoriesPage() {
        PageFactory.initElements(driver, this);
    }
}
