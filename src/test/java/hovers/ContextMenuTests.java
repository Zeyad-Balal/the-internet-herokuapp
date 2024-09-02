package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu()
    {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickOnBox();
        String testPopUp = contextMenuPage.getPopUpText();
        contextMenuPage.acceptAlert();
        assertEquals(testPopUp,"You selected a context menu","unexpected result");

    }
}
