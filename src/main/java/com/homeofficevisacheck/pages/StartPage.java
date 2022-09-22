package com.homeofficevisacheck.pages;

import com.homeofficevisacheck.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.homeofficevisacheck.drivermanager.ManageDriver.driver;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-grid-row']//*[contains(text(),'  Start now')]")
    WebElement startNowButton;

    public void clickOnStartNow() {
        clickOnElement(startNowButton);


    }
}