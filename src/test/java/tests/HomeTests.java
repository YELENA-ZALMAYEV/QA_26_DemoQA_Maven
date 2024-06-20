package tests;

import manager.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTests extends ApplicationManager {

    @Test
    public void test(){
        HomePage homePge = new HomePage(getDriver());
    }
}
