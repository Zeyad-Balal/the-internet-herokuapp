package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryAdPage {

    private WebDriver driver;
    WebElement restartAd = driver.findElement(By.id("restart-ad"));

    //pop up ad view modal
     WebElement adModal = driver.findElement(By.className("modal"));
    //pop up close button
    WebElement closeButton = driver.findElement(By.cssSelector("#modal > div.modal > div.modal-footer > p"));

    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }


    public void closing()
    {
        if(adModal.isDisplayed())
        {
            closeButton.click();

        }

        else restartAd.click();
    }

}
