import Pages.BuyAgain;
import Pages.LoginPage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC005_BuyAgainTab extends BaseTests {
    @Test
    public void buyagain(){
        BuyAgain buy = new BuyAgain(driver);
        LoginPage loginPage = new LoginPage(driver);
        buy.clickbuyagain();
        loginPage.enteremail("6301274046");
        loginPage.clickLoginButton();
        loginPage.enterpassword("Kaveri@123");
        loginPage.clicksignin();
        Reporter.log("This is test is to check fuctionality of buy again tab");
        Reporter.log("click lick buy again");
        Reporter.log("click your orders");
        Reporter.log("view your orders");
        buy.buylink();
        buy.yourorders();
        buy.vieworders();
    }

}
