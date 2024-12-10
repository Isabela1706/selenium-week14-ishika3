package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement notAvailableMessage;

    @CacheLookup
    WebElement newCustomer;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephoneNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;


    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonGuest;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement continueButtonDelivery;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonPayment;

    @CacheLookup
    @FindBy(xpath = "//div[@id='collapse-payment-method']//textarea[@name='comment']")
    WebElement textBox;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement agree;


    /**
     * This method will get the text from check out page
     */
    public String getTextOfCheckOut() {
        Reporter.log("get Text Of CheckOut");
        CustomListeners.test.log(Status.PASS,"click On check Box"+checkOutText);
        return getTextFromElement(checkOutText);
    }

    /**
     * This method will get error message (if product is not available)
     */
    public String getProductNotAvailableMessage() {
        Reporter.log(" message ");
        CustomListeners.test.log(Status.PASS,"available Message"+notAvailableMessage);
        return getTextFromElement(notAvailableMessage).split("\n")[0];
    }

    /**
     * This method will get the new customer text
     */
    public String getNewCustomerText() {
        Reporter.log("get new customer");
        CustomListeners.test.log(Status.PASS,"get customer"+newCustomer);
        return getTextFromElement(newCustomer);
    }

    /**
     * This method will click onGuest radio button
     */
    public void clickOnGuestRadioButton() {
        Reporter.log("click On radio button"+guestRadioButton.toString());
        CustomListeners.test.log(Status.PASS,"click On Radio Button"+guestRadioButton);
        clickOnElement(guestRadioButton);
    }

    /**
     * This method will click on continue button
     */
    public void clickOnContinue() {
        Reporter.log("click On Continue"+continueButton.toString());
        CustomListeners.test.log(Status.PASS,"click On continue"+continueButton);
        clickOnElement(continueButton);
    }

    /**
     * This method will enter name
     */
    public void enterFirstName(String fName) {
        Reporter.log("enter name"+fName+"enter Name"+firstName.toString());
        CustomListeners.test.log(Status.PASS,"enter name"+firstName);
        sendTextToElement(firstName, fName);
    }

    /**
     * This method will enter last name
     */
    public void enterLastName(String lName) {
        Reporter.log("enter last NAme"+lastName.toString());
        CustomListeners.test.log(Status.PASS,"name"+lastName);
        sendTextToElement(lastName, lName);
    }

    /**
     * This method will enter email
     */
    public void enterEmailAddress(String email) {
        Reporter.log("enter email"+emailAddress.toString());
        CustomListeners.test.log(Status.PASS,"name"+emailAddress);

        sendTextToElement(emailAddress, email);
    }

    /**
     * This method will enter telephone
     */
    public void enterTelephone(String phone) {
        Reporter.log("enter telephone"+telephoneNumber.toString());
        CustomListeners.test.log(Status.PASS,"phone number"+telephoneNumber);
        sendTextToElement(telephoneNumber, phone);
    }

    /**
     * This method will enter address
     */
    public void enterAddress(String add) {
        Reporter.log("enter address"+address.toString());
        CustomListeners.test.log(Status.PASS,"enter address"+address);
        sendTextToElement(address, add);
    }

    /**
     * This method will enter city
     */
    public void enterCityName(String cty) {
        Reporter.log("enter city"+city.toString());
        CustomListeners.test.log(Status.PASS,"enter city"+city);
        sendTextToElement(city, cty);
    }

    /**
     * This method will enter Post code
     */
    public void enterPostCode(String pCode) {
        Reporter.log("enter postCode"+postCode.toString());
        CustomListeners.test.log(Status.PASS,"enter postCode"+postCode);
        sendTextToElement(postCode, pCode);
    }

    /**
     * This method will select country
     */
    public void selectCountry(String cnty) {
        Reporter.log("enter country"+country.toString());
        CustomListeners.test.log(Status.PASS,"enter country"+country);
        selectByVisibleTextFromDropDown(country, cnty);
    }

    /**
     * This method will select region
     */
    public void selectRegion(String rgn) {
        Reporter.log("enter Region"+region.toString());
        CustomListeners.test.log(Status.PASS,"enter region"+region);
        selectByVisibleTextFromDropDown(region, rgn);
    }

    /**
     * This method will click on continue button
     */
    public void clickOnContinueButtonForGuest() {
        Reporter.log("enter Button"+continueButtonGuest.toString());
        CustomListeners.test.log(Status.PASS,"click On "+continueButtonGuest);
        clickOnElement(continueButtonGuest);
    }

    public void clickOnContinueButtonForDelivery() {
        Reporter.log("click On continue"+continueButtonDelivery.toString());
        CustomListeners.test.log(Status.PASS,"click On continue"+continueButtonDelivery);
        clickOnElement(continueButtonDelivery);
    }

    /**
     * This method will enter data in textfield
     */
    public void enterCommentInTextBox(String message) {
        Reporter.log("enter comment"+textBox.toString());
        CustomListeners.test.log(Status.PASS,"enter comment"+textBox);
        sendTextToElement(textBox, message);
    }

    /**
     * This method will accept terms
     */
    public void clickOnTerms() {
        Reporter.log("click On agrre"+agree.toString());
        CustomListeners.test.log(Status.PASS,"click Om terms"+agree);
        clickOnElement(agree);
    }

    public void clickOnContinueButtonForPayment() {
        Reporter.log("click On coninue"+continueButtonPayment.toString());
        CustomListeners.test.log(Status.PASS,"click on button"+continueButtonPayment);
        clickOnElement(continueButtonPayment);
}


}

