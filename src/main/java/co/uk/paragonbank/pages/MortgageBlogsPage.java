package co.uk.paragonbank.pages;

import co.uk.paragonbank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageBlogsPage extends Utility {

    private static final Logger log = LogManager.getLogger(MortgageBlogsPage.class.getName());

    public MortgageBlogsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1//span[@class='categoryname']")
    WebElement pageHeaderText;

    @CacheLookup
    @FindBy(xpath = "//a[@tabindex='722' and text()='Read more']")
    WebElement readMore;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='What are the proposed changes to holiday lets?']")
    WebElement blogHeaderText;

    public String getPageHeaderText() {
        String headText = getTextFromElement(pageHeaderText);
        return headText;
    }

    public void clickOnReadMore() {
        clickOnElement(readMore);
    }

    public String getBlogHeaderText() {
        String headText = getTextFromElement(blogHeaderText);
        return headText;
    }
}
