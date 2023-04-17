package co.uk.paragonbank.pages;

import co.uk.paragonbank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CareersPage.class.getName());

    public CareersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[text()='Close']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//a[@class='Selected Parent' and text()='Careers']")
    WebElement careersMenuTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Join our team']")
    WebElement joinOurTeamLink;

    @CacheLookup
    @FindBy(xpath = "//input[@name='epdsubmit']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_topContent_QuickSearch_Keywords']")
    WebElement keywords;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_topContent_QuickSearch_Postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Search Jobs ']")
    WebElement searchJobsButton;

    //Accept Cookies
    public void clickOnAcceptCookies() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(acceptCookies);
    }

    public void clickOnCareersTab() {
        clickOnElement(careersMenuTab);
    }

    public void clickOnJoinOurTeam() {
        clickOnElement(joinOurTeamLink);
    }

    public void clickOnContinueButton() throws InterruptedException{
        Thread.sleep(2000);
        clickOnElement(continueButton);
    }

    public void enterKeywordsField(String jobKeyword) {
        sendTextToElement(keywords, jobKeyword);
    }

    public void enterPostcodeField(String jobPostcode) {
        sendTextToElement(postcode, jobPostcode);
    }

    public void clickOnSearchJobsButton() {
        clickOnElement(searchJobsButton);
    }
}
