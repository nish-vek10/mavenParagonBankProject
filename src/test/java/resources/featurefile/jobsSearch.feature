@regression
Feature: Job Search Test
  As a User, I want to search for job opportunities on uk-cv-library website.

  Scenario Outline: Search for jobs
    Given User is on homepage
    When User clicks on Accept Cookies
    And User enters Job Title "<jobTitle>"
    And User enters Location "<location>"
    And User selects distance from dropdown menu "<distance>"
    And User clicks on More Search Options link
    And User enters Minimum Salary "<salaryMin>"
    And User enters Maximum Salary "<salaryMax>"
    And And User selects Salary Type from dropdown menu "<salaryType>"
    And And User selects Job Type from dropdown menu "<jobType>"
    And User clicks on Find Jobs button
    Then User should verify the Header Text "<result>"
    Examples:
      | jobTitle         | location     | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                          |
      | Tester           | Harrow       | up to 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill     |
      | Retail           | Edgware      | up to 5 miles  | 300       | 500       | Per week   | Part Time | Part Time Retail jobs in Edgware                |
      | Web developer    | Essex        | up to 10 miles | 40000     | 650000    | Per annum  | Permanent | Permanent Web Developer jobs in Essex           |
      | Data Analyst     | Manchester   | up to 1 mile   | 50000     | 75000     | Per annum  | Any       | Data Analyst jobs in Manchester                 |
      | Surgeon          | HA1 1AA      | up to 10 miles | 6000      | 9000      | Per month  | Temporary | Temporary Surgeon jobs in HA1 1AA               |
      | Business Analyst | Warwickshire | up to 2 miles  | 50        | 100       | Per hour   | Permanent | Permanent Business Analyst jobs in Warwickshire |
      | Geologist        | Surrey       | up to 25 miles | 250       | 350       | Per day    | Any       | Geologist jobs in Surrey                        |
