package actions;

import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utils.HelperClass;

public class LoginPageAction {

    LoginPage loginPage = null;

    public LoginPageAction() {
        this.loginPage = new LoginPage();
        PageFactory.initElements(HelperClass.getDriver(), loginPage);
    }
    // Set username in email field
    public void setEmail(String email) {
        loginPage.email.sendKeys(email);
    }

    // Set password in password field
    public void setPassword(String password) {
        loginPage.password.sendKeys(password);
    }

    // Click on login button
    public void clickLogin() {
        loginPage.loginButton.click();
    }

    public String getAlertMessage() {
        return loginPage.alertMessage.getText();
    }

    public void login(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
        this.clickLogin();
    }

}
