package entryads;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import base.BaseTests;
import pages.EntryAdPage;

import static org.testng.Assert.*;



public class EntryAdsTests extends BaseTests {

    @Test
    public void testCloseButton() {

        EntryAdPage entryAdPage = homePage.clickEntryAd();
        entryAdPage.closing();
    }

}

