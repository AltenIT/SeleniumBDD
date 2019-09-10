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
  "line": 58,
  "name": "The imported products must be deleted and the price must be removed",
  "description": "",
  "id": "workflow;the-imported-products-must-be-deleted-and-the-price-must-be-removed",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 57,
      "name": "@Scenario6"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "i try to add the imported product \u003cproduct\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 60,
  "name": "i try to delete the imported product in rapport",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "i expect the product \u003cimported_product\u003e to be removed",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "i expect the total price to be \u003ctotal_price\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 63,
  "name": "",
  "description": "",
  "id": "workflow;the-imported-products-must-be-deleted-and-the-price-must-be-removed;",
  "rows": [
    {
      "cells": [
        "product",
        "imported_product",
        "total_price"
      ],
      "line": 64,
      "id": "workflow;the-imported-products-must-be-deleted-and-the-price-must-be-removed;;1"
    },
    {
      "cells": [
        "Pill",
        "imported pills",
        "Totaal prijs: 0.00"
      ],
      "line": 65,
      "id": "workflow;the-imported-products-must-be-deleted-and-the-price-must-be-removed;;2"
    },
    {
      "cells": [
        "Parfum",
        "imported Parfume",
        "Totaal prijs: 0.00"
      ],
      "line": 66,
      "id": "workflow;the-imported-products-must-be-deleted-and-the-price-must-be-removed;;3"
    },
    {
      "cells": [
        "Boek",
        "imported Book",
        "Totaal prijs: 0.00"
      ],
      "line": 67,
      "id": "workflow;the-imported-products-must-be-deleted-and-the-price-must-be-removed;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2026948,
  "status": "passed"
});
