package StepsDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nl.alten.main.ImplementationTest;

public class StepsDefinition {
    ImplementationTest imp;

    @Before(order = 1)
    public void initialize() {
        imp = new ImplementationTest();
    }

    @Before(order = 2)
    @Given("^i navigate to the shoppingcart website$")
    public void iNavigateToTheShoppingcartWebsite() {
        imp.OpenShoppingCart();
    }

    @After
    public void closeBrowser() {
        imp.CloseShoppingCart();
    }


    // @ScenarioExample
    @When("^i click home$")
    public void iClickOnHome() {
        imp.ClickMenuHome();
    }

    @Then("^i want to see the description of the website$")
    public void iWantToSeeTheDescriptionOfTheWebsite() {
        imp.ValidateText("ShoppingCart Application");
    }

    @And("^i want to see if the Alten logo is visible$")
    public void iWantToSeeIfTheAltenLogiIsVisible() {
        imp.ValidateAltenLogo();
    }
}