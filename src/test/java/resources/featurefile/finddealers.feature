Feature: Find the dealers and verify

  @smoke @regression
  Scenario Outline: Find the dealers and verify the dealers are in list
    Given I am on car guide homepage
    When  I mouse hover on “buy+sell” link
    And   I click Find a Dealer
    And  I navigate to 'Find a dealer'
    Then I should see the dealers name "<dealersName>" on page
    Examples:
      | dealersName             |
      | 3 Point Motors Epping   |
      | 5 Star Auto             |
      | A & M Car Sales Pty Ltd |
      | A1 MOTORS COMPANY       |
      | ANDREA MOTORI SERVICE   |
      | Action Motors           |