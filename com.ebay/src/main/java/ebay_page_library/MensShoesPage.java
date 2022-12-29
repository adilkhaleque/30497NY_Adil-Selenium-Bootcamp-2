package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class MensShoesPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[2]/div[2]/a[2]")
    public WebElement bootsCategory;

    public MensShoesPage() {
        PageFactory.initElements(driver, this);
    }

    public MensBootsPage clickOnBootsCategory() {
        safeClickOnElement(bootsCategory);

        return new MensBootsPage();
    }
}
