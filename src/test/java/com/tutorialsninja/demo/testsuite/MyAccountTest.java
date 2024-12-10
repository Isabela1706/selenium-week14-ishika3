package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.pages.CommonElementPage;
import com.tutorialsninja.demo.pages.LoginPage;
import com.tutorialsninja.demo.pages.RegisterPage;
import com.tutorialsninja.demo.pages.TopMenuPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {


    TopMenuPage topMenuPage;
    CommonElementPage commonElementPage;
    RegisterPage registerPage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt() {
        topMenuPage = new TopMenuPage();
        commonElementPage = new CommonElementPage();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();


    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        //1.1 Click on the My Account Link.
        commonElementPage.clickOnMyAccountLink();

        //1.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Register”
        commonElementPage.clickOnRegister();

        //1.3 Verify the text “Register Account”.
        String actualRegisterText = registerPage.getRegisterText();
        String expectedRegisterText = "Register Account";
        Assert.assertEquals(actualRegisterText, expectedRegisterText, "Register Account text is not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        //2.1 Click on My Account Link.
        commonElementPage.clickOnMyAccountLink();


        // 2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        commonElementPage.clickOnLogin();

        // 2.3 Verify the text “Returning Customer”.
        String actualLoginText = loginPage.getLoginText();
        String exceptedLoginText = "Returning Customer";
        Assert.assertEquals(actualLoginText, exceptedLoginText, "Returning Customer is not displayed");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserRegisterAccountSuccessfully() {

        // 3.1 Click on My Account Link.
        commonElementPage.clickOnMyAccountLink();
        // 3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        commonElementPage.clickOnRegister();
        //  3.3 Enter First Name
        registerPage.enterFirstName("alex");

        //  3.4 Enter Last Name
        registerPage.enterLastName("Pain");

        //  3.5 Enter Email
        registerPage.enterEmail("alexpain@gmail.com");


        //  3.6 Enter Telephone
        registerPage.enterTelephone("+442849487378");


        //  3.7 Enter Password
        registerPage.enterPassword("pain1234");


        //  3.8 Enter Password Confirm
        registerPage.enterConfirmPassword("pain1234");


        //  3.9 Select Subscribe Yes radio button
        registerPage.clickOnTheYesRadioButton();


        //  3.10 Click on Privacy Policy check box
        registerPage.clickOnThePrivacyCheckbox();


        // 3.11 Click on Continue button

        registerPage.clickOnContinueButton();



        // 3.12 Verify the message “Your Account Has Been Created!”
        String actualSuccessMessage = registerPage.verifySuccessMessage();
        String expectedSuccessMessage = "Your Account Has Been Created!";
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "The message your account has been created is not displayed");



        // 3.13 Click on Continue button
        registerPage.clickOnContinueButtonAfterSuccessfulAccountCreated();


        //  3.14 Clickr on My Account Link.
        commonElementPage.clickOnAccountTab();




        // 3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        commonElementPage.clickOnLogOut();


        // 3.16 Verify the text “Account Logout”
        String expected="Account Logout";
        String actualText=commonElementPage.verifyTextLogOut();
        Assert.assertEquals(actualText,expected,"invalid text");



        // 3.17 Click on Continue button
        commonElementPage.clickOnContinueButton();
}

}
