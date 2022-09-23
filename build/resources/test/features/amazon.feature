Feature: A new feature for Amazon

  @Test
  Scenario Outline: As a customer, I want to navigate inside the Amazon web site and get the new Alexa.

    Given navigate to amazon web site
    When searches for the <Product>
    And go to the page number 2
    And pick the third element
    Then added to the cart

    Examples:
    |alexa|
    |playstation     |
    | kindle    |
