package co.uk.paragonbank.steps;

import co.uk.paragonbank.pages.HomePage;
import co.uk.paragonbank.pages.MortgageBlogsPage;
import co.uk.paragonbank.pages.SavingsAccountsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageSteps {

    //Create objects
    HomePage homePage = new HomePage();
    SavingsAccountsPage savingsAccountsPage = new SavingsAccountsPage();
    MortgageBlogsPage mortgageBlogsPage = new MortgageBlogsPage();

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User accepts cookies$")
    public void userAcceptsCookies() throws InterruptedException {
        homePage.clickOnAcceptCookies();
    }

    @And("^User clicks on Savings tab from the top menu tabs$")
    public void userClicksOnSavingsTabFromTheTopMenuTabs() {
        homePage.clickOnMenuTab("Savings");
    }

    @And("^User clicks on Savings button from the dropdown list of menus$")
    public void userClicksOnSavingsButtonFromTheDropdownListOfMenus() {
        homePage.clickOnSavings();
    }

    @Then("^User should navigate to the Savings page and verify header text successfully$")
    public void userShouldNavigateToTheSavingsPageAndVerifyHeaderTextSuccessfully() {
        savingsAccountsPage.getHeaderSavingsText();
    }

    @And("^User clicks on Mortgages tab from the top menu tabs$")
    public void userClicksOnMortgagesTabFromTheTopMenuTabs() {
        homePage.clickOnMenuTab("Mortgages");
    }

    @And("^User clicks on Mortgage Blogs button from the dropdown list of menus$")
    public void userClicksOnMortgageBlogsButtonFromTheDropdownListOfMenus() {
        homePage.clickOnMortgageBlog();
    }

    @Then("^User should navigate to the Mortgages Blogs page and verify header text successfully$")
    public void userShouldNavigateToTheMortgagesBlogsPageAndVerifyHeaderTextSuccessfully() {
        mortgageBlogsPage.getPageHeaderText();
    }

    @And("^User clicks on Read More button$")
    public void userClicksOnReadMoreButton() {
        mortgageBlogsPage.clickOnReadMore();
    }

    @Then("^User should navigate to the blogs page and verify header text successfully$")
    public void userShouldNavigateToTheBlogsPageAndVerifyHeaderTextSuccessfully() {
        mortgageBlogsPage.getBlogHeaderText();
    }
}
