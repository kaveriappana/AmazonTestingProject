package Pages;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class LoginPage {

     WebDriver driver;
    private By emailField = By.cssSelector("input[type=email]");
    private By button =By.cssSelector("input[id=continue]");
   // private By hellosignin =By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    private By hellosignin = By.cssSelector("a[data-nav-ref=\"nav_ya_signin\"]");

    private By pass = By.cssSelector("input[id='ap_password']");
    private By sign =By.cssSelector("input[id='signInSubmit']");

  //  Logger logger = Logger.getLogger("LoginPage.class");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("LoginPage.class");
    public void clicklink(){
        driver.findElement(hellosignin).click();
    }
    public void enteremail(String email)  {
        logger.info("Entering "+email+" in username field");
        driver.findElement(emailField).sendKeys(email);
        logger.info("Entered"+email+" in username field");

    }
    public void clickLoginButton(){
        logger.info("click continue button");
        driver.findElement(button).click();

    }
    public void enterpassword(String password){
        logger.info("Entering "+password+" in username field");
        driver.findElement(pass).sendKeys(password);
        logger.info("Entered "+password+" in username field");
    }
    public void clicksignin(){
        logger.info("Click signin button");
        driver.findElement(sign).click();
        logger.info("User logged successfully");
    }
}
