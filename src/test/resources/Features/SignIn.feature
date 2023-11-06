Feature: Being able to sign in with correct credentials

  Background:
    Given clicking the login button

  Scenario: Users should be able to log in successfully after entering correct credentials
    When entering username "supervisor" and password "tek_supervisor"
    And clicking sign in button
    Then user should be directed to customer service portal page and the page header should be "TEK Insurance App"
    
    Scenario Outline: Trying to log in with wrong username
      When entering username "<username>" and password "<password>"
      And clicking sign in button
      Then the error message "<errorMessage>" should be shown
      Examples:
      |username   | password|      errorMessage |
      |wrongUser  |tek_supervisor|User wrongUser not found|
      |supervisor |wrongPass     |Password not matched    |

