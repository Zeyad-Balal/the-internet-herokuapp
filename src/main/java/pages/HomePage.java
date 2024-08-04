package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
public class HomePage {
    private WebDriver driver ;




    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        //clickFormAuthentication();
    }

    //Generic Method for Links
    private void clickLink (String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

    public ForgetPasswordPage clickForgetPassword()
    {
        clickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }

    public DropDown clickDropDown()
    {
        clickLink("Dropdown");
        return new DropDown(driver);
    }

    public LoginPage clickFormAuthentication()
    {
        //After clicking on this link, load login page & pass the driver for it.
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public HoversPage clickHovers()
    {
        clickLink("Hovers");
        return new HoversPage(driver);
    }






}
