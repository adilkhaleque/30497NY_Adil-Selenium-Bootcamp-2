package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class CreateNewCampaignPage extends SharedStepsUI {

    @FindBy(name = "name")
    public WebElement nameField;

    @FindBy(name = "transport_type")
    public WebElement transportTypeDropdown;

    @FindBy(xpath = "//div[@name='transport_type']//div[@role='option']")
    public List<WebElement> transportTypeOptions;

    @FindBy(name = "transport_id")
    public WebElement transportAccountDropdown;

    @FindBy(xpath = "//div[@class='field checkbox-field']//div[@class='ui checkbox']/input")
    public WebElement activeCheckbox;

    @FindBy(xpath = "//div[@id='dashboard-toolbar']//div[@class='ui header item mb5 light-black']")
    public WebElement campaignNameText;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Save']")
    public WebElement saveButton;

    public CreateNewCampaignPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnActiveCheckbox() {
        safeClickOnElement(activeCheckbox);
    }

    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public String getCampaignNameText() {
        return getTrimmedElementText(campaignNameText);
    }

    public void fillOutNewCampaign(String name, int transportTypeIndex) {

        inputText(nameField, name);
        safeClickOnElement(transportTypeDropdown);
        selectOption(transportTypeOptions, transportTypeIndex);
        clickOnActiveCheckbox();
    }

    public void createNewCampaign(String name, int transportTypeIndex) throws InterruptedException {
        fillOutNewCampaign(name, transportTypeIndex);
        clickOnSaveButton();
        Thread.sleep(2000);
    }
}
