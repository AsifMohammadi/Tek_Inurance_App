@Regression
Feature: Checking the customer service portal scenarios

  Background:
    Given clicking the login button
    And entering username "supervisor" and password "tek_supervisor"
    And clicking sign in button with wait
    And clicking the user drawer


  Scenario: Validating the profile side drawer info
    Then user type should be "CSR"
    Then name should be "Supervisor"
    Then Username should be "supervisor"
    Then Authorities should be "admin"
    Then the logout button should be enabled

    Scenario: Being able to log out successfully
      When clicking the logout button
      Then user should be directed to customer service portal page and the page header should be "TEK Insurance App"
