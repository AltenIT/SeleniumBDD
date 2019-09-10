# language: en

Feature: Workflow
  Visit the shoppingcart website

  @ScenarioExample
  Scenario: Visit the shoppingcart website
    Given i navigate to the shoppingcart website
    When i click home
    Then i want to see the description of the website
    And i want to see if the Alten logo is visible

  @Scenario1
  Scenario: The imported product Pill must be added
    Given i want to add the imported product Pill
    When i try to add the product Pill
    Then i expect the product pill to be added with the right amount and the product

  @Scenario2
  Scenario: The imported product Boek must be added
    Given i want to add the imported product Boek
    When i try to add the product Boek
    Then i expect the product boek to be added with the right amount and the product