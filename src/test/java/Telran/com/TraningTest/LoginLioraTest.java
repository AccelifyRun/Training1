package Telran.com.TraningTest;



import Telran.com.DataProviders;
import Telran.com.Training.LoginLioraPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.util.logging.Logger;


/**
 * Created by Liora on 8/6/2016.
 */
public class LoginLioraTest {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName()) ;
    public static String registered_username = "5555Doctor";
    public static String registered_password = "LinkCare!!11";
    public LoginLioraPage loginLioraPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        loginLioraPage = PageFactory.initElements(driver, LoginLioraPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
//        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        loginLioraPage.openLoginPage();
    }

    @Test
    public void clickOnNewUserRegistration() {

        loginLioraPage.clickToAddNewUser();
        loginLioraPage.waitUntilRegPageIsLoaded();
    }

    @Test (dataProviderClass = DataProviders.class,dataProvider = "negativeLoginLiora")
    public void negativeLogin(String username,String password){
        loginLioraPage.fillUserNameField(username)
                .fillUserPasswordField(password)
                .clickLoginButton();
        Log.info("Check login validation");
    }

    @Test
    public void login(){
        loginLioraPage.fillUserNameField(registered_username)
                .fillUserPasswordField(registered_password)
                .clickLoginButton();
        Log.info("Login passed!");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
