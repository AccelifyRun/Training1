package Telran.com.TraningTest;

import Telran.com.Training.LoginAfoninaPage;
import Telran.com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@org.testng.annotations.Listeners(FailTestScreenshotListener.class)
public class RegistrationAfoninaTests {
    // private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public static String registered_username = "3339Doctor";
    public static String registered_password = "LinkCare!!11";
    public LoginPage loginPage;
    public LoginAfoninaPage loginAfoninaPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        loginAfoninaPage = PageFactory.initElements(driver, LoginAfoninaPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
    }

    @Test
    public void test() {

       /* // Log.info("TestLoginWithExtData was started....");
       loginAfoninaPage.waitUntilRegisterHyperLinkIsLoaded();
        loginAfoninaPage.clickRegisterHyperLink();
        loginAfoninaPage.waitUntilAddNewUserIsLoaded();
        loginPage.clickToAddNewUser();
        loginPage.fillusernameField("Username");*/

        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }


    // test of clicking on Registration link are written in another class

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}