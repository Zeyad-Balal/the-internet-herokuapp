package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");


    public InfiniteScrollPage(WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     * Scrolls till paragraph with a certain index appear in view
     * @param index 1-based
     */

    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        var jsExe = (JavascriptExecutor)driver;
        while (getParagraphsNo() < index)
        {
            jsExe.executeScript(script);
        }
    }

    public int getParagraphsNo()
    {
        return driver.findElements(textBlocks).size();
    }

}
