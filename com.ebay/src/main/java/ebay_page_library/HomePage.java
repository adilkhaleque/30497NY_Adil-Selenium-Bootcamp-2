package ebay_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;


public class HomePage extends SharedStepsUI {

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul/li//a[contains(text(), 'Saved')]")
    public WebElement savedTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Motors']")
    public WebElement motorsTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][1]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> motorsCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Electronics']")
    public WebElement electronicsTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][2]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> electronicsCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Collectibles & Art']")
    public WebElement collectiblesAndArtTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][3]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> collectiblesAndArtCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Home & Garden']")
    public WebElement homeAndGardenTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][4]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> homeAndGardensCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Clothing & Accessories']")
    public WebElement clothingAndAccessoriesTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][5]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> clothingAndAccessoriesCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Toys']")
    public WebElement toysTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][6]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> toysCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Sporting Goods']")
    public WebElement sportingGoodsTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][7]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> sportingGoodsCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Business & Industrial']")
    public WebElement businessAndIndustrialTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][8]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> businessAndIndustrialCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']//a[text() = 'Jewelry & Watches']")
    public WebElement jewelryAndWatchesTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][9]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> jewelryAndWatchesCategories;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']/a[text()='eBay Refurbished']")
    public WebElement ebayRefurbishedTab;

    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab'][10]//div[@class='hl-cat-nav__sub-cats']//ul//li")
    public List<WebElement> ebayRefurbishedCategories;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public MotorsPage clickOnMotorsTab() {
        safeClickOnElement(motorsTab);

        return new MotorsPage();
    }

    public ElectronicsPage clickOnElectronicsTab() {
        safeClickOnElement(electronicsTab);

        return new ElectronicsPage();
    }

    public CollectiblesAndArtPage clickOnCollectiblesAndArtTab() {
        safeClickOnElement(collectiblesAndArtTab);

        return new CollectiblesAndArtPage();
    }

    public HomeAndGardenPage clickOnHomeAndGardenTab() {
        safeClickOnElement(homeAndGardenTab);

        return new HomeAndGardenPage();
    }

    public ClothingAndAccessoriesPage clickOnClothingAndAccessoriesTab() {
        safeClickOnElement(clothingAndAccessoriesTab);

        return new ClothingAndAccessoriesPage();
    }

    public ToysPage clickOnToysTab() {
        safeClickOnElement(toysTab);

        return new ToysPage();
    }

    public SportingGoodsPage clickOnSportingGoodsTab() {
        safeClickOnElement(sportingGoodsTab);

        return new SportingGoodsPage();
    }

    public BusinessAndIndustrialPage clickOnBusinessAndIndustrialTab() {
        safeClickOnElement(motorsTab);

        return new BusinessAndIndustrialPage();
    }

    public JewelryAndWatchesPage clickOnJewelryAndWatchesTab() {
        safeClickOnElement(jewelryAndWatchesTab);

        return new JewelryAndWatchesPage();
    }

    public EbayRefurbishedPage clickOnEbayRefurbishedTab() {
        safeClickOnElement(ebayRefurbishedTab);

        return new EbayRefurbishedPage();
    }

    public CategoryPage selectCategory(List<WebElement> elements, int optionIndex) {
        try {
            safeClickOnElement(elements.get(optionIndex));
        } catch (IndexOutOfBoundsException e) {
            safeClickOnElement(elements.get(elements.size() - 1));
        }

        return new CategoryPage();
    }

}
