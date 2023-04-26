package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

     WebDriver driver;
    private By emailField = By.cssSelector("input[type=email]");
    private By button =By.cssSelector("input[id=continue]");
   // private By hellosignin =By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    private By hellosignin = By.cssSelector("a[data-nav-ref=\"nav_ya_signin\"]");

    private By pass = By.cssSelector("input[id='ap_password']");
    private By sign =By.cssSelector("input[id='signInSubmit']");


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clicklink(){
        driver.findElement(hellosignin).click();
    }
    public void enteremail(String email)  {
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickLoginButton(){
        driver.findElement(button).click();

    }
    public void enterpassword(String password){
        driver.findElement(pass).sendKeys(password);
    }
    public void clicksignin(){
        driver.findElement(sign).click();
    }
}
