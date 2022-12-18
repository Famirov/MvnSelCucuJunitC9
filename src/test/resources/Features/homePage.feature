@regression @homePage
Feature: This feature file will validate Home Page functionality

  Scenario: User should be able to validate main tabs on HRM Homepage
    Given user navigates to HRM Login Page
    When user enters "yoll-student" username
    Then user enters "Bootcamp5#" password
    Then user clicks on login button
    And user should be able to verify account name on HRM Homepage
    And user verifies main tabs on HRM Homepage
