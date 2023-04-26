import Pages.LoginPage;
import Pages.Searchmobile;
import org.testng.annotations.Test;

public class TC002_search extends BaseTests{

    @Test
    public void testSuccessfulLogin()  {
        Searchmobile search = new Searchmobile();

        search.search("oppomobiles");



        //Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
    }
}
