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
  "duration": 4273438,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Visit the shoppingcart website",
  "description": "",
  "id": "workflow;visit-the-shoppingcart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i navigate to the shoppingcart website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "i click home",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "i want to see the description of the website",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "i want to see if the Alten logo is visible",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.iNavigateToTheShoppingcartWebsite()"
});
formatter.result({
  "duration": 3759823383,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iClickOnHome()"
});
formatter.result({
  "duration": 230448338,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iWantToSeeTheDescriptionOfTheWebsite()"
});
formatter.result({
  "duration": 57452159,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.iWantToSeeIfTheAltenLogiIsVisible()"
});
formatter.result({
  "duration": 116509738,
  "status": "passed"
});
});