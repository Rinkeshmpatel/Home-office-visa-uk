package com.homeofficevisacheck.pages;

import com.homeofficevisacheck.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.rmi.CORBA.Util;
import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> reasonForVisitList;





    public void selectReasonForTravel(String reasonForTravel) {
        for (WebElement reason : reasonForVisitList) {
            if (reason.getText().equals(reasonForTravel)) {
                clickOnElement(reason);
                break;
            }
        }
    }


}