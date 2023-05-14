package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/h1")
    public WebElement welcomeWord;
}
