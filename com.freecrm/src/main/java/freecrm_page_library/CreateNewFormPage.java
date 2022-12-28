package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewFormPage extends SharedStepsUI {

    @FindBy(name = "name")
    public WebElement nameField;

    @FindBy(name = "intro")
    public WebElement introductionTextField;

    @FindBy(name = "outro")
    public WebElement completionTextField;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='custom-view-container']//div[@class='ui form segment']//div[@class='field']//span/p")
    public WebElement formTitleText;

    @FindBy(name = "selectedElementType")
    public WebElement elementsDropdown;

    @FindBy(xpath = "//div[@name='selectedElementType']//div[@role='option' and @class='item']")
    public List<WebElement> elements;

    @FindBy(xpath = "//button[@class='ui primary button' and text() ='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//button[@class='ui primary button' and text() ='Submit']")
    public WebElement submitButton;

    public CreateNewFormPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public void fillOutNewFormsForm(String name, String intro, String completion) {

        inputText(nameField, name);
        inputText(introductionTextField, intro);
        inputText(completionTextField, completion);
    }

}
