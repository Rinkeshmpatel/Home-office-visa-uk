package com.homeofficevisacheck.pages;

import com.homeofficevisacheck.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement radiobuttons;


    public void setduration(){
        clickOnElement(radiobuttons);

    }
}
