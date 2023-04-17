package co.uk.paragonbank.steps;

import co.uk.paragonbank.pages.CareersPage;
import co.uk.paragonbank.pages.HomePage;
import co.uk.paragonbank.pages.JobsResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobsSearchSteps {

    //Create objects
    HomePage homePage = new HomePage();
    CareersPage careersPage = new CareersPage();
    JobsResultPage jobsResultPage = new JobsResultPage();

    @When("^User clicks on Accept Cookies$")
    public void userClicksOnAcceptCookies() throws InterruptedException {
        homePage.clickOnAcceptCookies();
    }

    @And("^User clicks on Careers tab$")
    public void userClicksOnCareersTab() {
        homePage.clickOnCareersTab();
    }

    @And("^User clicks on Close cookies$")
    public void userClicksOnCloseCookies() throws InterruptedException {
        careersPage.clickOnAcceptCookies();
    }

    @And("^User clicks on Careers tab from top menu bar$")
    public void userClicksOnCareersTabFromTopMenuBar() {
        careersPage.clickOnCareersTab();
    }

    @And("^User clicks on Join our team link from dropdown options$")
    public void userClicksOnJoinOurTeamLinkFromDropdownOptions() {
        careersPage.clickOnJoinOurTeam();
    }

    @And("^User clicks on Continue$")
    public void userClicksOnContinue() throws InterruptedException {
        careersPage.clickOnContinueButton();
    }

    @And("^User enters Job Role \"([^\"]*)\" in Keywords field$")
    public void userEntersJobRoleInKeywordsField(String jobKeyword) {
        careersPage.enterKeywordsField(jobKeyword);
    }

    @And("^User enters Postcode \"([^\"]*)\" in Postcode field$")
    public void userEntersPostcodeInPostcodeField(String jobPostcode) {
        careersPage.enterPostcodeField(jobPostcode);
    }

    @And("^User clicks on Search Jobs button$")
    public void userClicksOnSearchJobsButton() {
        careersPage.clickOnSearchJobsButton();
    }

    @Then("^User should verify the Header Text \"([^\"]*)\"$")
    public void userShouldVerifyTheHeaderText(String result) throws InterruptedException {
        jobsResultPage.verifyTheResults(result);
    }
}
