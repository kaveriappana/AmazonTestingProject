import Pages.LoginPage;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.logging.Logger;

public class TC001_ValidateLoginSuccessful extends BaseTests{

    @Test
    public void testSuccessfulLogin()  {
        Reporter.log("This is to login the amazon application");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clicklink();
        loginPage.enteremail("6301274046");
        Reporter.log("user phone number is 6301274046");
        loginPage.clickLoginButton();
        loginPage.enterpassword("Kaveri@123");
        Reporter.log("user entered password");
        loginPage.clicksignin();
        Reporter.log("User logged successfull");

    }

}

