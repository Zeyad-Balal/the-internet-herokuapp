package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    public HoversPage(WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index){

    WebElement figure = (WebElement) driver.findElements(figureBox).get(index - 1); // catch certain figure.
    Actions actions = new Actions(driver); // this class to test any mouse or keyboard movement property -> ex: Hover.
    actions.moveToElement(figure).perform(); // move the Mouse to the figure , perform() is an execution.
    return new FigureCaption(figure.findElement(boxCaption));
}

//Class To check of figure Captions & View profile link...

public class FigureCaption
{
    private WebElement caption;
    private By header = By.tagName("h5");
    private By link = By.tagName("a");
    public FigureCaption(WebElement caption)
    {
        this.caption = caption;
    }

    public boolean isCaptionDisplayed()
    {
        return caption.isDisplayed();
    }
    public String getTitle()
    {
        return caption.findElement(header).getText();
    }

    public String getLink()
    {
        return caption.findElement(link).getAttribute("href");
    }
    public String getLinkText()
    {
        return caption.findElement(link).getText();
    }
}



}

/* Another Approach to access figure Index -> more clear */
//actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img")));
//String xpathIndex = String.format("//*[@id='content']/div/div[%d]/img", index);