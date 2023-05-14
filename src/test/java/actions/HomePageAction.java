package actions;

import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import utils.HelperClass;

public class HomePageAction {
    HomePage homePage = null;

    public HomePageAction() {
        this.homePage = new HomePage();
        PageFactory.initElements(HelperClass.getDriver(), homePage);
    }

    public String getWelcomeText() {
        return homePage.welcomeWord.getText();
    }
}
