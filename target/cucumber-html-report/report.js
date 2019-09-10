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
formatter.scenarioOutline({
  "line": 26,
  "name": "All of the imported product must be added and must show the right product and price",
  "description": "",
  "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 25,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "i want to add the selected imported product \u003cproduct\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "i try to add the selected imported product \u003cproduct\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "i expect the product to be added with the following \u003cpopup_message\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price;",
  "rows": [
    {
      "cells": [
        "product",
        "popup_message"
      ],
      "line": 31,
      "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price;;1"
    },
    {
      "cells": [
        "Pill",
        "1 Geïmporteerde Pill ter waarde van 10.09"
      ],
      "line": 32,
      "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price;;2"
    },
    {
      "cells": [
        "Parfum",
        "1 Geïmporteerde Parfum ter waarde van 50.55"
      ],
      "line": 33,
      "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price;;3"
    },
    {
      "cells": [
        "Boek",
        "1 Geïmporteerde boek ter waarde van 21.27"
      ],
      "line": 34,
      "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2011895,
  "status": "passed"
});
formatter.before({
  "duration": 4059827858,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "All of the imported product must be added and must show the right product and price",
  "description": "",
  "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 25,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "i want to add the selected imported product Pill",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "i try to add the selected imported product Pill",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "i expect the product to be added with the following 1 Geïmporteerde Pill ter waarde van 10.09",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Pill",
      "offset": 44
    }
  ],
  "location": "StepsDefinition.iWantToAddTheSelectedImportedProductProduct(String)"
});
formatter.result({
  "duration": 405032858,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pill",
      "offset": 43
    }
  ],
  "location": "StepsDefinition.iTryToAddTheImportedProductProduct(String)"
});
formatter.result({
  "duration": 161330961,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Geïmporteerde Pill ter waarde van 10.09",
      "offset": 52
    }
  ],
  "location": "StepsDefinition.iExpectTheProductToBeAddedWithTheFollowingPopup_message(String)"
});
formatter.result({
  "duration": 84377000,
  "status": "passed"
});
formatter.after({
  "duration": 149441850,
  "status": "passed"
});
formatter.before({
  "duration": 141695,
  "status": "passed"
});
formatter.before({
  "duration": 2047895557,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "All of the imported product must be added and must show the right product and price",
  "description": "",
  "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 25,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "i want to add the selected imported product Parfum",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "i try to add the selected imported product Parfum",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "i expect the product to be added with the following 1 Geïmporteerde Parfum ter waarde van 50.55",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Parfum",
      "offset": 44
    }
  ],
  "location": "StepsDefinition.iWantToAddTheSelectedImportedProductProduct(String)"
});
formatter.result({
  "duration": 244350507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Parfum",
      "offset": 43
    }
  ],
  "location": "StepsDefinition.iTryToAddTheImportedProductProduct(String)"
});
formatter.result({
  "duration": 146201186,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Geïmporteerde Parfum ter waarde van 50.55",
      "offset": 52
    }
  ],
  "location": "StepsDefinition.iExpectTheProductToBeAddedWithTheFollowingPopup_message(String)"
});
formatter.result({
  "duration": 89328771,
  "status": "passed"
});
formatter.after({
  "duration": 130163429,
  "status": "passed"
});
formatter.before({
  "duration": 30513,
  "status": "passed"
});
formatter.before({
  "duration": 1977083117,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "All of the imported product must be added and must show the right product and price",
  "description": "",
  "id": "workflow;all-of-the-imported-product-must-be-added-and-must-show-the-right-product-and-price;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 25,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "i want to add the selected imported product Boek",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "i try to add the selected imported product Boek",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "i expect the product to be added with the following 1 Geïmporteerde boek ter waarde van 21.27",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Boek",
      "offset": 44
    }
  ],
  "location": "StepsDefinition.iWantToAddTheSelectedImportedProductProduct(String)"
});
formatter.result({
  "duration": 257451001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Boek",
      "offset": 43
    }
  ],
  "location": "StepsDefinition.iTryToAddTheImportedProductProduct(String)"
});
formatter.result({
  "duration": 100128761,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Geïmporteerde boek ter waarde van 21.27",
      "offset": 52
    }
  ],
  "location": "StepsDefinition.iExpectTheProductToBeAddedWithTheFollowingPopup_message(String)"
});
formatter.result({
  "duration": 59730646,
  "status": "passed"
});
formatter.after({
  "duration": 142250967,
  "status": "passed"
});
});