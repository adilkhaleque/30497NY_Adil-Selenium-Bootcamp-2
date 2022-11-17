package espn_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

public class SportsLeaguePage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='global-nav-secondary']/div/ul/li[7]/a")
    public WebElement nbaTeamsButton;

    @FindBy(xpath = "//*[@id='fittPageContainer']/div[3]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div/section/div/a")
    public WebElement lakersLink;

    @FindBy(xpath = "//h2[contains(text(), 'Los Angeles Lakers')]")
    public WebElement lakersTitle;

    @FindBy(xpath = "//*[@id='fittPageContainer']/div[3]/div/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div/section/div/a/h2")
    public WebElement yankeesTitle;

    @FindBy(xpath = "//*[@id='global-nav-secondary']/div/ul/li[10]/a")
    public WebElement mlbTeamsButton;

    @FindBy(xpath = "//*[@id='global-nav-secondary']/div/ul/li[8]/a")
    public WebElement f1DriverButton;

    @FindBy (xpath = "//tbody//tr[10]//a[@href]")
    public WebElement lewisHamiltonLink;

    @FindBy (xpath = "//*[@id='global-nav-secondary']/div/ul/li[5]/a")
    public WebElement fixturesButton;

    @FindBy (xpath = "//div[@data-id='20221122']/a")
    public WebElement specificWorldCupDate;

    @FindBy (xpath = "//*[@id='schedule-page']/div/header/h1")
    public WebElement dateHeading;

    @FindBy (xpath = "//ul[@class='first-group']//li[6]/a[@href]")
    public WebElement wweTitleHistoryTab;

    @FindBy (xpath = "//*[@id='article-feed']/article/div/div[2]/h3[1]/a")
    public WebElement wweUniversalChampionshipHistoryArticleLink;

    @FindBy(xpath = "//section[@id='article-feed']/article[1]/div/header/h1")
    public WebElement articleTitle;

    @FindBy (xpath = "//*[@id='article-feed']/article[1]/div/div[2]/aside/table/tbody/tr[1]/td[1]/strong/a")
    public WebElement romanReignsLink;

    @FindBy (xpath = "//*[@id='global-nav-secondary']/div/ul/li[5]/a")
    public WebElement p4pTab;

    @FindBy (xpath = "//*[@id='article-feed']/article[1]/div/div[2]/p[8]/strong")
    public WebElement fighterRecord;

    @FindBy (xpath = "//div[@class='DatePicker']//button[@aria-label='Calendar']")
    public WebElement calendarIcon;

    @FindBy (xpath = "//div[@class='DatePicker__MonthContainer calendar--embedded']//ul[1]//li[@data-idx='6']")
    public WebElement specificDayForNhlScores;

    @FindBy (xpath = "//header[@aria-label='Saturday, November 5, 2022']//h3")
    public WebElement nhlScoresDateHeading;

    public SportsLeaguePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnNbaTeams() {
        safeClickOnElement(nbaTeamsButton);
    }

    public TeamPage clickOnLakersLink() {
        safeClickOnElement(lakersLink);

        return new TeamPage();
    }

    public String getLakersText() {
        return getTrimmedElementText(lakersTitle);
    }

    public void clickOnMlbTeams() {
        safeClickOnElement(mlbTeamsButton);
    }

    public String getYankeesText() {
        jsScrollUntilElementIsVisible(yankeesTitle);
        return getTrimmedElementText(yankeesTitle);
    }

    public TeamPage navigateToLakersPage() {
        clickOnNbaTeams();
        clickOnLakersLink();

        return new TeamPage();
    }

    public void clickOnDriversButton() {
        safeClickOnElement(f1DriverButton);
    }

    public void clickOnFixturesButton() {
        safeClickOnElement(fixturesButton);
    }

    public void clickOnWorldCupDate() {
        safeClickOnElement(specificWorldCupDate);
    }

    public String getWorldCupDateHeadingText() {
        return getTrimmedElementText(dateHeading);
    }

    public void clickOnWweTitleHistory() {
        safeClickOnElement(wweTitleHistoryTab);
    }

    public void clickOnWweUniversalChampionshipHistoryArticle() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(wweUniversalChampionshipHistoryArticleLink));
        safeClickOnElement(wweUniversalChampionshipHistoryArticleLink);
    }

    public String getRomanReignsText() {
//        webDriverWait.until(ExpectedConditions.titleIs(articleTitle.getText()));
//        jsScrollUntilElementIsVisible(romanReignsLink);
        return getTrimmedElementText(romanReignsLink);
    }

    public void clickP4pTab() {
        safeClickOnElement(p4pTab);
    }

    public void clickOnCalendar() {
        safeClickOnElement(calendarIcon);
    }

    public void clickOnDayForNhlScores() {
        safeClickOnElement(specificDayForNhlScores);
    }

    public String getNhlScoresDateHeadingText() {
        return getTrimmedElementText(nhlScoresDateHeading);
    }

    public String getFighterRecordText() {
        //jsScrollUntilElementIsVisible(fighterRecord);
        return getTrimmedElementText(fighterRecord);
    }

    public AthletePage clickOnLewisHamilton() {
        clickOnDriversButton();
        jsScrollUntilElementIsVisible(lewisHamiltonLink);
        safeClickOnElement(lewisHamiltonLink);

        return new AthletePage();
    }

    public void goToWorldCupFixtures() {
        clickOnFixturesButton();
        clickOnWorldCupDate();
        webDriverWait.until(ExpectedConditions.visibilityOf(dateHeading));
    }

    public void getNhlScores() {
        clickOnCalendar();
        clickOnDayForNhlScores();
    }
}
