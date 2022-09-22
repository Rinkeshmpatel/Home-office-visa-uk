package com.homeofficevisacheck.pages;

import com.homeofficevisacheck.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']/div[1]/input" )
    WebElement work;

    public void clickonworktype(){
        clickOnElement(work);
    }

}

