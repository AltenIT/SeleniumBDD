package StepsDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import nl.alten.main.ImplementationTest;

public class StepsDefinition {
    ImplementationTest imp;

    @Before
    public void initialize() {
        imp = new ImplementationTest();
    }

    @Given("^i navigate to the shoppingcart website$")
    public void iNavigateToTheShoppingcartWebsite() {
        imp.OpenShoppingCart();
    }

    @When("^i click home$")
    public void iClickOnHome() {
        imp.ClickHome();
    }

    @Then("^i want to see the description of the website$")
    public void iWantToSeeTheDescriptionOfTheWebsite() {
        By DescriptionElement = By.xpath("//*[@id='mainSection']/ng-view/header/h1");
        imp.ValidateText(DescriptionElement, "ShoppingCart Application");
    }

    @And("^i want to see if the Alten logo is visible$")
    public void iWantToSeeIfTheAltenLogiIsVisible() {
        imp.ValidateAltenLogo();
    }
}
