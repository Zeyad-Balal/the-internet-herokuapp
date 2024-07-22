package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDown {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropDown (WebDriver driver) {
        this.driver = driver;
    }

    private Select findDropDownElement()
    {
        //Select Class -> get the dropdown list itself then apply on it a methods.
        return new Select(driver.findElement(dropDown));
    }


   public void selectFromDropDown (String option)
   {
       findDropDownElement().selectByVisibleText(option);
   }

   public List<String> getSelectOptions()
   {
       List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
       return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
   }


}
