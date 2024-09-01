package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload()
    {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();

        //NOTE: in java using double backslash to avoid illegal characters error
        fileUploadPage.uploadFile("C:\\Users\\hp\\Desktop\\Resume\\Zeyad Hassan Abd Al-Halim.pdf");
        assertEquals(fileUploadPage.getFileUploaded(),"Zeyad Hassan Abd Al-Halim.pdf","unexpected file");
    }
}
