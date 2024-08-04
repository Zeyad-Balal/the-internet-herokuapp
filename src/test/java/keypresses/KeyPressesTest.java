package keypresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;
import static org.testng.Assert.*;

public class KeyPressesTest extends BaseTests {


    @Test
    public void testBackSpace()
    {
        KeyPressesPage keyPressesPage = homePage.clikcKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE");
    }

    @Test
    public void testPi()
    {
        KeyPressesPage keyPressesPage = homePage.clikcKeyPresses();
        keyPressesPage.enterMultipleKeys();

    }
}
