import Pages.SearchOnSelected;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class TC004_SearchOnSelected extends BaseTests{
    @Test
    public void searchonpreffered(){

        Reporter.log("This is to search on amazon application");
        SearchOnSelected searchonselected = new SearchOnSelected(driver);
        searchonselected.searchindropdown();
        searchonselected.entertextinsearch("hplaptop");
        Reporter.log("enter searched product is hp laptop");
        searchonselected.clickonsearch();
        searchonselected.clickcheckbox();
        searchonselected.enterlowandhighprice("100","200");
        Reporter.log("The searched product price is in the range of 100 to 200 dollars");
        searchonselected.clickgobutton();
        searchonselected.clicktext();
        Reporter.log("product searched successfully");
//        searchonselected.clicklink();
//        searchonselected.selectlaptop();


    }
}
