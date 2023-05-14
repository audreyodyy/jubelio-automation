package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.LoginPage;
import utils.HelperClass;

public class Hooks {
    @Before
    public static void setUp() {
        HelperClass.setUpDriver();
    }

}
