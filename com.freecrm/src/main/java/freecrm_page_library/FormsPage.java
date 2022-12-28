package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class FormsPage extends SharedStepsUI {

    @FindBy(xpath = "//a[@href='/forms/new']")
    public WebElement createNewFormsButton;

    public FormsPage() {
        PageFactory.initElements(driver, this);
    }

    public CreateNewFormPage clickOnCreateNewFormsButton() {
        safeClickOnElement(createNewFormsButton);

        return new CreateNewFormPage();
    }
}
