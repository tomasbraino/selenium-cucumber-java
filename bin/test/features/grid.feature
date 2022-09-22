
Feature: Trying new ways to extract data

  Scenario: As a test engineer, I will get the grid data.
    Given navigate to a sample grid
    Then extract the data

  @Test
  Scenario: As a test engineer, I can validate if some web element is displayed
    Given navigate to a sample grid
    Then show the table