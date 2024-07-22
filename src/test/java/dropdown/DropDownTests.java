package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDown;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOption()
    {
        String option = "Option 1";
        DropDown dropDown = homePage.clickDropDown();
        dropDown.selectFromDropDown("Option 1");
        var selectedOptions = dropDown.getSelectOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect Selections Number");
        assertTrue(selectedOptions.contains(option),"option not selected");
    }
}
