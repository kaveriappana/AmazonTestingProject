import Pages.SearchOnAmazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_SearchOnAmazonSite extends BaseTests{
    @Test
    public void SearchSuccessfull(){
        SearchOnAmazon searchonamazon = new SearchOnAmazon(driver);
        searchonamazon.searchtext("Iphone");
        searchonamazon.clickonbutton();
        searchonamazon.lowandhighprice("400","600");
        searchonamazon.clikongo();
        searchonamazon.clickonmobilename();
        WebElement text= driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']//span[@aria-hidden='true'][normalize-space()='$324.00']"));
        String data= text.getText();
        System.out.println(data);
        Assert.assertEquals( data,"$324.00");
    }

}
