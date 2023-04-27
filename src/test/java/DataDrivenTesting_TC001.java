import Pages.LoginPage;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.logging.Logger;

public class DataDrivenTesting_TC001 extends BaseTests{
    @Test(dataProvider = "empdataprovider")
    public void testSuccessfulLogin(String email, String pass)  {
        Logger logger = Logger.getLogger("TC001_ValidateLoginSuccessful.class");
        PropertyConfigurator.configure("C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\src\\main\\resources\\log4j.properties");
        Reporter.log("This  is to login the amazon application");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clicklink();
        loginPage.enteremail(email);
        Reporter.log("user phone number is 6301274046");
        loginPage.clickLoginButton();
        loginPage.enterpassword(pass);
        Reporter.log("user entered password");
        loginPage.clicksignin();
        Reporter.log("User logged successfull");
        logger.info("login successfull");

    }
    @DataProvider(name = "empdataprovider")
    @Test
    String[][] getEmpData() throws IOException
    {
        String path = "C:\\Users\\kaveri.appana\\IdeaProjects\\AmazonTestingProject\\src\\main\\resources\\TrainingPlan_SearchService _Kaveri (2).xlsx";
        int rownum = DatareadingFromExcel.getRowCount(path,"Sheet1");
        int colcount = DatareadingFromExcel.getCellCount(path, "Sheet1",1);
        String empdata[][] = new String[rownum][colcount];
        for(int i = 1; i <= rownum; i++)
        {
            for (int j =0 ; j < colcount; j++ )
            {
                empdata[i-1][j] = DatareadingFromExcel.getCellData(path, "Sheet1", i, j);
            }
        }
        return(empdata);
    }

}
