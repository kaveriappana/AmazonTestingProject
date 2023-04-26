import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_ValidateLoginSuccessful extends BaseTests{

    @Test
    public void testSuccessfulLogin()  {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clicklink();
        loginPage.enteremail("6301274046");
        loginPage.clickLoginButton();
        loginPage.enterpassword("Kaveri@123");
        loginPage.clicksignin();
        //Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
    }
}

