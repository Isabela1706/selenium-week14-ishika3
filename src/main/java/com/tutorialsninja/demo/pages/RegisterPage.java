package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {




    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement cPassword;

    @CacheLookup
    @FindBy(css = "input[value='1'][name='newsletter']")
    WebElement yesRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement registerSuccessMessageElement1;


    @CacheLookup
    @FindBy(linkText = "Continue")
    WebElement continueSuccess;


    /**
     * This method will verify
     */
    public String verifySuccessMessage() {
        Reporter.log("verifySuccessMessage");
        CustomListeners.test.log(Status.PASS, "Success message");
        return getTextFromElement(registerSuccessMessageElement1);

    }


    /**
     * This method will get the Register text
     */
    public String getRegisterText() {
        Reporter.log("getRegisterText");
        CustomListeners.test.log(Status.PASS, "message");
        return getTextFromElement(registerText);

    }

    /**
     * This method will enter firstname
     */
    public void enterFirstName(String fName) {
        Reporter.log("Enter firstName" + fName + "to firstName Field" + firstName.toString());
        sendTextToElement(firstName, fName);
        CustomListeners.test.log(Status.PASS, "enter FirstName" + firstName);
    }

    /**
     * This method will enter firstname
     */
    public void enterLastName(String lName) {
        Reporter.log("Enter lastName" + lName + "to lastName Field" + lastName.toString());
        sendTextToElement(lastName, lName);
        CustomListeners.test.log(Status.PASS, "enter lastName" + lastName);
    }

    /**
     * This method will enter email
     */
    public void enterEmail(String emailAddress) {
        Reporter.log("Enter email" + emailAddress + "To email field" + email.toString());
        sendTextToElement(email, emailAddress);
        CustomListeners.test.log(Status.PASS, "enter email" + email);
    }

    /**
     * This method will enter telephone
     */
    public void enterTelephone(String phone) {
        Reporter.log("enter telephone" + phone + "Telephone field" + telephone.toString());
        sendTextToElement(telephone, phone);
        CustomListeners.test.log(Status.PASS, "enter telephjone" + telephone);
    }

    /**
     * This method will enter password
     */
    public void enterPassword(String passwordText) {
        Reporter.log("enter password" + passwordText + "Password field" + password.toString());
        sendTextToElement(password, passwordText);
        CustomListeners.test.log(Status.PASS, "enterPassword" + password);
    }

    /**
     * This method will enter confirmPassword
     */
    public void enterConfirmPassword(String passwordText) {
        Reporter.log("enter conform password" + passwordText + "Password field" + cPassword.toString());
        sendTextToElement(cPassword, passwordText);
        CustomListeners.test.log(Status.PASS, "enter password" + cPassword);
    }

    /**
     * This method will click on the Yes radio button
     */
    public void clickOnTheYesRadioButton() {
        Reporter.log("click On yes" + yesRadio.toString());
        clickOnElement(yesRadio);
        CustomListeners.test.log(Status.PASS, "radio Button");
    }

    /**
     * This method will click on privacy checkbox
     */
    public void clickOnThePrivacyCheckbox() {
        Reporter.log("clickOnThePrivacyCheckbox" + privacyCheckBox.toString());
        clickOnElement(privacyCheckBox);
        CustomListeners.test.log(Status.PASS, "click On Privacy");
    }

    /**
     * This method will click on the continue button
     */
    public void clickOnContinueButton() {
        Reporter.log("clickOnContinueButton" + continueButton);
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "clickOnButton");
    }

    /**
     * This method will click on the continue successful button
     */
    public void clickOnContinueButtonAfterSuccessfulAccountCreated() {
        clickOnElement(continueSuccess);
        Reporter.log("clickOnContinueButtonAfterSuccessfulAccountCreated" + continueSuccess);

        CustomListeners.test.log(Status.PASS, "click on account" + continueSuccess);
}



}
