import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;


public class BaseTests {
  WebDriver driver;

    static Properties prop=new Properties();

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\src\\main\\resources\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void close() {
        driver.quit();

    }
}
