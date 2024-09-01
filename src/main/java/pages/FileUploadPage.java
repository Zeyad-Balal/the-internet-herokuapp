package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    //in next page after upload.
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver)
    {
        this.driver = driver;
    }


    //pass file need to upload path.
    public void uploadFile(String absolutePathFile)
    {
        driver.findElement(inputField).sendKeys(absolutePathFile);
        clickUploadButton();
    }

    //click on upload button.
    public void clickUploadButton()
    {
        driver.findElement(uploadButton).click();
    }

    //get file uploaded name for assertion.
    public String getFileUploaded()
    {
        return driver.findElement(uploadedFiles).getText();
    }

}
