package co.uk.paragonbank.pages;

import co.uk.paragonbank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='CookiePolicy_wt7_block_wt14']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//span[@class='pCMS_SiteMenuBarItems']/li")
    List<WebElement> topMenuTabs;

    @CacheLookup
    @FindBy(xpath = "//span[@class='ListRecords']/li//a[text()='Savings']")
    WebElement savings;

    @CacheLookup
    @FindBy(xpath = "//span[@class='ListRecords']/li//a[text()='Mortgage blog']")
    WebElement mortgageBlog;

    @CacheLookup
    @FindBy(xpath = "//a[@tabindex='9' and text()='Careers']")
    WebElement careersTab;

    //Accept Cookies
    public void clickOnAcceptCookies() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(acceptCookies);
    }

    //Select tab from Top Menu Tabs
    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuTabs) {
            if (menu.getText().equalsIgnoreCase(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public void clickOnSavings() {
        clickOnElement(savings);
    }

    public void clickOnMortgageBlog() {
        clickOnElement(mortgageBlog);
    }

    public void clickOnCareersTab() {
        clickOnElement(careersTab);
    }
}

