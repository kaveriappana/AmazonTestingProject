package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public class SearchOnAmazon {
    WebDriver driver;
    private By searchtext = By.cssSelector("input[placeholder='Search Amazon']");
    private By button = By.cssSelector("span[id='nav-search-submit-text']");
    private  By value1 =By.cssSelector("input[id='low-price']");
    private By value2 =By.cssSelector("input[id='high-price']");
    private By gobutton =By.cssSelector("input[aria-labelledby='a-autoid-1-announce']");

    private By link =By.linkText("Apple iPhone 12 Mini, 128GB, Black - Unlocked (Renewed)");

    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("LoginPage.class");
    public SearchOnAmazon(WebDriver driver)
    {
        this.driver = driver;
    }
   // Logger logger = Logger.getLogger("SearchOnAmazon.class");

    public void searchtext(String text){
        logger.info("Enter searching product");
        driver.findElement(searchtext).sendKeys(text);

    }
    public void clickonbutton(){
        logger.info("click on search button");
        driver.findElement(button).click();
    }
    public void lowandhighprice(String data1,String data2 ){
        logger.info("Entering range to search product");
        driver.findElement(value1).sendKeys(data1);
        driver.findElement(value2).sendKeys(data2);
    }
    public void clikongo(){
        logger.info("search the product");
        driver.findElement(gobutton).click();
        logger.info("product searched successfully");
    }
    public void clickonmobilename(){
        driver.findElement(link).click();
    }


}
