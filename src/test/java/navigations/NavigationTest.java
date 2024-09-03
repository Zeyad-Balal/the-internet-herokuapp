package navigations;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;


public class NavigationTest extends BaseTests {
    @Test
    public void testNavigators()
    {
        homePage.clickMultiWindows().clickHere();
        getWindowManager().switchTab("New Window");

    }
}
