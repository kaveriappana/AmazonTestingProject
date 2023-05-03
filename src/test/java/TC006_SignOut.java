import Pages.LoginPage;
import Pages.SignOut;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC006_SignOut extends BaseTests{
    @Test
    public void signout(){
        SignOut signOut = new SignOut(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clicklink();
        loginPage.enteremail("6301274046");
        loginPage.clickLoginButton();
        loginPage.enterpassword("Kaveri@123");
        loginPage.clicksignin();
        Reporter.log("This test is to sign out from amazon website");
        Reporter.log("Hover on hello text");
        Reporter.log("click on sign out");
        Reporter.log("Sign out successfully done");
        signOut.hello();
        signOut.signout();

    }
}
