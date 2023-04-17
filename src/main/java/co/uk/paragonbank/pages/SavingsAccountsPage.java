package co.uk.paragonbank.pages;

import co.uk.paragonbank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavingsAccountsPage extends Utility {

    private static final Logger log = LogManager.getLogger(SavingsAccountsPage.class.getName());

    public SavingsAccountsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[text()='View accounts']")
    WebElement viewAccounts;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Savings']")
    WebElement savingsText;

    @CacheLookup
    @FindBy(xpath = "//h3[text()='How to save money on holiday']")
    WebElement saveMoneyText;

    @CacheLookup
    @FindBy(xpath = "//a[@tabindex='1923' and text()='Read more']")
    WebElement readMoreButton;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='How to save money on holiday']")
    WebElement headerBlogText;

    public void clickOnViewAccounts() {
        clickOnElement(viewAccounts);
    }

    public String getHeaderSavingsText() {
        String headText = getTextFromElement(savingsText);
        return headText;
    }

    public void clickOnSaveMoneyBlog() throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", saveMoneyText);
        clickOnElement(readMoreButton);
    }

    public String getHeaderBlogText() {
        String headText = getTextFromElement(headerBlogText);
        return headText;
    }
}
