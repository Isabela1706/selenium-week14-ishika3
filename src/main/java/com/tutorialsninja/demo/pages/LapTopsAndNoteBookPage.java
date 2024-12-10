package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LapTopsAndNoteBookPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='MacBook']")
    WebElement macBookProduct;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement macBook;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement verifySuccess;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement SuccessMessage;

    /**
     * This method will click on macBook product
     */
    public void clickOnMacBook() {
        Reporter.log("click on macBook"+macBookProduct.toString());
        CustomListeners.test.log(Status.PASS,"click on mac Boook"+macBookProduct);
        clickOnElement(macBookProduct);
    }

    /**
     * This method will verify macbook
     */
    public String verifyMacBook() {
        Reporter.log("Mac Book");
        CustomListeners.test.log(Status.PASS,"verify"+macBook);
        return getTextFromElement(macBook);
    }

    /**
     * This method will add To cart
     */
    public void clickOnAddToCartButton() {
        Reporter.log(" click On cart"+addToCartButton.toString());
        CustomListeners.test.log(Status.PASS,"click On pass"+addToCartButton);
        clickOnElement(addToCartButton);


    }
    /**
     * This Method will get the shopping cart text
     */
    public String getShoppingCartText() {
        return getTextFromElement(verifySuccess);
    }
    /**
     * This method will get the shopping cart message
     * */
    public String getShoppingCartMessage() throws InterruptedException {
        // Thread.sleep(3000);
        Reporter.log("get Shopping Cart Message"+SuccessMessage.toString());
        CustomListeners.test.log(Status.PASS,"message"+SuccessMessage);
        return getTextFromElement(SuccessMessage).split("\n")[0];
}




}
