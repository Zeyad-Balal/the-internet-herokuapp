package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;
import static org.testng.Assert.*;

public class HoversTests extends BaseTests {

    @Test
    public void testUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption Not Displayed");
        assertEquals(caption.getTitle(),"name: user1","Incorrect user");
        assertEquals(caption.getLinkText(),"View profile","Incorrect link text");


    }
}
