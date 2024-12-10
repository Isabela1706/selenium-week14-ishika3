package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.pages.CartPage;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.TopMenuPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class DeskTopTest extends BaseTest {


    TopMenuPage topMenuPage;
    DesktopPage deskTopPage;
    HomePage homePage;
    CartPage cartPage;

    @BeforeMethod
    public void inIt() {
        topMenuPage = new TopMenuPage();
        deskTopPage = new DesktopPage();
        homePage=new HomePage();
        cartPage = new CartPage();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //1.1 Mouse hover on Desktops Tab. and click
        topMenuPage.mouseHoverAndClickOnDeskTop();


        //1.2 Click on “Show All Desktops”
        topMenuPage.clickOnShowAllDeskTop();


        //1.3 Select Sort By position "Name: Z to A"
        deskTopPage.selectFromSortByDropdown("Name (Z - A)");


        //1.4 Verify the Product will arrange in Descending order.
        deskTopPage.getListOfProducts();

    }

    @Test(groups = {"smoke", "regression"}, dataProvider = "desktopData", dataProviderClass = TestData.class)
    public void verifyProductAddedToShoppingCartSuccessFully(String product, String qty,
                                                             String successMessage, String productName, String model, String total) throws InterruptedException {


        Thread.sleep(2000);

        // 2.1 Mouse hover on Currency Dropdown and click
        homePage.mouseHoverAndClickOnCurrency();



        //  2.2 Mouse hover on £Pound Sterling and click
        homePage.selectPoundCurrency();



        // 2.3 Mouse hover on Desktops Tab.
        topMenuPage.mouseHoverOnDesktopAndClick();


        //2.4 Click on “Show All Desktops”
        topMenuPage.selectMenu("Show All Desktops");

        //2.5 Select Sort By position "Name: A to Z"
        deskTopPage.selectFromSortByDropdown("Name: A to Z");


        // 2.6 Select product <product>
        deskTopPage.clickOnProduct(product);



        //2.7 Enter Qty <qty> using Select class.
        deskTopPage.enterQuantity(qty);


        //  2.8 Click on “Add to Cart” button
        deskTopPage.clickOnAddToCartButton();



        //  2.9 Verify the Message <successMessage>
        String expString = deskTopPage.getSuccessAlertMsg(successMessage);
        String expString2 = expString.split("!")[0];
        Assert.assertEquals(expString, "Success: You have added " + product + " to your shopping cart!\n"+"×");



        //  2.10 Click on link “shopping cart” display into success message
        deskTopPage.clickOnCartLinkInMsgButton();


        //  2.11 Verify the text "Shopping Cart"
        Assert.assertEquals(cartPage.getShoppingCartHeading().substring(0,13), "Shopping Cart");



        //  2.12 Verify the Product name <productName>
        Assert.assertEquals(cartPage.getProductName(), productName);



        //2.13 Verify the Model <model>
        Assert.assertEquals(cartPage.getModelName(), model);



        //  2.14 Verify the Total <total>
        Assert.assertEquals(cartPage.getTotalPrice(), total);
}

}
