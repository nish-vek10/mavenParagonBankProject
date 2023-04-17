package co.uk.paragonbank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import co.uk.paragonbank.utility.Utility;

public class JobsResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(JobsResultPage.class.getName());

    public JobsResultPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[@class='vsr-job__title']")
    WebElement resultText;

    public String getResultsText() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", "//span[text()='View: ']");
        return getTextFromElement(resultText);
    }

    public void verifyTheResults(String result) throws InterruptedException {
        String actualMsg = getResultsText(); //Get text from page
        String expectedMsg = result; //Expected Message
        Assert.assertEquals(actualMsg, expectedMsg, "Results Verified!"); //Compare and Verify test
    }
}