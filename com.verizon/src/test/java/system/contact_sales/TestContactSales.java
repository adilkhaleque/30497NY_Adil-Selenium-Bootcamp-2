package system.contact_sales;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_page_library.BusinessPage;
import verizon_page_library.ContactSalesPage;
import verizon_page_library.HomePage;

public class TestContactSales extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testRequestSalesConsultation")
    public void testRequestingASalesConsultation(String country, String size, String aoi, String industry, String fName,
                                                 String lName, String email, String number, String company, String contactMethod,
                                                 String address, String city, String state, String zip, String comment, String text) {

        HomePage homePage = new HomePage();
        BusinessPage businessPage = homePage.systemBar.navigateToBusinessPage();
        ContactSalesPage contactSalesPage = businessPage.navigateToContactSalesPage();

        contactSalesPage.fillInProfileInfo(country, size, aoi, industry);
        contactSalesPage.clickOnNextButton();
        contactSalesPage.fillInContactInfo(fName, lName, email, number, company, contactMethod, address, city, state, zip, comment);
        contactSalesPage.clickOnPrivacyPolicyCheckbox();

        Assert.assertEquals(contactSalesPage.getSubmitText(), text);

    }
}
