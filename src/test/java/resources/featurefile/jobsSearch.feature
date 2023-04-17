@regression
Feature: Jobs Search Test
  As a User, I want to search for job opportunities to join the ParagonBank team.

  @Test04
  Scenario Outline: Searching for job opportunities for the company
    Given User is on homepage
    When User clicks on Accept Cookies
    And User clicks on Careers tab
    And User clicks on Close cookies
    And User clicks on Careers tab from top menu bar
    And User clicks on Join our team link from dropdown options
    And User clicks on Continue
    And User enters Job Role "<jobKeyword>" in Keywords field
    And User enters Postcode "<jobPostcode>" in Postcode field
    And User clicks on Search Jobs button
    Then User should verify the Header Text "<result>"
    Examples:
      | jobKeyword        | jobPostcode | result            |
      | Automation Tester | London      | Automation Tester |
