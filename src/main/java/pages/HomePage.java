package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import waitStartegiesPages.DynamicLoadingPage;

public class HomePage {
    private WebDriver driver ;




    public HomePage(WebDriver driver)
    {
        this.driver = driver;

    }

    //Generic Method for Links
    private void clickLink (String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

    public ForgetPasswordPage clickForgetPassword()
    {
        clickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }

    public DropDown clickDropDown()
    {
        clickLink("Dropdown");
        return new DropDown(driver);
    }

    public LoginPage clickFormAuthentication()
    {
        //After clicking on this link, load login page & pass the driver for it.
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public HoversPage clickHovers()
    {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clikcKeyPresses()
    {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider()
    {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }



    public JavaScriptAlertsPage clickJavaScriptAlerts()
    {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }


    public FileUploadPage clickFileUpload()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }


    public ContextMenuPage clickContextMenu()
    {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);

    }

    public LargeAndDeepDomPage clickDomPage()
    {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
 public InfiniteScrollPage clickInfiniteScroll()
    {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }








}
