Feature: Our Products Menu
  As a user I want to see the products offers

  Scenario: User is able to interact with the products offers
    Given I go to main page
    When I click on Our Products Menu
    Then I see the products
    When I click on a product
    Then I see the offer modal
    When I click on the Proceed button
    Then I don't see the offer modal