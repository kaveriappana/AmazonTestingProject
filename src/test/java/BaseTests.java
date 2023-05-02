import com.google.common.io.Files;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.io.*;
import java.util.Properties;

public class BaseTests {
    WebDriver driver;

    static Properties prop = new Properties();

    @Parameters("browsername")
    @BeforeClass
    public void setUp(String browsername) {
        Logger logger = Logger.getLogger("BaseTests.class");
        PropertyConfigurator.configure("C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\log4j.properties");
        logger.info("logging started");

        if(browsername.contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\src\\main\\resources\\chromedriver_win32 (3)\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browsername.contains("Edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\src\\main\\resources\\edgedriver_win64 (2)\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        String Baseurl = "https://www.amazon.com/";
        driver.get(Baseurl);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        String actualurl = driver.getCurrentUrl();
        if (actualurl.equals(Baseurl)) {
            System.out.println("Verification successfully : correct url is opened");
        } else {
            System.out.println("Verification failed : an incorrect url is opened");
            System.out.println("The correct url is : " + actualurl);
        }

    }

    @AfterClass
    public void close() {
        driver.quit();

    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            try {
                Files.move(screenshot, new File("C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\src\\main\\resources\\ScreenShots" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
