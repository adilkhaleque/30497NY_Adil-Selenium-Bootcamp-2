package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CardGamesAndPokerCardsPage extends SharedStepsUI {

    @FindBy(xpath = "//h1[@class='b-pageheader']/span[@class='b-pageheader__text']")
    public WebElement cardGamesHeading;

    public CardGamesAndPokerCardsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getCardGamesHeadingText() {
        return getTrimmedElementText(cardGamesHeading);
    }

}
