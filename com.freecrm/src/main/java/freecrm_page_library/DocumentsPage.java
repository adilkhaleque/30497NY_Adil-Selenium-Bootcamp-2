package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class DocumentsPage extends SharedStepsUI {

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'New Folder']")
    public WebElement newFolderButton;

    @FindBy(xpath = "//a[@href='/documents/new']")
    public WebElement createNewDocumentsButton;

    public DocumentsPage() {
        PageFactory.initElements(driver, this);
    }

    public CreateNewDocumentPage clickOnCreateNewDocumentsButton() {
        safeClickOnElement(createNewDocumentsButton);

        return new CreateNewDocumentPage();
    }
}
