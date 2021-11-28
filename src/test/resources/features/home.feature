Feature: Home Menu
  As a user I want to see the Welcome modal

  Scenario: User is able to interact with the Welcome modal
    Given I go to main page
    When I click on the Find Out More button
    Then I see the Welcome modal
    When I click on the Close button
    Then I don't see the Welcome modal