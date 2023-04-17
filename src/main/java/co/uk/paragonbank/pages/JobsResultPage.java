package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    //Get Results text
    public String getResultsText() {
        log.info("Getting Text from: " + resultText.toString());
        return getTextFromElement(resultText); //call method from Utility class
    }

    //Verify the results page
    public void verifyTheResults(String result) {
        String actualMsg = getResultsText(); //Get text from page
        String expectedMsg = result; //Expected Message
        Assert.assertEquals(actualMsg, expectedMsg, "Results Verified!"); //Compare and Verify test
    }
}