@Smoke
Feature: Being able to create a new account and get an error when trying to do so with an existing email address



    Scenario: Users should be able to create new account after entering necessary information
      Given clicking the create primary account button
      And filling out the necessary information
      When clicking the create account button
      Then the entered email address should be visible
      And creating username and password
      And clicking submit
      Then user should be directed to sign in page

      Scenario: Users should get and error when trying to create a new account with an existing email address
        Given clicking the create primary account button
        And filling out the form and entering an existing email address
        When clicking the create account button
        Then the error message "Account with email john@something.com is exist" should be shown


