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


    // Scenario 4
    @When("^i try to add the product$")
    public void iTryToAddTheProduct1() {
        imp.AddProduct("product_pill_toevoegen");
    }

    @And("^i expect to see the amount of product, imported, price and price with tax$")
    public void iExpectToSeeTheAmountOfProductImportedPriceAndPriceWithTax() {
        imp.ClickMenu("Rapport");
        imp.ValidateRapportItemAantal(1, "1");
        imp.ValidateRapportItemProduct(1, "imported pills");
        imp.ValidateRapportItemImport(1, "true");
        imp.ValidateRapportItemPrijs(1,"10.09");
        imp.ValidateRapportItemPrijsMetBelasting(1, "10.64");
    }

//    @And("i want to validate if the total tax is Totaal belasting: 0.55 and the total price is Totaal prijs: 10.64$")
//    public void iWantToValidateIfTheTotalTaxIsPercentAndTheTotalPriceIs() {
//        imp.Totaltax("Totaal belasting: 0.55");
//        imp.Totalprice("Totaal prijs: 10.64");
//    }

    // Scenario 5
    @And("^i expect to see on the line (.*) the amount (.*) of product, the description (.*), imported (.*), price (.*), price with tax (.*), total tax (.*) and total price (.*)$")
    public void iExpectToSeeOnTheLineLineTheAmountAmountOfProductTheDescriptionProduct_descriptionImportedImportedPricePricePriceWithTaxPrice_with_taxTotalTaxTotal_taxAndTotalPriceTotal_price(int line, String amount, String product_description, String imported, String price, String price_with_tax, String total_tax, String total_price) {
        imp.ClickMenu("Rapport");
        imp.ValidateRapportItemAantal(line, amount);
        imp.ValidateRapportItemProduct(line, product_description);
        imp.ValidateRapportItemImport(line, "true");
        imp.ValidateRapportItemPrijs(line, price);
        imp.ValidateRapportItemPrijsMetBelasting(line, price_with_tax);
    }

    @And("^i want to validate if the total tax is (.*) and the total price is (.*)$")
    public void iWantToValidateIfTheTotalTaxIsTotaal_taxAndTheTotalPriceIsTotaal_price(String totaal_tax, String total_price) {
        imp.Totaltax(totaal_tax);
        imp.Totalprice(total_price);
    }

    // Scenario 6
    @Given("^i try to add the imported product (.*)$")
    public void iTryToAddTheImportedProduct(String product) {
        imp.ClickMenu("Shop");
        imp.AddProduct(product);
    }

    @When("^i try to delete the imported product in rapport$")
    public void iTryToDeleteTheImportedProductImported_prodcutInRapport() {
        imp.ClickMenu("Rapport");
        imp.DeleteProduct();
    }

    @Then("^i expect the product (.*) to be removed$")
    public void iExpectTheProductImported_productToBeRemoved(String product) {
        imp.ValidateRemovedItem(product);
    }

    @And("^i expect the total price to be (.*)$")
    public void iExpectTheTotalPriceToBeTotal_price(String price) {
        imp.Totalprice(price);
    }
}