import Pages.SearchOnAmazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC003_SearchOnAmazonSite extends BaseTests{
    @Test
    public void SearchSuccessfull(){
        SearchOnAmazon searchonamazon = new SearchOnAmazon(driver);
        Reporter.log("This test is to search a product on amazon");
        searchonamazon.searchtext("Iphone");
        Reporter.log("searched product is I Phone");
        searchonamazon.clickonbutton();
        Reporter.log("Enter range 400 to 600 dollars");
        searchonamazon.lowandhighprice("400","600");
        searchonamazon.clikongo();
        Reporter.log("searched the products on range");
        searchonamazon.clickonmobilename();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // WebElement text= driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']//span[@aria-hidden='true'][normalize-space()='$324.00']"));
       // String data= text.getText();
       // System.out.println(data);
      //  Assert.assertEquals( data,"$324.00");
    }

}
