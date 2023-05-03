package Pages;

import jdk.javadoc.doclet.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyAgain {
    WebDriver driver;

    private By orders = By.cssSelector("a[id='nav-orders']");
    private By buyagainlink =By.linkText("Buy Again");
    private By yourorder = By.linkText("Your Orders");
    private By view = By.linkText("View orders in 2023");

    public BuyAgain(WebDriver driver)
    {
        this.driver = driver;
    }
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("BuyAgain.class");
    public void clickbuyagain(){
        logger.info("Clicking Buy Again");
        driver.findElement(orders).click();
        logger.info("Clicked buy again tab");
        }
    public void buylink(){
        driver.findElement(buyagainlink).click();
    }
    public void yourorders(){
        logger.info("Clicking your orders");
        driver.findElement(yourorder).click();
        logger.info("Clicked your order");
    }
   public void vieworders(){
        logger.info("Clicking view orders");
        driver.findElement(view).click();
        logger.info("Clicked view orders");

   }
}
