package Telran.com.TraningTest;

import Telran.com.DataProviders;
import Telran.com.Training.LoginLenaPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Lena on 8/18/2016.
 */
public class LoginLenaTest {
    //private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public static String login_userName = "userName";
    public static String login_password = "12345.com";
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public LoginLenaPage loginLenaPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        loginLenaPage = PageFactory.initElements(driver, LoginLenaPage.class);

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        loginLenaPage.openLoginPage();
    }

    @Test
    public void loginTest() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        loginLenaPage.waitUntilLoginButtonIsLoaded()
                .fillLoginUserName(login_userName)
                .fillLoginUserPassword(login_password)
                .clickLoginButton();
        Assert.assertTrue(loginLenaPage.isOnLoginPage(), "Somthing is wrong,we are not is on the doctor's page");
        Log.info("Login test");
    }

    //with Jacov
    @Test(dataProviderClass = DataProviders.class, dataProvider = "usersSimpleNeg")
    public void loginTestТNegativeDataProv(String login_userName, String login_password) {
        //driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        loginLenaPage.waitUntilLoginButtonIsLoaded()
                .fillLoginUserName(login_userName)
                .fillLoginUserPassword(login_password)
                .clickLoginButton();
        Assert.assertTrue(!loginLenaPage.isOnLoginPage(), "We are NOT is on the doctor's page");
        Log.info("Login test negative Data Providers");
    }

    @Test
    public void loginTestТNegative() {
        //driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        loginLenaPage.waitUntilLoginButtonIsLoaded()
                .fillLoginUserName(login_userName)
                .fillLoginUserPassword("")
                .clickLoginButton();
        Assert.assertTrue(!loginLenaPage.isOnLoginPage(), "We are NOT is on the doctor's page");
        Log.info("Login test negative");
    }
   /* @Test
    public  void openRegistrationPage(){
        loginLenaPage.clickRegisterUser()

    }*/

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
