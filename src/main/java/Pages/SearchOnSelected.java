package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchOnSelected {
    WebDriver driver;
    private By searchin = By.cssSelector("select[aria-describedby='searchDropdownDescription'] option:nth-of-type(8)");
    private By searchitem  = By.cssSelector("input[placeholder='Search Amazon']");
    private By searchtext =By.cssSelector("span[id='nav-search-submit-text']");
    private By checkbox = By.xpath("//span[text()='HP']");
    private By lowprice= By.cssSelector("#low-price");
    private By highprice = By.cssSelector("#high-price");
    private By go =By.cssSelector(".a-button-input");
    private By linktoclick = By.linkText("HP Chromebook 11A G8 Education AMD A4-9120C 4GB 32GB eMMC 11.6-inch WLED HD Webcam Chrome OS");
    private By laptop = By.linkText("Laptops");
    private By text1 = By.linkText("HP Envy Laptops");
    private By linktext1 = By.linkText("Visit the HP Store");
    public SearchOnSelected(WebDriver driver)
    {
        this.driver = driver;
    }
    public void searchindropdown(){
        driver.findElement(searchin).click();
    }
    public void entertextinsearch(String text){
        driver.findElement(searchitem).sendKeys(text);
    }
    public void clickonsearch(){
        driver.findElement(searchtext).click();
    }
    public void clickcheckbox(){
      driver.findElement(checkbox).click();
    }
    public void enterlowandhighprice(String data1,String data2 ){
        driver.findElement(lowprice).sendKeys(data1);
        driver.findElement(highprice).sendKeys(data2);
    }
    public void clickgobutton(){

        driver.findElement(go).click();
    }
    public void  clicktext(){
        driver.findElement(linktoclick).click();
    }
    public void clicklink(){
         driver.findElement(linktext1).click();
    }
//    public void selectlaptop(){
//        driver.findElement(laptop).click();
//        driver.findElement(text1).click();
//    }


}
