package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");

    public ForgetPasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }
    public EmailSentPage clickRetrieve()
    {
        driver.findElement(retrieveButton).click();
        return new EmailSentPage(driver);
    }

}
