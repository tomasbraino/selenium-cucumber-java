@Grid
Feature: Trying new ways to extract data

  Rule The user can return values from the table and validate them.

  Background:
    Given navigate to a sample grid

@Smoke @Regression
  Scenario: As a test engineer, I will get the grid data.
    Then extract the data

  @Regression
  Scenario: As a test engineer, I can validate if some web element is displayed
    Then show the table