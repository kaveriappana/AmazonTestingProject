package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchOnAmazon {
    WebDriver driver;
    private By searchtext = By.cssSelector("input[placeholder='Search Amazon']");
    private By button = By.cssSelector("span[id='nav-search-submit-text']");
    private  By value1 =By.cssSelector("input[id='low-price']");
    private By value2 =By.cssSelector("input[id='high-price']");
    private By gobutton =By.cssSelector("input[aria-labelledby='a-autoid-1-announce']");

    private By link =By.linkText("Apple iPhone 12 Mini, 128GB, Black - Unlocked (Renewed)");

    public SearchOnAmazon(WebDriver driver)
    {
        this.driver = driver;
    }

    public void searchtext(String text){
        driver.findElement(searchtext).sendKeys(text);

    }
    public void clickonbutton(){
        driver.findElement(button).click();
    }
    public void lowandhighprice(String data1,String data2 ){
        driver.findElement(value1).sendKeys(data1);
        driver.findElement(value2).sendKeys(data2);
    }
    public void clikongo(){
        driver.findElement(gobutton).click();
    }
    public void clickonmobilename(){
        driver.findElement(link).click();
    }


}
