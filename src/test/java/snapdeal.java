import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class snapdeal {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\src\\main\\resources\\chromedriver_win32 (3)\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");
        //driver.manage().window().maximize();
        System.out.println(driver.getTitle());


    }
    @AfterClass
    public void close() {
        driver.quit();

    }
}
