package espn_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy(xpath = "//ul[@class='player__Results']//a[@href]")
    public WebElement islamMakhachevLink;

    @FindBy (xpath = "//li[@class='player__Results__Item']//a[@href]")
    public WebElement lebronJamesLink;

    @FindBy (className = "SearchBar__Input")
    public WebElement searchInputBar;

    @FindBy(xpath = "//*[@id='fittPageContainer']/div[2]/div/div/div[1]/form/button")
    public WebElement searchButton;

    public SearchResultsPage() {
        PageFactory.initElements(driver,this);
    }

    public void inputAthleteName(String searchTerm) {
        clearSendKeysToElement(searchInputBar, searchTerm);
    }

    public void doSearchAgain(String searchTerm) {
        inputAthleteName(searchTerm);
    }

    public AthletePage clickOnIslamMakhachev() {
        safeClickOnElement(islamMakhachevLink);

        return new AthletePage();
    }

    public AthletePage clickOnLebronJames() {
        safeClickOnElement(lebronJamesLink);

        return new AthletePage();
    }

}
