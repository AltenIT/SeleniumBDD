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
  "duration": 2021705,
  "status": "passed"
});
formatter.before({
  "duration": 2976670784,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "The imported product Boek must be added",
  "description": "",
  "id": "workflow;the-imported-product-boek-must-be-added",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "i want to add the imported product Boek",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "i try to add the product Boek",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "i expect the product boek to be added with the right amount and the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinition.iWantToAddTheNonImportedProductCD()"
});
formatter.result({
  "duration": 419116613,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iTryToAddTheProductBoek()"
});
formatter.result({
  "duration": 123605241,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iExpectTheProductCDToBeAddedWithTheRightAmountAndTheProduct()"
});
formatter.result({
  "duration": 71363103,
  "status": "passed"
});
formatter.after({
  "duration": 136262662,
  "status": "passed"
});
});