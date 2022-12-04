package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testBasicSearch")
    public Object[][] getSimpleSearchTerm() {
        return excel.readStringArrays("BasicSearch");
    }

    @DataProvider(name = "testDetailedSearch")
    public Object[][] getSecondSearchTerm() {
        return excel.readStringArrays("DetailedSearch");
    }

    @DataProvider(name = "testAddFavoritesDP")
    public Object[][] getFavorites() {
        return excel.readStringArrays("NumOfFavorites");
    }

    @DataProvider(name = "testRemoveFavoritesDP")
    public Object[][] getOneFavorite() {
        return excel.readStringArrays("OneFavorite");
    }

    @DataProvider(name = "testReviewDP")
    public Object[][] getReview() {
        return excel.readStringArrays("WriteAReview");
    }

    @DataProvider(name = "testRentCalculatorDP")
    public Object[][] getRentalInformation() {
        return excel.readStringArrays("RentCalculator");
    }

    @DataProvider(name = "testAuthentication")
    public Object[][] getAuthenticationInformation() {
        return excel.readStringArrays("Authentication");
    }

    @DataProvider(name = "testChangeLanguage")
    public Object[][] getLanguageText() {
        return excel.readStringArrays("ChangeLanguage");
    }

    @DataProvider(name = "testHomesForRent")
    public Object[][] getRentalHomesInfo() {
        return excel.readStringArrays("HomesForRent");
    }

    @DataProvider(name = "testApartmentsForRent")
    public Object[][] getRentalApartmentsInfo() {
        return excel.readStringArrays("ApartmentsForRent");
    }

    @DataProvider(name = "testCondosForRent")
    public Object[][] getRentalCondosInfo() {
        return excel.readStringArrays("CondosForRent");
    }

    @DataProvider(name = "testTownhomesForRent")
    public Object[][] getTownhomesInfo() {
        return excel.readStringArrays("TownhomesForRent");
    }

    @DataProvider(name = "testSavedSearch")
    public Object[][] getSearchSummary() {
        return excel.readStringArrays("SavedSearch");
    }
}
