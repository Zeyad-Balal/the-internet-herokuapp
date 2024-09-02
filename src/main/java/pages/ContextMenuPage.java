package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By box = By.id("hot-spot");
    private By body = By.className("example");


    public ContextMenuPage(WebDriver driver){
        this.driver = driver;

    }

    public void rightClickOnBox()
    {
        Actions actions = new Actions(driver);
        WebElement contextMenu = (WebElement) driver.findElement(box);
        actions.contextClick(contextMenu).perform();

    }

    //Click OK on Alert.
    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }



    //Test on Assertion at test class
    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }







}
