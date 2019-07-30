# SeleniumBDD
Selenium BDD framework. The BDD steps definitions must be added and implemented with Selenium Webdriver.
The browser driver should be added in order to interact with the browser. This can be downloaded on the following link: https://chromedriver.storage.googleapis.com/index.html?path=2.26/

Required plugin in IntelliJ
- Cucumber for Java
- Cucumber

The framework can be run by Maven.

Syntax:
- mvn test

Or specify the scenario to be execute
- mvn test -Dcucumber.options="--tags @Scenario1"
