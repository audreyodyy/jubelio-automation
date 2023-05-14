package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(name = "email")
    public WebElement email;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(tagName = "button")
    public WebElement loginButton;

    @FindBy(className = "app-alert")
    public WebElement alertMessage;

}
