@smoke
Feature: Homepage Test
  As a User, I want to test a few functionalities on the homepage.

  @Test01
  Scenario: User should navigate to Savings Account
    Given User is on homepage
    When User accepts cookies
    And User clicks on Savings tab from the top menu tabs
    And User clicks on Savings button from the dropdown list of menus
    Then User should navigate to the Savings page and verify header text successfully

  @Test02
  Scenario: User should navigate to Mortgage Blogs page
    Given User is on homepage
    When User accepts cookies
    And User clicks on Mortgages tab from the top menu tabs
    And User clicks on Mortgage Blogs button from the dropdown list of menus
    Then User should navigate to the Mortgages Blogs page and verify header text successfully

  @Test03
  Scenario: User should navigate to proposed changes to holiday lets blogs page
    Given User is on homepage
    When User accepts cookies
    And User clicks on Mortgages tab from the top menu tabs
    And User clicks on Mortgage Blogs button from the dropdown list of menus
    And User clicks on Read More button
    Then User should navigate to the blogs page and verify header text successfully