package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Reporter;

public class CartPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartHeading;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[@class='text-left'][2]")
    WebElement modelName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")
    WebElement totalPrice;


    public String getShoppingCartHeading() {
        Reporter.log("Get " + shoppingCartHeading.toString());
        CustomListeners.test.log(Status.PASS, "Get " + shoppingCartHeading.toString());
        return getTextFromElement(shoppingCartHeading);
    }

    public String getProductName() {
        Reporter.log("Get " + productName.toString());
        CustomListeners.test.log(Status.PASS, "Get " + productName.toString());
        return getTextFromElement(productName);
    }

    public String getModelName() {
        Reporter.log("Get " + modelName.toString());
        CustomListeners.test.log(Status.PASS, "Get " + modelName.toString());
        return getTextFromElement(modelName);
    }

    public String getTotalPrice() {
        Reporter.log("Get " + totalPrice.toString());
        CustomListeners.test.log(Status.PASS, "Get " + totalPrice.toString());
        WebElement toRightOf = driver.findElement(RelativeLocator.with(By.xpath("//td[@class='text-right']")).toRightOf(By.xpath("//strong[normalize-space()='Total:']")));

        return getTextFromElement(toRightOf);
    }
}
