@Test
Feature: Test differents features in a sandbox page

  Scenario: As a test engineer, I try out different actions on a sandbox page
    Given navigate to demoqa
    When  i click on the dropdown
    Then  the dropdown show me the options
    And   obtain the option selected