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


    // Scenario 1
    @Given("^i want to add the imported product Pill$")
    public void iWantToAddTheImportedProductPill() {
        imp.ClickMenuShop();
        imp.ValidatePill();
    }

    @When("^i try to add the product Pill$")
    public void iTryToAddTheProductPill() {
        imp.AddProductPill();
    }

    @Then("^i expect the product pill to be added with the right amount and the product$")
    public void iExpectTheProductToBeAddedWithTheRightAmountAndTheProduct() {
        imp.ValidatePopupProductPill();
    }


    // Scenario 2
    @Given("^i want to add the imported product Boek$")
    public void iWantToAddTheNonImportedProductCD() {
        imp.ClickMenuShop();
        imp.ValidateBoek();
    }

    @When("^i try to add the product Boek$")
    public void iTryToAddTheProductBoek() {
        imp.AddProductBoek();
    }

    @Then("^i expect the product boek to be added with the right amount and the product$")
    public void iExpectTheProductCDToBeAddedWithTheRightAmountAndTheProduct() {
        imp.ValidatePopupProductBoek();
    }


    // Scenario 3
    @Given("^i want to add the selected imported product (.*)$")
    public void iWantToAddTheSelectedImportedProductProduct(String product) {
        imp.ClickMenu("Shop");
        imp.ValidateProduct(product);
    }

    @When("^i try to add the selected imported product (.*)$")
    public void iTryToAddTheImportedProductProduct(String product) {
        imp.AddProduct(product);
    }

    @Then("^i expect the product to be added with the following (.*)$")
    public void iExpectTheProductToBeAddedWithTheFollowingPopup_message(String PopupMessage) {
        imp.ValidatePopupProduct(PopupMessage);
    }

}