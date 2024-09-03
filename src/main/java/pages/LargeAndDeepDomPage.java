package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By table = By.id("large-table");


    public LargeAndDeepDomPage (WebDriver driver)
    {
        this.driver = driver;
    }

    //To make scrolling we use JS, web driver can't handle it alone.
    public void scrolling()
    {
        WebElement tableElement = driver.findElement(table);
        String jsScrollingScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScrollingScript,tableElement);
    }
}
