@regression @login
Feature: This feature file will validate Login Page functionality

  /**We are moving (Given user navigates to HRM Login Page) step from all test cases
  we can not put parametrized ("yoll-student", "Bootcamp5#") steps and the following steps
  because (Then user clicks on login button), (And user should be able to verify account name on HRM Homepage)
  because that steps depends on parametrized steps and need to follow the sequence*/
  Background:
    Given user navigates to HRM Login Page

  @smoke @positive
  Scenario: User should be able to verify successful login with valid credentials

    When user enters "yoll-student" username
    Then user enters "Bootcamp5#" password
    Then user clicks on login button
    And user should be able to verify account name on HRM Homepage

#  @negative
#  Scenario: User should not be able to login with invalid credentials
#    Given user navigates to HRM Login Page
#    When user enters "invalidUsername" username
#    Then user enters "invalidPwd" password
#    Then user clicks on login button
#    And user validates "Invalid credentials" error message
#
#  @negative
#  Scenario: User should not be able to login with empty username
#    Given user navigates to HRM Login Page
#    When user enters "" username
#    Then user enters "invalidPwd" password
#    Then user clicks on login button
#    And user validates "Username cannot be empty" error message
#
#  @negative
#  Scenario: User should not be able to login with empty password
#    Given user navigates to HRM Login Page
#    When user enters "invalidUsername" username
#    Then user enters "" password
#    Then user clicks on login button
#    And user validates "Password cannot be empty" error message
#
#  @negative
#  Scenario: User should not be able to login with empty username and password
#    Given user navigates to HRM Login Page
#    When user enters "" username
#    Then user enters "" password
#    Then user clicks on login button
#    And user validates "Username cannot be empty" error message

  @negative
  Scenario Outline: User should not be able to login with invalid credentials
    When user enters "<username>" username
    Then user enters "<password>" password
    Then user clicks on login button
    And user validates "<errorMessage>" error message

    Examples:
      | username        | password   | errorMessage             |
      | invalidUsername | invalidPwd | Invalid credentials      |
      |                 | invalidPwd | Username cannot be empty |
      | invalidUsername |            | Password cannot be empty |
      |                 |            | Username and Password cannot be empty |
