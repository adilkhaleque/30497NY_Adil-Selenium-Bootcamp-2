package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CampaignsPage extends SharedStepsUI {

    @FindBy(xpath = "//a[@href='/campaigns/new']")
    public WebElement createNewCampaignsButton;

    public CampaignsPage() {
        PageFactory.initElements(driver, this);
    }

    public CreateNewCampaignPage clickOnCreateNewCampaignsButton() {
        safeClickOnElement(createNewCampaignsButton);

        return new CreateNewCampaignPage();
    }
}
