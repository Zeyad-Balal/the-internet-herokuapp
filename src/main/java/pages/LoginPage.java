package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //catch elements..
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    //username writing
    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    //password writing
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }


    public SecureAreaPage loginClick()
    {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }



}
