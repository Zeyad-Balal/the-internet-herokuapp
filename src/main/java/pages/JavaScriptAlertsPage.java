package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;

    //Result of Alert Clicking.
    private By results = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //click on a button
    public void triggerAlerts(By button)
    {
        driver.findElement(button).click();
    }

    //click OK inside the alert pop up message.
    public void alert_clickingAccept()
    {
        driver.switchTo().alert().accept();
    }

    //click CANCEL inside the alert pop up message.
    public void alert_clickingDismiss()
    {
        driver.switchTo().alert().dismiss();
    }

    //sending prompt in alert message.
    public void sendPrompt(String prompt)
    {
        driver.switchTo().alert().sendKeys(prompt);
    }

    //get prompt text that user write in the alert message.
    public String getPromptText()
    {
        return driver.switchTo().alert().getText();
    }

    //get results text to check validations
    public String getResult()
    {
        return driver.findElement(results).getText();
    }


}
