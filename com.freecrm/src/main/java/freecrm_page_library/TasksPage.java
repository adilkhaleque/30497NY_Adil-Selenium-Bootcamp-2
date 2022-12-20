package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class TasksPage extends SharedStepsUI {

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Show Filters']")
    public WebElement showFiltersButton;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Export']")
    public WebElement exportButton;

    @FindBy(xpath = "//a[@href='/deals/new']")
    public WebElement createNewDealsButton;

    public TasksPage() {
        PageFactory.initElements(driver, this);
    }
}
