package waitStartegiesPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class DynamicLoadingEx1 {
    private WebDriver driver;
    private By startButton = By.xpath("//*[@id=\"start\"]/button");
    private By loadingIndicator = By.id("loading");
    private By loadingText = By.id("finish");

    public DynamicLoadingEx1(WebDriver driver)
    {
        this.driver  = driver;
    }

    public void clickStart()
    {
        driver.findElement(startButton).click();
        //Explicit Wait.
        //WebDriverWait wait = new WebDriverWait(driver,5);
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        //Fluent Wait.
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadingText()
    {
        return driver.findElement(loadingText).getText();
    }
}
