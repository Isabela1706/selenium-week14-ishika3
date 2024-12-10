package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement clickOnLink;

    /**
     * This method will click on the shopping cart link
     * */
    public void clickOnTheShoppingCartLink(){
        //waitUntilVisibilityOfElementLocated(shoppingCartLink,4);
        clickOnElement(clickOnLink);
        Reporter.log("click Om Shopping"+clickOnLink.toString());
        CustomListeners.test.log(Status.PASS,"click On"+clickOnLink);
}

}
