package Telran.com.TraningTest;

import Telran.com.DataProviders;
import Telran.com.LogLog4j;
import Telran.com.Training.LoginRutPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by rut on 01.08.2016.
 */
public class LoginRutTest {

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public LoginRutPage loginRutPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        loginRutPage = PageFactory.initElements(driver, LoginRutPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
//        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        loginRutPage.openLoginPage();
    }

    @Test
    public void clickOnRegistrationNewUser() {
        Log.info("Clicking to add new user");
        loginRutPage.clickToAddNewUser();
    }
    @Test
    public void clickOnForgotPassword() {
        Log.info("Clicking to forgot password");
        loginRutPage.clickToForgotPassword();
    }

    //    @Test
    public void loginPositive() {

    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "loadNegativeLoginFromFileRut")
    public void loginNegative(String username, String password) {
        loginRutPage
                .fillUsernameField(username)
                .fillPasswordField(password)
                .clickToContinue();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
