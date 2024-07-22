package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin()
    {
        //navigate to the login page. it returns LoginPage();
        LoginPage loginPage = homePage.clickFormAuthentication();
        // set user, password & click login
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =  loginPage.loginClick();
        //we add verification dependency in POMxml file.
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Your username is invalid!");
    }
}
