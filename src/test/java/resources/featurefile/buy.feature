Feature: Search functionality

  @sanity @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click 'Search Cars' link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should verify the result "<VerifyMessage>" in results
    Examples:
      | make          | model     | location            | price   | VerifyMessage                                          |
      | BMW           | 1 Series  | NSW - All           | $5,000  | 1 BMW 1 Series for Sale under $5,000 in NSW            |
      | Audi          | A4        | NSW - Central Coast | $10,000 | 1 Audi A4 for Sale under $10,000 in Central Coast, NSW |
      | Mercedes-Benz | B180      | NSW - All           | $30,000 | 3 Mercedes-Benz B180s for Sale under $30,000 in NSW    |
      | Honda         | Jazz      | NSW - Hunter        | $20,000 | 2 Honda Jazzs for Sale under $20,000 in Hunter, NSW    |
      | Hyundai       | I20       | ACT - All           | $40,000 | 1 Used Hyundai I20 for Sale under $40,000 in ACT       |
      | Land Rover    | Discovery | NSW - All           | $60,000 | 9 Land Rover Discoverys for Sale under $60,000 in NSW  |

  @regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should verify the result "<VerifyMessage>" in results
    Examples:
      | make         | model     | location          | price   | VerifyMessage                                                |
      | BMW          | 1 Series  | NSW-All           | $25,000 | 31 Used BMW 1 Series for Sale under $25,000 in NSW           |
      | Audi         | A4        | NSW-Central Coast | $30,000 | 28 Used Audi A4s for Sale under $30,000 in Central West, NSW |
      | Mercedes-Ben | A170      | NSW-All           | $40,000 | 2 Used Mercedes-Benz A170s for Sale under $40,000 in NSW     |
      | Honda        | Jazz      | NSW-Hunter        | $20,000 | 2 Used Honda Jazzs for Sale under $20,000 in Hunter, NSW     |
      | Mitsubishi   | Express   | NSW-All           | $60,000 | 5 Used Mitsubishi Express for Sale under $60,000 in NSW      |
      | Land Rover   | Discovery | NSW-All           | $60,000 | 3 Used Land Rover Discoverys for Sale under $50,000 in NSW   |

