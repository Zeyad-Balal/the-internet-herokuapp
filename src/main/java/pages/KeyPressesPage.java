package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");



    public KeyPressesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //pass the character which will compared with result
    public void enterText(String text)
    {
        driver.findElement(inputField).sendKeys(text);
    }

    // ex. we try to sendKeys a PI (math sign)
    public void enterMultipleKeys()
    {
        enterText(Keys.chord(Keys.ALT +"P" + "=3.14")); // Keys.chord -> used for accept multi KEYS.
    }

    //return every written character -> used in assertion.
    public String getResult()
    {
        return driver.findElement(resultText).getText();
    }

}
