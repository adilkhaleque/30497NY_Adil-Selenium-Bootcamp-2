package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class GamesPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[2]")
    public WebElement cardGamesLink;

    public GamesPage() {
        PageFactory.initElements(driver, this);
    }

    public CardGamesAndPokerCardsPage clickOnCardGamesLink() {
        safeClickOnElement(cardGamesLink);

        return new CardGamesAndPokerCardsPage();
    }

}
