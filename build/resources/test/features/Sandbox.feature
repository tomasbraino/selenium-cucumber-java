Feature: Test differents features in a sandbox page

  Scenario: As a test engineer, I try out different actions on a sandbox page
    Given navigate to demoqa
    And   obtain the option selected

    Scenario: As a test engineer, I try to show differents items inside a list
      Given navigate to web page
      When search inside the list
      Then show the text selected
