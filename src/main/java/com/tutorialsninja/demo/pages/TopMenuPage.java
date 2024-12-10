package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class TopMenuPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//li//a")
    List<WebElement> topMenu;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement clickOnDeskTop;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement clickOnOption;


    @CacheLookup
    @FindBy(xpath = "//h2[text()='Desktops']")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement clickOnLapTop;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
    WebElement clickOnAllLapTop;


    @CacheLookup
    @FindBy(xpath ="//h2[text()='Laptops & Notebooks']" )
    WebElement verifyLapTopText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement clickOnComponents;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllComponents']")
    WebElement allComonents;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Components']")
    WebElement componentsHeading;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement deskTopLink;



    public void selectMenu(String menu) {
        List<WebElement> topMenuElements = topMenu;
        for (WebElement e : topMenuElements) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }



    public void mouseHoverAndClickOnDeskTop(){
        mouseHoverToElementAndClick(clickOnDeskTop);
        Reporter.log("mouseHove and click"+clickOnDeskTop.toString());
        CustomListeners.test.log(Status.PASS,"click On deskTop"+clickOnDeskTop);
    }
    /**
     * This method will clickOn Option
     */
    public void clickOnShowAllDeskTop(){
        clickOnElement(clickOnOption);
        Reporter.log("click On Show all"+clickOnOption.toString());
        CustomListeners.test.log(Status.PASS,"click onShow all");
    }
    /**
     * This method will verify text
     */
    public String verifyDeskTop(){
        Reporter.log("verifyDeskTop"+verifyText.toString());
        CustomListeners.test.log(Status.PASS,"verify deskTop"+verifyText);
        return getTextFromElement(verifyText);
    }
    /**
     * This method will clickOnLap
     */

    public void mouseHoverOnLaptopAndClick(){
        Reporter.log("mouseHoverAnd click"+clickOnLapTop.toString());
        CustomListeners.test.log(Status.PASS,"mouse Hover"+clickOnLapTop);
        mouseHoverToElementAndClick(clickOnLapTop);
    }
    /**
     * This method will click On All laptop
     */
    public void clickOnAllLapTop(){
        Reporter.log("click On allLapTop"+clickOnAllLapTop.toString());
        CustomListeners.test.log(Status.PASS,"clickOn LapTop"+clickOnAllLapTop);
        clickOnElement(clickOnAllLapTop);
    }
    /**
     * This method will verify laptop and book
     */

    public String verifyLapAndClick(){
        Reporter.log("verify Lap And Click");
        CustomListeners.test.log(Status.PASS,"verify text"+verifyText);
        return getTextFromElement(verifyLapTopText);
    }
    /**
     * This method will mouseHoverAnd click
     */

    public void mouseHoverAndClickOnComponents(){
        Reporter.log("mouseHoverAndClickOnComponents"+clickOnComponents.toString());
        CustomListeners.test.log(Status.PASS,"click On components"+clickOnComponents);
        mouseHoverToElementAndClick(clickOnComponents);

    }
    /**
     * This method will click On All components
     */
    public void clickOnAllComponent(){
        Reporter.log("click On All components"+allComonents.toString());
        CustomListeners.test.log(Status.PASS,"click On All components"+allComonents);
        clickOnElement(allComonents);
    }

    /**
     * This method will verify components
     */
    public String verifyComponent(){
        Reporter.log("verifyComponent");
        CustomListeners.test.log(Status.PASS,"verify components"+clickOnComponents);
        return getTextFromElement(componentsHeading);
}

    public void mouseHoverOnDesktopAndClick() {
        mouseHoverToElementAndClick(deskTopLink);
        Reporter.log("Click on " + deskTopLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on " + deskTopLink.toString());
    }


}
