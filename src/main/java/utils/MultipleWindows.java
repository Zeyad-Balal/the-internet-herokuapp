package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindows {

    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");

    public MultipleWindows (WebDriver driver)
    {this.driver = driver;}

    public void clickHere()
    {driver.findElement(clickHereLink).click();}


}
