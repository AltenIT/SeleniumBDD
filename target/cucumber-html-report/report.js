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
  "duration": 1862567,
  "status": "passed"
});
formatter.before({
  "duration": 5233620801,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "The imported product Pill must be added",
  "description": "",
  "id": "workflow;the-imported-product-pill-must-be-added",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "i want to add the imported product Pill",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "i try to add the product Pill",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "i expect the product pill to be added with the right amount and the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinition.iWantToAddTheImportedProductPill()"
});
formatter.result({
  "duration": 523077454,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iTryToAddTheProductPill()"
});
formatter.result({
  "duration": 137473215,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iExpectTheProductToBeAddedWithTheRightAmountAndTheProduct()"
});
formatter.result({
  "duration": 72755151,
  "status": "passed"
});
formatter.after({
  "duration": 231637436,
  "status": "passed"
});
});