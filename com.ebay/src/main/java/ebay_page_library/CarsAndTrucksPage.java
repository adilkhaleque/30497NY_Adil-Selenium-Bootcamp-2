package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CarsAndTrucksPage extends SharedStepsUI {

    @FindBy(name = "Make")
    public WebElement allMakesDropdown;

    @FindBy(name = "Model")
    public WebElement allModelsDropdown;

    @FindBy(name = "LH_ItemCondition")
    public WebElement conditionDropdown;

    @FindBy(xpath = "//button[text() = 'Find Vehicle']")
    public WebElement findAVehicleButton;

    public CarsAndTrucksPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAllMakesDropdown() {
        safeClickOnElement(allMakesDropdown);
    }

    public void clickOnAllModelsDropdown() {
        safeClickOnElement(allModelsDropdown);
    }

    public void clickOnConditionDropdown() {
        safeClickOnElement(conditionDropdown);
    }

    public SearchResultsPage clickOnFindAVehicleButton() {
        safeClickOnElement(findAVehicleButton);

        return new SearchResultsPage();
    }
}
