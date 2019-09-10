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

  @Scenario3
  Scenario Outline: All of the imported product must be added and must show the right product and price
    Given i want to add the selected imported product <product>
    When i try to add the selected imported product <product>
    Then i expect the product to be added with the following <popup_message>
    Examples:
      | product | popup_message                               |
      |  Pill   | 1 Geïmporteerde Pill ter waarde van 10.09   |
      |  Parfum | 1 Geïmporteerde Parfum ter waarde van 50.55 |
      |  Boek   | 1 Geïmporteerde boek ter waarde van 21.27   |

  @Scenario4
  Scenario: The imported product Pill must be added and show the right price, amount, product, imported, the price and the price with tax
    Given i want to add the imported product Pill
    When i try to add the product Pill
    Then i expect the product pill to be added with the right amount and the product
    And i expect to see the amount of product, imported, price and price with tax
    And i want to validate if the total tax is Totaal belasting: 0.55 and the total price is Totaal prijs: 10.64

  @Scenario5
  Scenario Outline: All of the imported product must be added and must show the right price, amount, product, imported, the price and the price with tax
    Given i want to add the selected imported product <product>
    When i try to add the selected imported product <product>
    Then i expect the product to be added with the following <popup_message>
    And i expect to see on the line <line> the amount <amount> of product, the description <product_description>, imported <imported>, price <price>, price with tax <price_with_tax>, total tax <total_tax> and total price <total_price>
    And i want to validate if the total tax is <total_tax> and the total price is <total_price>
    Examples:
      | product | popup_message                               | product_description| line | amount | imported | price  | price_with_tax |  total_tax                  | total_price               |
      |  Pill   | 1 Geïmporteerde Pill ter waarde van 10.09   |    imported pills  |   1  |    1   |   true   |  10.09 |     10.64      |  Totaal belasting: 0.55     | Totaal prijs: 10.64       |
      |  Parfum | 1 Geïmporteerde Parfum ter waarde van 50.55 |   imported Perfume |   1  |    1   |   true   |  50.55 |     58.14      |  Totaal belasting: 7.59     | Totaal prijs: 58.14       |
      |  Boek   | 1 Geïmporteerde boek ter waarde van 21.27   |   imported Book    |   1  |    1   |   true   |  21.27 |     22.37      |  Totaal belasting: 1.10     | Totaal prijs: 22.37       |
