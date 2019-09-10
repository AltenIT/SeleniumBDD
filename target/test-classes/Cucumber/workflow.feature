# language: en

Feature: Workflow
  Visit the shoppingcart website

  @ScenarioExample
  Scenario: Visit the shoppingcart website
    Given i navigate to the shoppingcart website
    When i click home
    Then i want to see the description of the website
    And i want to see if the Alten logo is visible