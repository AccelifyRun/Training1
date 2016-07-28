package Telran.com;

import Telran.com.Training.LoginAlicePage;
import Telran.com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@org.testng.annotations.Listeners(FailTestScreenshotListener.class)
public class LoginTests {
    // private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public static String registered_username = "3339Doctor";
    public static String registered_password = "LinkCare!!11";
    public LoginPage loginPage;
    public LoginAlicePage loginAlicePage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginAlicePage = PageFactory.initElements(driver, LoginAlicePage.class);
        driver = new ChromeDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {


    }

    @Test
    public void testLoginWithExtData() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il");
        // Log.info("TestLoginWithExtData was started....");
        loginPage.clickToAddNewUser();
        loginPage.fillusernameField("Username");
        loginAlicePage.fillUserFirstnameField("FirstName");
        loginAlicePage.clickDropdownNameField("2");
        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }


    // test of clicking on Registration link are written in another class

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}