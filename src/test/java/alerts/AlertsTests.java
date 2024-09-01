package alerts;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.JavaScriptAlertsPage;

public class AlertsTests extends BaseTests {

    //Alerts Buttons
    private By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By triggerConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By triggerPromptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");

    @Test
    public void jsAlertTest()
    {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlerts(triggerAlertButton);
        javaScriptAlertsPage.alert_clickingAccept();
        assertEquals(javaScriptAlertsPage.getResult() , "You successfully clicked an alert" , "Unexpected Result.");
    }

    @Test
    public void confirmAlertTest_accept()
    {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlerts(triggerConfirmButton);
        javaScriptAlertsPage.alert_clickingAccept();
        assertEquals(javaScriptAlertsPage.getResult() , "You clicked: Ok" , "Unexpected Result.");

    }

    @Test
    public void confirmAlertTest_dismiss()
    {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlerts(triggerConfirmButton);
        javaScriptAlertsPage.alert_clickingDismiss();
        assertEquals(javaScriptAlertsPage.getResult() , "You clicked: Cancel", "Unexpected Result.");


    }

    @Test
    public void promptAlertTest_accept()
    {

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlerts(triggerPromptButton);
        javaScriptAlertsPage.sendPrompt("I am a JS prompt");
        String promptText = javaScriptAlertsPage.getPromptText();
        javaScriptAlertsPage.alert_clickingAccept();
        assertEquals(javaScriptAlertsPage.getResult() , "You entered: "+promptText, "Unexpected Result.");

    }
}
