Feature: Try the google search functionality

  Scenario: looking for something in google
    Given navigate to google
    When looking for something
    And click on the search button
    Then obtain the output