package system.shop;

import base.BasePage;
import data_providers.DataProviders;
import ebay_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShopping extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForDSLRCameras")
    public void testShopForDSLRs(String brand, String price, String text) {

        HomePage homePage = new HomePage();
        ElectronicsPage electronicsPage = homePage.clickOnElectronicsTab();
        CamerasAndPhotoPage camerasAndPhotoPage = electronicsPage.clickOnCamerasAndPhotoCategory();
        DSLRCamerasPage dslrCamerasPage = camerasAndPhotoPage.clickOnDSLRCameras();
        jsScrollUntilElementIsVisible(dslrCamerasPage.brandDropdown);
        dslrCamerasPage.clickOnBrandDropdown();
        selectOption(dslrCamerasPage.brands, Integer.parseInt(brand));
        dslrCamerasPage.clickOnPriceDropdown();
        selectOption(dslrCamerasPage.prices, Integer.parseInt(price));

        Assert.assertEquals(dslrCamerasPage.getDSLRCamerasHeaderText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForCarsAndTrucks")
    public void testShopForCars(String motorsIndex, String make, String model, String text) {

        HomePage homePage = new HomePage();
        CarsAndTrucksPage carsAndTrucksPage = homePage.selectMotorsCategory(homePage.motorsCategories, Integer.parseInt(motorsIndex));
        carsAndTrucksPage.clickOnAllMakesDropdown();
        selectFromDropdownByValue(carsAndTrucksPage.allMakesDropdown, make);
        carsAndTrucksPage.clickOnAllModelsDropdown();
        selectFromDropdownByValue(carsAndTrucksPage.allModelsDropdown, model);
        SearchResultsPage searchResultsPage = carsAndTrucksPage.clickOnFindAVehicleButton();

        Assert.assertEquals(searchResultsPage.getResultsText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForArtPaintings")
    public void testShopForPaintings(String artIndex, String text) {

        HomePage homePage = new HomePage();
        PaintingsPage paintingsPage = homePage.selectCollectiblesAndArtCategory(homePage.collectiblesAndArtCategories, Integer.parseInt(artIndex));
        WatercolorArtPaintingsPage watercolorArtPaintingsPage = paintingsPage.clickOnWatercolorMedium();

        Assert.assertEquals(watercolorArtPaintingsPage.getWatercolorArtPaintingsHeadingText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForRugs")
    public void testShopForRugs(String decorIndex, String text) {

        HomePage homePage = new HomePage();
        HomeDecorPage homeDecorPage = homePage.selectHomeAndGardenCategory(homePage.homeAndGardensCategories, Integer.parseInt(decorIndex));
        RugsAndCarpetsPage rugsAndCarpetsPage = homeDecorPage.clickOnRugsCategory();
        AreaRugsPage areaRugsPage = rugsAndCarpetsPage.clickOnAreaRugsCategory();
        TraditionalAreaRugs traditionalAreaRugs = areaRugsPage.clickOnTraditionalStyle();


        Assert.assertEquals(traditionalAreaRugs.getRugsText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForBoots")
    public void testShopForBoots(String shoesIndex, String text) {

        HomePage homePage = new HomePage();
        MensShoesPage mensShoesPage = homePage.selectClothingAndAccessoriesCategory(homePage.clothingAndAccessoriesCategories, Integer.parseInt(shoesIndex));
        MensBootsPage mensBootsPage = mensShoesPage.clickOnBootsCategory();
        TimberlandMensBootsPage timberlandMensBootsPage = mensBootsPage.clickOnTimberlandBrand();

        Assert.assertEquals(timberlandMensBootsPage.getTimberlandMensBootsHeadingText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testShopForCardGames")
    public void testShopForCardGames(String toyIndex, String text) {

        HomePage homePage = new HomePage();
        GamesPage gamesPage = homePage.selectToysCategory(homePage.toysCategories, Integer.parseInt(toyIndex));
        CardGamesAndPokerCardsPage cardGamesAndPokerCardsPage = gamesPage.clickOnCardGamesLink();

        Assert.assertEquals(cardGamesAndPokerCardsPage.getCardGamesHeadingText(), text);
    }

}
