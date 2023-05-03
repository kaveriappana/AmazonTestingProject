package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignOut {
    WebDriver driver;

    private By hello = By.cssSelector("a[data-csa-c-content-id='nav_youraccount_btn']");
    private By signout = By.linkText("Sign Out");

    public SignOut(WebDriver driver)
    {
        this.driver = driver;
    }
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("BuyAgain.class");
    public void hello(){
        logger.info("Hovering on hello text");
        WebElement ele = driver.findElement(hello);

        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }
    public void signout(){
        logger.info("Clicking sign out button");
        driver.findElement(signout).click();
        logger.info("sign out successfully done");
    }
}
