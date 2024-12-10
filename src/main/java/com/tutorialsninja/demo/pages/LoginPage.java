package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement loginText;
    /**
     * This method will get the Login text
     */
    public String getLoginText() {
        Reporter.log("ge t Login Text");
        CustomListeners.test.log(Status.PASS,"log in"+loginText);
        return getTextFromElement(loginText);
}

}
