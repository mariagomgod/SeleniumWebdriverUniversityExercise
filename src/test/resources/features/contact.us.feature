Feature: Our Contact Form
  As a user I want to accede to Our Contact Form

  Scenario: User is able to interact with Our Contact Form
    Given I go to main page
    When I click on Our Contact Link
    And I fill the form
    And I click the submit button
    Then a message is displayed
