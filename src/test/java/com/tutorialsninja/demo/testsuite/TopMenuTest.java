package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.pages.TopMenuPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {



    TopMenuPage topMenuPage;

    @BeforeMethod
    public void inIt() {
        topMenuPage = new TopMenuPage();


    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        topMenuPage.mouseHoverAndClickOnDeskTop();

        // 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        topMenuPage.clickOnShowAllDeskTop();


        //1.3 Verify the text ‘Desktops’
        String actualText="Desktops";
        String expectedText=topMenuPage.verifyDeskTop();
        Assert.assertEquals(actualText,expectedText,"Invalid text");


    }
    @Test(groups = { "smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        topMenuPage.mouseHoverOnLaptopAndClick();


        // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        topMenuPage.clickOnAllLapTop();


        // 2.3 Verify the text ‘Laptops & Notebooks’
        String actualText1="Laptops & Notebooks";
        String expectedText1=topMenuPage.verifyLapAndClick();
        Assert.assertEquals(actualText1,expectedText1,"Invalid text");


    }
    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        // 3.1 Mouse hover on “Components” Tab and click
        topMenuPage.mouseHoverAndClickOnComponents();


        // 3.2 call selectMenu method and pass the menu = “Show All Components”
        topMenuPage.clickOnAllComponent();


        // 3.3 Verify the text ‘Components’
        String actualText2="Components";
        String expectedText2=topMenuPage.verifyComponent();
        Assert.assertEquals(actualText2,expectedText2,"Invalid text");

}

}
