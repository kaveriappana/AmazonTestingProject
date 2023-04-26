import Pages.SearchmobileOnSnapDeal;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MobileSearch extends snapdeal{
    WebDriver driver;
    SearchmobileOnSnapDeal searchmobile =new SearchmobileOnSnapDeal();
//    @BeforeMethod
//    public void setUp(){searchmobile = new SearchmobileOnSnapDeal();
//    }
    @Test
    public void searchmobile() throws InterruptedException {
        Thread.sleep(3000);
        searchmobile.search("mobiles");
        searchmobile.inputrange("1000","2000");

    }

}
