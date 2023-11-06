Feature: Plans page scenarios
  Background:
    Given clicking the login button
    When entering username "supervisor" and password "tek_supervisor"
    And clicking sign in button
    And clicking the plans tab

    Scenario: Validating correct number of rows
      Then 4 rows should be displayed

      Scenario: Validating date created and date expired
        Then validate the create date is today
        And the date expire is tomorrow

