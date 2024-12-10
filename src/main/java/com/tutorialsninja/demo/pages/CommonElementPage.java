package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CommonElementPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;




    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement logoutMessageElement;


    @CacheLookup
    @FindBy(linkText = "Continue")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement clickOn;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement clickOnLogin;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
    WebElement clickOnLogOut;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement verifyLogOut;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement clickOnAccountTab;


    /**
     * This method will click On account
     */
    public void clickOnAccountTab(){
        Reporter.log("click on account tab"+clickOnAccountTab.toString());
        CustomListeners.test.log(Status.PASS,"click On account"+clickOnAccountTab);
        clickOnElement(clickOnAccountTab);
    }


    /**
     * This method will select option from my account link
     */
    public void clickOnRegister(){
        Reporter.log("click On Register"+clickOn.toString());
        CustomListeners.test.log(Status.PASS,"click On register"+clickOn);
        clickOnElement(clickOn);
    }

    /**
     * This method will click on my account link.
     */
    public void clickOnMyAccountLink() {
        Reporter.log("click On Account"+myAccountLink.toString());
        CustomListeners.test.log(Status.PASS,"click On account"+myAccountLink);
        clickOnElement(myAccountLink);
    }
    /**
     * This method will get the logout message
     */
    public String getLogoutText() {
        return getTextFromElement(logoutMessageElement);
    }
    /**
     * This method will click on continue button
     */
    public void clickOnContinueButton() {
        Reporter.log("click On "+continueButton.toString());
        CustomListeners.test.log(Status.PASS,"click On continue"+continueButton);
        clickOnElement(continueButton);
    }
    /**
     * This method will clickOn Login
     */
    public void clickOnLogin(){
        Reporter.log("click On "+clickOnLogin.toString());
        CustomListeners.test.log(Status.PASS,"click On Login"+clickOnLogin);
        clickOnElement(clickOnLogin);
    }
    /**
     * This method will clickOn logOut
     */
    public void clickOnLogOut(){
        Reporter.log("click On Log Out"+clickOnLogOut.toString());
        CustomListeners.test.log(Status.PASS,"click On Loh Out"+clickOnLogOut);
        clickOnElement(clickOnLogOut);
    }
    /**
     * This method will verify LogOut
     */
    public String verifyTextLogOut(){
        Reporter.log("verify text");
        CustomListeners.test.log(Status.PASS,"verify text"+verifyLogOut);
        return getTextFromElement(verifyLogOut);
}


}
