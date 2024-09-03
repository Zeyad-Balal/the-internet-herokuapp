package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    //this interface we'll use its methods in upcoming implemented functions.
    private WebDriver.Navigation navigation;

    public  WindowManager (WebDriver driver)
    {this.driver = driver;}

    public void goBack() {navigation.back();} // prev page
    public void goForward() {navigation.forward();} // next page
    public void refreshPage() {navigation.refresh();} // refreshing - reload
    public void goToUrl(String url) {navigation.to(url);} // going to a specific url.


    public void switchTab(String tabTitle)
    {
        var windows = driver.getWindowHandles();
        System.out.println("number of tabs "+windows.size());
        System.out.println("Window Handles: ");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window " + window);
            driver.switchTo().window(window);
            System.out.println("current window is " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())) break;
        }
    }


}
