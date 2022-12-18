@regression @iFrame
Feature: This feature file will validate Alert Page functionality

  @run
  Scenario: User should be able to enter a keyword into the text box on iFrames Page
    Given user navigates to iFrames Page
    When user enters a keyword into the text box on iFrames Page
    Then user should be able to verify entered Page