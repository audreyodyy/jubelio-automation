package steps;

import actions.InventoryPageAction;
import actions.LoginPageAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperClass;

public class InventoryTests {
    LoginPageAction objLogin = new LoginPageAction();
    InventoryPageAction objInventory = new InventoryPageAction();
    @Given("the user is already login")
    public void theUserIsAlreadyLogin() {
        HelperClass.openPage("https://app.jubelio.com/login");
        objLogin.login("qa.rakamin.jubelio@gmail.com", "Jubelio123!");
    }

    @Given("the user on the inventory page")
    public void theUserOnTheInventoryPage() {
        HelperClass.openPage("https://app.jubelio.com/home/inventory");
    }

    @When("the user clicks on Edit inventory button")
    public void theUserClicksOnEditInventoryButton() {
        objInventory.clickEditInventory();
    }

    @And("the user input {string}, {string}, and {string}")
    public void theUserInputAnd(String itemName, String quantity, String price) {
        objInventory.editInventory(itemName, quantity, price);
    }

    @And("the user clicks save button")
    public void theUserClicksSaveButton() {
        objInventory.clickSaveButton();
    }

    @Then("the inventory is successfully edited")
    public void theInventoryIsSuccessfullyEdited() {
        System.out.println("Sukses Tersimpan");
    }
}
