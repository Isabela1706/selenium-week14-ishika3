package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCardPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCaRdText;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement productName;

    @CacheLookup
    @FindBy(css = "input[value='1']")
    WebElement productQty;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement updateButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement updateMessage;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[6]")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOutButton;



    /**
     * This Method will get the shopping cart text
     */
    public String getShoppingCartText() {
        Reporter.log("get Shopping CartText");
        CustomListeners.test.log(Status.PASS,"shoping text"+shoppingCaRdText);
        return getTextFromElement(shoppingCaRdText);

    }

    /**
     * This Method will get the product name from the cart
     */
    public String getProductName() {
        Reporter.log("get Product Name");
        CustomListeners.test.log(Status.PASS,"get Product Name"+productName);
        return getTextFromElement(productName);
    }

    /**
     * This method will update the qty
     */
    public void changeQtyOfProduct(String qty) {
        driver.findElement(By.cssSelector("input[value='1']")).clear();
        Reporter.log("changeQtyOfProduct"+productQty.toString());
        CustomListeners.test.log(Status.PASS,"change qty"+productQty);

        sendTextToElement(productQty, qty);
    }

    /**
     * click on the update cart button
     */
    public void clickOnUpdateButton() {
        clickOnElement(updateButton);
        Reporter.log("click On Upadte"+updateButton.toString());
        CustomListeners.test.log(Status.PASS,"click On updare"+updateButton);
    }
    /**
     * This method will get the updated cart message
     */
    public String getUpdatedCartMessage() {
        Reporter.log("ge t Updated CartMessage");
        CustomListeners.test.log(Status.PASS,"message"+updateMessage);
        return getTextFromElement(updateMessage).split("\n")[0];
    }

    /**
     * This method will get the price
     */
    public String getPrice() {
        Reporter.log("get  Price");
        CustomListeners.test.log(Status.PASS,"get price"+productPrice);
        return getTextFromElement(productPrice);
    }
    /**
     * This method will click on the checkout button
     */
    public void clickOnCheckOut() {
        Reporter.log("click On "+checkOutButton.toString());
        CustomListeners.test.log(Status.PASS,"click On Check"+checkOutButton);
        clickOnElement(checkOutButton);
}

}
