import Pages.LoginPage;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.logging.Logger;

public class TC001_ValidateLoginSuccessful extends BaseTests{

    @Test
    public void testSuccessfulLogin()  {
        Logger logger = Logger.getLogger("TC001_ValidateLoginSuccessful.class");
        PropertyConfigurator.configure("C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\src\\main\\resources\\log4j.properties");
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
        logger.info("login successfull");
        //Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
    }

}

