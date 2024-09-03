package base;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import pages.HomePage;
import org.testng.annotations.*;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }


    @AfterMethod
    public void takeScreenShot()
    {
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot taken "+ screenshot.getAbsolutePath());
        try{Files.move(screenshot , new File("resources/screenshots/test.png"));}
        catch(IOException e) {e.printStackTrace();}
    }

    //for failed tests
    @AfterMethod
    public void testFailureRecord(ITestResult result)
    {
        if(ITestResult.FAILURE == result.getStatus())
        {    var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            System.out.println("Screenshot taken "+ screenshot.getAbsolutePath());
            try{Files.move(screenshot , new File("resources/screenshots/"+result.getName()+".png"));}
            catch(IOException e) {e.printStackTrace();}}

    }

    public WindowManager getWindowManager()
    {
        return new WindowManager(driver);
    }

}
