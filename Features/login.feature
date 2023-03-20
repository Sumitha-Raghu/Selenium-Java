Feature: feature to test login functionality

  Scenario: Validate login function is working
    Given user tries to login
    And user is on the login page
    When user enters username and password
    And hits enter
    Then user is navigated to the page