$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Cucumber/workflow.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 3,
  "name": "Workflow",
  "description": "Visit the shoppingcart website",
  "id": "workflow",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3163128,
  "status": "passed"
});
formatter.before({
  "duration": 3179725010,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "The imported product Pill must be added and show the right price, amount, product, imported, the price and the price with tax",
  "description": "",
  "id": "workflow;the-imported-product-pill-must-be-added-and-show-the-right-price,-amount,-product,-imported,-the-price-and-the-price-with-tax",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Scenario4"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "i want to add the imported product Pill",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "i try to add the product Pill",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "i expect the product pill to be added with the right amount and the product",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "i expect to see the amount of product, imported, price and price with tax",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "i want to validate if the total tax is Totaal belasting: 0.55 and the total price is Totaal prijs: 10.64",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.iWantToAddTheImportedProductPill()"
});
formatter.result({
  "duration": 379711200,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iTryToAddTheProductPill()"
});
formatter.result({
  "duration": 112587527,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iExpectTheProductToBeAddedWithTheRightAmountAndTheProduct()"
});
formatter.result({
  "duration": 64607182,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iExpectToSeeTheAmountOfProductImportedPriceAndPriceWithTax()"
});
formatter.result({
  "duration": 252218401,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iWantToValidateIfTheTotalTaxIsPercentAndTheTotalPriceIs()"
});
formatter.result({
  "duration": 89659839,
  "status": "passed"
});
formatter.after({
  "duration": 149088375,
  "status": "passed"
});
});