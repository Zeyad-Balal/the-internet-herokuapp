package dynamicLoading_waits;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import waitStartegiesPages.DynamicLoadingEx1;
import waitStartegiesPages.DynamicLoadingPage;

public class WaitTests extends BaseTests {

    @Test
    public void testUntilHidden(){
        var dynamicLoadingPage = homePage.clickDynamicLoading().clickEx1();
        dynamicLoadingPage.clickStart();
        assertEquals(dynamicLoadingPage.getLoadingText(), "Hello World!", "X");


    }
}
