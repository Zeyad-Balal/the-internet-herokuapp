package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver;
    public EmailSentPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getAlertText()
    {
        return driver.findElement(By.xpath("/html/body/h1")).getText();
    }

}
