package shared.ui;

import base.BasePage;
import espn_page_library.SearchResultsPage;
import espn_page_library.SportsLeaguePage;
import espn_page_library.TeamPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//li[@class='sports menu-nhl']/a[@href]")
    public WebElement nhlButton;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[3]/div/ul[1]/li[2]/a")
    public WebElement nhlScoresButton;

    @FindBy (xpath = "//li[@class='sports menu-nba']/a[@href]")
    public WebElement nbaButton;

//    @FindBy (xpath = "//li[@class='teams nba']//ul[5]//li[@class='team']//span[@class='link-text']")
//    public List<WebElement> pacificTeams;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[4]/div/ul[2]/li/div/ul[5]/li[4]/a")
    public WebElement lakersButton;

    @FindBy (xpath = "//li[@class='sports menu-mlb']/a[@href]")
    public WebElement mlbButton;

    @FindBy (xpath = "//li[@class='teams mlb']//ul[1]//li[4]/a[@href]")
    public WebElement yankeesButton;

//    @FindBy (xpath = "//li[@class='teams mlb']//ul[1]//li[@class='team']//span[@class='link-text']")
//    public List<WebElement> americanLeagueEastTeams;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[6]/a")
    public WebElement soccerButton;

    @FindBy (xpath = "//li[@class='teams soccer']//li[2]/a[@href and @name='&lpos=subnav+subnav__team_fifa_world_cup']")
    public WebElement worldCupButton;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[7]/a")
    public WebElement moreButton;

    @FindBy (xpath = "//li[@class='sports menu-mma']/a[@href]")
    public WebElement mmaButton;

    @FindBy (xpath = "//li[@class='sports menu-f1']/a[@href]")
    public WebElement f1Button;

    @FindBy (xpath = "//li[@class='sports menu-wwe']/a[@href]")
    public WebElement wweButton;

    @FindBy (id = "global-search-trigger")
    public WebElement searchButton;

    @FindBy (id = "global-search-input")
    public WebElement searchField;

    @FindBy (xpath = "//*[@id='global-search']/div/input[2]")
    public WebElement secondSearchButton;

//    @FindBy (xpath = "//li[@class='user']/a[@href]")
//    public WebElement accountIcon;

    @FindBy (id = "global-user-trigger")
    public WebElement accountIcon;

    @FindBy (xpath = "//div[@class='current-favorites']//a")
    public WebElement addFavoritesButton;

    @FindBy (id = "favorites-manager-iframe")
    public WebElement myFavoritesIFrame;

    @FindBy (xpath = "//ul[@class='FavMgmt__Section']//li[3]//button[@class='Button Button--sm Button--alt']")
    public WebElement followNbaButton;

    @FindBy (xpath = "//section[@class='FavMgmt__Col FavMgmt__Col--Right flex flex-column']//ul[3]//button[@class='Button Button--sm Button--alt']")
    public WebElement unfollowNbaButton;

    @FindBy(xpath = "//*[@id='global-header']/div[2]/ul/li[2]/div/div/ul[1]/li[7]/a")
    public WebElement logInPromptButton;

    @FindBy(id = "disneyid-iframe")
    public WebElement iFrame;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInButton;

    @FindBy(name = "firstName")
    public WebElement firstNameInputField;

    @FindBy(name = "lastName")
    public WebElement lastNameInputField;

    @FindBy(xpath = "//button[contains(text(), 'Done')]")
    public WebElement doneButton;

    @FindBy(xpath = "//*[@id='global-header']/div[2]/ul/li[2]/div/div/ul[1]/li[1]/span")
    public WebElement welcomeUserText;

//    @FindBy(xpath = "//li[@class='user']//div[@class='global-user']//ul//li[5]/a")
//    public WebElement espnProfileButton;

    @FindBy(xpath = "//*[@id='global-header']/div[2]/ul/li[2]/div/div/ul[1]/li[5]/a")
    public WebElement espnProfileButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

//    public boolean areEqualLists (List<WebElement> elements, List<Object> data) {
//        if (elements.equals(data)) {
//            return true;
//        }
//        return false;
//    }

//    public void selectTeam(List<WebElement> elements, int teamIndex) {
//        try {
//            getTrimmedElementText(elements.get(teamIndex));
//        } catch (IndexOutOfBoundsException e) {
//            getTrimmedElementText(elements.get(elements.size() - 1));
//        }
//    }

    public SportsLeaguePage clickOnNba() {
        safeClickOnElement(nbaButton);

        return new SportsLeaguePage();
    }

    public SportsLeaguePage clickOnMlb() {
        safeClickOnElement(mlbButton);

        return new SportsLeaguePage();
    }

    public TeamPage clickOnTeam(WebElement element) {
        safeClickOnElement(element);

        return new TeamPage();
    }

    public SportsLeaguePage clickOnOtherLeagues(WebElement element) {
        hoverOverElement(moreButton);
        safeClickOnElement(element);

        return new SportsLeaguePage();
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public void inputSearchTerm(String searchTerm) {
        sendKeysToElement(searchField, searchTerm);
    }

    public void clickOnSecondSearchButton() {
        safeClickOnElement(secondSearchButton);
    }

//    public void extractNBATeamNames() {
//        hoverOverElement(nbaButton);
//        selectTeam(pacificTeams, pacificTeams.size());
//    }

//    public void extractMLBTeamNames() {
//        hoverOverElement(mlbButton);
//        selectTeam(americanLeagueEastTeams, americanLeagueEastTeams.size());
//    }

    public String getLakersText() {
        return getTrimmedElementText(lakersButton);
    }

    public String getYankeesText() {
        return getTrimmedElementText(yankeesButton);
    }

    public TeamPage navigateToLakersPage() {
        hoverOverElement(nbaButton);
        clickOnTeam(lakersButton);

        return new TeamPage();
    }

    public SportsLeaguePage clickOnF1() {
        clickOnOtherLeagues(f1Button);

        return new SportsLeaguePage();
    }

    public SportsLeaguePage clickOnWorldCupButton() {
        hoverOverElement(soccerButton);
        safeClickOnElement(worldCupButton);

        return new SportsLeaguePage();
    }

    public SportsLeaguePage clickOnWweButton() {
        clickOnOtherLeagues(wweButton);

        return new SportsLeaguePage();
    }

    public SportsLeaguePage clickOnMmaButton() {
        clickOnOtherLeagues(mmaButton);

        return new SportsLeaguePage();
    }

    public void clickOnAddFavoritesButton() {
        safeClickOnElement(addFavoritesButton);
    }

    public void clickOnNbaFollowButton() {
        safeClickOnElement(followNbaButton);
    }

    public SportsLeaguePage clickOnNhlScoresButton() {
        hoverOverElement(nhlButton);
        safeClickOnElement(nhlScoresButton);

        return new SportsLeaguePage();
    }

    public SearchResultsPage doSearch(String searchTerm) {
        clickOnSearchButton();
        inputSearchTerm(searchTerm);
        clickOnSecondSearchButton();

        return new SearchResultsPage();
    }

    public void addFavorites() {
        hoverOverElement(accountIcon);
        clickOnAddFavoritesButton();
        switchToIFrame(myFavoritesIFrame);
        clickOnNbaFollowButton();
    }

    public String getUnfollowFavoritesText() {
        return getTrimmedElementText(unfollowNbaButton);
    }

    public void clickOnLogInPromptButton() {
        hoverOverElement(accountIcon);
        safeClickOnElement(logInPromptButton);
    }

    public void inputEmail(String email) {
        sendKeysToElement(emailInputField, email);
    }

    public void inputPassword(String password) {
        sendKeysToElement(passwordInputField, password);
    }

    public void clickOnLogInButton() {
        safeClickOnElement(logInButton);
    }

    public void doLogin(String email, String password) {
        clickOnLogInPromptButton();
        switchToIFrame(iFrame);
        inputEmail(email);
        inputPassword(password);
        clickOnLogInButton();
    }

    public void clickOnEspnProfile() {
        hoverOverElement(accountIcon);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(espnProfileButton));
        safeClickOnElement(espnProfileButton);
    }

    public void inputNewFirstName(String fName) {
        clearSendKeysToElement(firstNameInputField, fName);
    }

    public void inputNewLastName(String lName) {
        clearSendKeysToElement(lastNameInputField, lName);
    }

    public void clickOnDoneButton() {
        jsScrollUntilElementIsVisible(doneButton);
        safeClickOnElement(doneButton);
    }

    public void updateProfile(String fName, String lName) {
        clickOnEspnProfile();
        switchToIFrame(iFrame);
        hoverOverElement(firstNameInputField);
        inputNewFirstName(fName);
        inputNewLastName(lName);
        clickOnDoneButton();
    }

    public String getWelcomeUserText() {
        switchToParentFrame();
        safeClickOnElement(accountIcon);
        return getTrimmedElementText(welcomeUserText);
    }



}
