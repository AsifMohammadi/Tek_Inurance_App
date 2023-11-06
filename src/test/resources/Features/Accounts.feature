@Smoke
Feature: Accounts page scenarios

  Background:
    Given clicking the login button
    When entering username "supervisor" and password "tek_supervisor"
    And clicking sign in button
    And clicking the accounts tab

    Scenario: Default number of entries
      Then 5 rows should be visible
      And validate the default is "Show 5"

      Scenario Outline:
        When selecting "<dropDownOption>"
        Then <NumberOfRowsShown> rows should be visible
        Examples:
        |dropDownOption |NumberOfRowsShown|
        |Show 5         |5                 |
        |Show 10        |10                |
        |Show 25        |25                |
        |Show 50        |50                |

