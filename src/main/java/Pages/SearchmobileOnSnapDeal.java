package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchmobileOnSnapDeal {
    private WebDriver driver;

    private By searchbox = By.cssSelector("input[placeholder=\"Search products & brands\"]");
    private By button =By.cssSelector("onclick=\"submitSearchForm('go_header');\"");
    private By from =By.cssSelector("name=\"fromVal\"");
    private By to =By.cssSelector("input[name=\"toVal\"]");
    private  By go =By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']");


    public void search(String mobile){
        driver.findElement(searchbox).sendKeys(mobile);
        driver.findElement(button).click();

    }
    public void inputrange(String value, String value2){
       WebElement val1= driver.findElement(from);
       val1.clear();
       val1.sendKeys(value);
       WebElement val2= driver.findElement(to);
       val2.clear();
       val2.sendKeys(value2);
       driver.findElement(go).click();




    }
}
