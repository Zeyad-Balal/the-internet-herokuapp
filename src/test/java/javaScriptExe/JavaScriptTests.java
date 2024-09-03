package javaScriptExe;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeAndDeepDomPage;

public class JavaScriptTests extends BaseTests {

    @Test
    public void tetsJsScrolling()
    {
        homePage.clickDomPage().scrolling();
    }
    @Test
    public void testInfiniteScroll()
    {
        homePage.clickInfiniteScroll().scrollToParagraph(5) ;
    }
}
