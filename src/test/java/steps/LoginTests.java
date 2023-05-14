package steps;

import actions.HomePageAction;
import actions.LoginPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.HelperClass;

public class LoginTests {
    LoginPageAction objLogin = new LoginPageAction();
    HomePageAction objHome = new HomePageAction();
    @Given("User opens Jubelio website page {string}")
    public void userOpensJubelioWebsitePage(String url) {
        HelperClass.openPage(url);
    }


    @When("User input valid {string} and {string}")
    public void userInputValidAnd(String email, String password) {
        objLogin.login(email, password);
    }

    @Then("User redirected to homepage")
    public void userRedirectedToHomePage() {
        Assert.assertTrue(objHome.getWelcomeText().contains("Selamat Datang"));
    }

    @When("User input invalid {string} and {string}")
    public void userInputInvalidAnd(String email, String password) {
        objLogin.login(email, password);
    }

    @Then("User should got error message")
    public void userShouldGotErrorMessage() {
        Assert.assertTrue(objLogin.getAlertMessage().contains("Format Email tidak valid."));
    }
}
