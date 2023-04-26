package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchmobile {
    private WebDriver driver;
  public By search = By.cssSelector("input[placeholder='Search Amazon']");
  public By button =By.cssSelector("#nav-search-submit-button");
  public void search(String name){
      driver.findElement(search).sendKeys(name);
      driver.findElement(button).click();


  }
}
