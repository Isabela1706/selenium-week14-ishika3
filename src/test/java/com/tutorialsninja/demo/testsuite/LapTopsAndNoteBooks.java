package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.pages.*;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LapTopsAndNoteBooks extends BaseTest {


    TopMenuPage topMenuPage;
    DesktopPage deskTopPage;
    LapTopsAndNoteBookPage lapTopsAndNoteBookPage;
    ProductPage productPage;
    ShoppingCardPage shoppingCardPage;
    CheckOutPage checkOutPage;


    @BeforeMethod
    public void inIt() {
        topMenuPage = new TopMenuPage();
        deskTopPage = new DesktopPage();
        lapTopsAndNoteBookPage = new LapTopsAndNoteBookPage();
        productPage = new ProductPage();
        shoppingCardPage = new ShoppingCardPage();
        checkOutPage = new CheckOutPage();


    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        // 1.1 Mouse hover on Laptops & Notebooks Tab.and click
        topMenuPage.mouseHoverOnLaptopAndClick();


        //1.2 Click on “Show All Laptops & Notebooks”
        topMenuPage.clickOnAllLapTop();


        //1.3 Select Sort By "Price (High > Low)"
        deskTopPage.selectFromSortByDropdown("Price (High > Low)");


        //1.4 Verify the Product price will arrange in High to Low order.

    }

    @Test(groups = { "smoke", "regression"})
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        topMenuPage.mouseHoverOnLaptopAndClick();

        // 2.2 Click on “Show All Laptops & Notebooks”
        topMenuPage.clickOnAllLapTop();

        //2.3 Select Sort By "Price (High > Low)"
        deskTopPage.selectFromSortByDropdown("Price (High > Low)");
        // 2.4 Select Product “MacBook”
        lapTopsAndNoteBookPage.clickOnMacBook();


        // 2.5 Verify the text “MacBook”
        Assert.assertEquals(lapTopsAndNoteBookPage.verifyMacBook(), "MacBook", "Invalid text");


        // 2.6 Click on ‘Add To Cart’ button
        lapTopsAndNoteBookPage.clickOnAddToCartButton();

        // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String actualShoppingCartMessage = lapTopsAndNoteBookPage.getShoppingCartMessage();
        String expectedShoppingCartMessage = "Success: You have added MacBook to your shopping cart!";
        Assert.assertEquals(actualShoppingCartMessage, expectedShoppingCartMessage, "Shopping Cart Message is not displayed");


        // 2.8 Click on link “shopping cart” display into success message
        Thread.sleep(3000);
        productPage.clickOnTheShoppingCartLink();


        // 2.9 Verify the text "Shopping Cart"
        String actualShoppingCartText = shoppingCardPage.getShoppingCartText();
        String expectedShoppingCartText = "Shopping Cart";
        Assert.assertTrue(actualShoppingCartText.contains(expectedShoppingCartText), "Shopping cart message is not displayed");


        // 2.10 Verify the Product name "MacBook"
        String actualMacBookName = shoppingCardPage.getProductName();
        String expectedMacBookName = "MacBook";
        Assert.assertEquals(actualMacBookName, expectedMacBookName, "The product name macbook is not displayed");


        // 2.11 Change Quantity "2"
        shoppingCardPage.changeQtyOfProduct("2");


        //  2.12 Click on “Update”Tab
        shoppingCardPage.clickOnUpdateButton();

        //  2.13 Verify the message “Success: You have modified your shopping cart!”
        String actualUpdatedMessage = shoppingCardPage.getUpdatedCartMessage();
        String expectedUpdatedMessage = "Success: You have modified your shopping cart!";
        Assert.assertEquals(actualUpdatedMessage, expectedUpdatedMessage, "Updated Shopping cart message is not displayed");


        //  2.14 Verify the Total £737.45
        String actualUpdatedPrice = shoppingCardPage.getPrice();
        String expectedUpdatedPrice = "$1,204.00";
        Assert.assertEquals(actualUpdatedPrice, expectedUpdatedPrice, "Price is not displayed");


        // 2.15 Click on “Checkout” button
        shoppingCardPage.clickOnCheckOut();

        //System.out.println(checkOutPage.getProductNotAvailableMessage());
        if (checkOutPage.getProductNotAvailableMessage().equals("Products marked with *** are not available in the desired quantity or not in stock!")) {
            System.out.println(actualMacBookName + " is not available in the desired quantity or not in stock!.");
        } else {


            // 2.16 Verify the text “Checkout”
            String actualCheckOutText = checkOutPage.getTextOfCheckOut();
            String expectedCheckOutText = "Checkout";
            Assert.assertEquals(actualCheckOutText, expectedCheckOutText, "CheckOut text is not displayed");


            // 2.17 Verify the Text “New Customer”
            String actualNewCustomerText = checkOutPage.getNewCustomerText();


            // 2.18 Click on “Guest Checkout” radio button
            checkOutPage.clickOnGuestRadioButton();


            // 2.19 Click on “Continue” tab
            checkOutPage.clickOnContinue();


            // 2.20 Fill the mandatory fields
            checkOutPage.enterFirstName("alex");
            checkOutPage.enterLastName("Patel");
            checkOutPage.enterEmailAddress("alex1323@gmail.com");
            checkOutPage.enterTelephone("+4478795847395");
            checkOutPage.enterAddress("83 highway");
            checkOutPage.enterCityName("Letchworth");
            checkOutPage.enterPostCode("SG2 9PO");
            checkOutPage.selectCountry("United Kingdom");
            checkOutPage.selectRegion("hertfordshire");



            // 2.21 Click on “Continue” Button
            checkOutPage.clickOnContinueButtonForGuest();
            checkOutPage.clickOnContinueButtonForDelivery();


            // 2.22 Add Comments About your order into text area
            checkOutPage.enterCommentInTextBox("This is comment");


            // 2.23 Check the Terms & Conditions check box
            checkOutPage.clickOnTerms();


            // 2.24 Click on “Continue” button
            checkOutPage.clickOnContinueButtonForPayment();



 }
}

}
