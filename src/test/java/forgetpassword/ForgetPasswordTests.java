package forgetpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgetPasswordPage;
import static org.testng.Assert.*;

public class ForgetPasswordTests extends BaseTests {

    @Test
    public void testInternalServerError()
    {
        ForgetPasswordPage forgetPasswordPage = homePage.clickForgetPassword(); // pass driver to Forger Page
        forgetPasswordPage.setEmail("zeyad.hassan.balal@gmail.com");
        EmailSentPage emailSentPage = forgetPasswordPage.clickRetrieve(); // pass driver to Email Sent Page

        //check on The Retrieved Text.
        assertTrue(emailSentPage.getAlertText().contains("Internal Server Error"),"No Internal Server Error");

    }
}
